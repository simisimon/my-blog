<template>
  <v-app>
    <Navbar></Navbar>
    <v-main>
      <HelloWorld/>
    </v-main>
  </v-app>
</template>

<script>

import Navbar from './components/Navbar';

export default {
  name: 'App',

  components: {
    Navbar,
  },

  data: () => ({
    //
  }),
};
</script>
