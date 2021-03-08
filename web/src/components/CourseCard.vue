<template>
  <div :class="{'col-md-3 p-3' : !showDetails, 'col-md-8 mx-auto' : showDetails}">
    <div class="card shadow bg-body rounded">
      <div class="card-body">
        <h5 class="card-title">{{course.name}}</h5>
        <h6 class="card-subtitle mb-2 text-muted">{{course.instructor}}</h6>
        <p class="card-text">{{course.description}}</p>
        <router-link :to="`/course/${course.id}`" class="card-link btn btn-primary btn-sm" v-if="!showDetails">View</router-link>
        <router-link :to="`/edit/${course.id}`" class="card-link btn btn-warning btn-sm">Edit</router-link>
        <button class="btn btn-danger btn-sm card-link" @click.prevent="removeCourse(course)">Delete</button>
      </div>
      <ul class="list-group list-group-flush" v-if="showDetails">
        <li class="list-group-item" v-for="(goal, index) in course.goals" :key="index">{{goal}}</li>
      </ul>
    </div>
  </div>
</template>

<script>
export default {
  methods: {
    removeCourse(course) {
      console.log(course);
    }
  },
  props: {
    course: {
      type: Object,
      required: true
    },
    showDetails: {
      type: Boolean,
      default: false
    }
  }
}
</script>