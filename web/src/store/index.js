import Vue from 'vue'
import Vuex from 'vuex'
import axios from 'axios'

Vue.use(Vuex)

axios.defaults.baseURL = process.env.VUE_APP_BASE_PATH || "http://localhost:3000"
axios.defaults.withCredentials = true

const store = new Vuex.Store({
  state: {},
  mutations: {},
  actions: {},
  modules: {}
})

export default async function init() {
  return store
}