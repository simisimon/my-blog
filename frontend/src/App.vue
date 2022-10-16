<template>
  <v-app>
    <Navbar></Navbar>
    <v-main>
      <About/>
      <ProjectCard/>
    </v-main>
  </v-app>
</template>

<script>

import Navbar from './components/Navbar';
import About from './components/About';
import ProjectCard from './components/ProjectCards.vue';

export default {
  name: 'App',

  components: {
    Navbar,
    About,
    ProjectCard,
},

  data: () => ({
    //
  }),
};
</script>
