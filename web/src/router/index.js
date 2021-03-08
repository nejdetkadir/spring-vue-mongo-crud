import Vue from 'vue'
import VueRouter from 'vue-router'
import Home from '../views/Home.vue'
import Course from '../views/Course.vue'
import Edit from '../views/Edit.vue'
import New from '../views/New.vue'

Vue.use(VueRouter)

export default function init(store) {
  console.log(store);
  return new VueRouter({
    mode: 'history',
    base: process.env.BASE_URL,
    routes: [
      {
        path: '/',
        name: 'Home',
        component: Home
      },
      {
        path: '/course/:id',
        name: 'Course',
        component: Course
      },
      {
        path: '/edit/:id',
        name: 'Edit',
        component: Edit
      },
      {
        path: '/new',
        name: 'New',
        component: New
      }
    ]
  })
}
