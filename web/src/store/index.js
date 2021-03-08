import Vue from 'vue'
import Vuex from 'vuex'
import axios from 'axios'

Vue.use(Vuex)

axios.defaults.baseURL = process.env.VUE_APP_BASE_PATH || "http://localhost:3000"

const store = new Vuex.Store({
  state: {
    courses: []
  },
  mutations: {
    setCourses(state, courses) {
      state.courses = courses
    },
    addCourse(state, course) {
      state.courses.push(course)
    }
  },
  actions: {
    async fetchCourses({commit}) {
      const {data} = await axios.get('/courses')
      commit("setCourses", data);
    },
    async createCourse({commit}, course) {
      const {data} = await axios.post('/courses', course)
      if (data) commit("addCourse", data)
    },
    async updateCourse({dispatch}, course) {
      const {data} = await axios.put(`/courses`, course)
      if (data) dispatch("fetchCourses")
    }
  },
  modules: {}
})

export default async function init() {
  store.dispatch("fetchCourses")
  return store
}