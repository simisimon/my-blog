<template>
  <div>
    <v-app-bar
      color="gray accent-4"
      dense
      dark
    >
      <v-toolbar-title class="myFont">My Darkest Day</v-toolbar-title>

      <v-spacer></v-spacer>

      <v-btn icon>
        <v-icon>mdi-home</v-icon>
      </v-btn>

      <v-btn icon>
        <v-icon>mdi-account-card-outline</v-icon>
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
