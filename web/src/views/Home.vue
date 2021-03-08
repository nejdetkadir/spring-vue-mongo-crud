<template>
  <div class="row">
      <Course :course="course" v-for="(course, index) in courses" :key="index"/>
  </div>
</template>

<script>
import { mapState } from 'vuex'
import Course from "@/components/CourseCard"

export default {
  computed: {
    ...mapState(["courses"])
  },
  components: {
    Course
  }
}
</script>