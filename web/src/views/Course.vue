<template>
  <div class="row">
    <Course :course="course" :show-details="true"/>
  </div>
</template>

<script>
import axios from "axios"
import Course from "@/components/CourseCard"

export default {
  data() {
    return {
      course: {}
    }
  },
  created() {
    axios.get(`/courses/${this.$route.params.id}`).then(res => {
      if(res.data) {
        this.course = res.data
      } else {
        this.$router.push('/?unknownCourse=1')
      }
    })
  },
  components: {
    Course
  }
}
</script>
