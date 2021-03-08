<template>
  <div class="row">
    <Form :course="course" :is-edit="true"/>
  </div>
</template>

<script>
import axios from "axios"
import Form from "@/components/CourseForm.vue"

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
    Form
  }
}
</script>