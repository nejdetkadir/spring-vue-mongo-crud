<template>
  <div class="col-md-8 mx-auto">
    <div class="card">
      <div class="card-body">
        <form>
          <h1 class="text-center">{{isEdit ? 'Edit' : 'Save'}} Course</h1>
          <div class="mb-3">
            <label class="form-label">Course name</label>
            <input type="text" v-model.trim="course.name" class="form-control">
          </div>
          <div class="mb-3">
            <label class="form-label">Course description</label>
            <textarea class="form-control" v-model.trim="course.description" rows="3"></textarea>
          </div>
          <div class="mb-3">
            <label class="form-label">Course Instructor</label>
            <input type="text" v-model.trim="course.instructor" class="form-control">
          </div>
          <div class="mb-3" v-if="course.goals">
            <ul class="list-group">
              <li class="list-group-item d-flex justify-content-between align-items-center" v-for="(goal, index) in course.goals" :key="index">
                {{goal}}
                <button class="btn btn-danger btn-sm" @click.prevent="removeGoal(index)">Remove</button>
              </li>
            </ul>
          </div>
          <div class="input-group mb-3">
            <input type="text" class="form-control" v-model="goalText" placeholder="Course goal">
            <button class="btn btn-outline-success" @click.prevent="addGoal">Add Goal</button>
          </div>
          <button @click.prevent="onSaveForm" class="btn" :class="{'btn-success' : !isEdit, 'btn-primary' : isEdit}">{{isEdit ? 'Edit' : 'Save'}}</button>
        </form>  
      </div>
    </div>  
  </div>
</template>

<script>
import { mapActions } from 'vuex'

export default {
  data() {
    return {
      goalText: '',
    }
  },
  methods: {
    ...mapActions(['createCourse']),
    addGoal() {
      this.course.goals.push(this.goalText)
      this.goalText = ''
    },
    removeGoal(index) {
      this.course.goals.splice(index, 1)
    },
    onSaveForm() {
      try {
        if(!this.isEdit) {
          this.createCourse(this.course)
          this.$router.push('/?createCourse=1')
        }
      } catch (error) {
        this.$route.push('/?createCourseError=1')
      }
      
    }
  },
  props: {
    course: {
      type: Object,
      default: () => {
        return {
          name: '',
          description: '',
          instructor: '',
          goals: []
        }
      }
    },
    isEdit: {
      type: Boolean,
      default: false
    }
  }
}
</script>