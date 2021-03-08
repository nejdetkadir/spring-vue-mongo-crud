<template>
  <div class="row">
    <Form :course="course" :is-edit="true"/>
  </div>
</template>

<script>
import Form from "@/components/CourseForm.vue"

export default {
  data() {
    return {
      course: {
        name: 'Edited name',
        description: 'Edited description',
        instructor: 'Edited instructor',
        goals: ["lorem", "ipsum","dolor"]
      }
    }
  },
  components: {
    Form
  }
}
</script>