<template>
  <div>
    <v-app-bar
      color="gray accent-4"
      dense
      dark
    >
      <v-toolbar-title class="myFont">My Darkest Day</v-toolbar-title>

      <v-spacer></v-spacer>

      <v-btn icon @click="redirectToUrl('https://github.com/simisimon')">
        <v-icon>mdi-github</v-icon>
      </v-btn>

      <v-btn icon @click="redirectToUrl('https://twitter.com/SimiSimon17')">
        <v-img src="../assets/twitter-white.png" max-height="22" max-width="22"></v-img>
      </v-btn>

      <v-btn icon @click="redirectToUrl('https://www.linkedin.com/in/sebastian-simon-8baa75191/')">
        <v-icon>mdi-linkedin</v-icon>
      </v-btn>

      <v-btn icon @click="redirectToUrl('https://www.xing.com/profile/Sebastian_Simon65/cv')" >
        <v-icon>mdi-xing</v-icon>
      </v-btn>

      <v-btn icon>
        <v-icon>mdi-home</v-icon>
      </v-btn>
    </v-app-bar>
  </div>
</template>

<script>
export default {
  name: 'Navbar',

  methods: {
    redirectToUrl(url) {
      window.location = url;
    },  
  }
}

</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
.myFont {
  font-family: 'Mansalva', cursive;
}
</style>
