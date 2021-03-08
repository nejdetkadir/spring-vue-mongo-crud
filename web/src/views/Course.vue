<template>
  <div class="row">
    <Course :course="course" :showDetails="true"/>
  </div>
</template>

<script>
import Course from "@/components/CourseCard"

export default {
  data() {
    return {
      course: {
        id: "1",
        name: "Course 1",
        description: "Course 1 description",
        instructor: "Instructor",
        goals: ["lorem", "ipsum", "dolor"]
      }
    }
  },
  components: {
    Course
  }
}
</script>
