<template>
  <v-app>
    <Navbar/>
    <v-main>
      <About />
      <ProjectCard />
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
    drawer: null,
    items: [
      { title: 'Home', icon: 'mdi-view-dashboard' },
      { title: 'Projects', icon: 'mdi-application' },
      { title: 'About', icon: 'mdi-help-box' },
    ],
  }),
};
</script>
