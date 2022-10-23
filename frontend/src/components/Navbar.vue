<template>
  <div>
    <v-navigation-drawer permanent v-if="drawer" v-model="drawer" app color="gray" dark>
      <v-list-item>
        <v-list-item-content>
          <v-list-item-title class="text-h6">
            Navigation
          </v-list-item-title>
        </v-list-item-content>
      </v-list-item>
    
      <v-divider></v-divider>
    
      <v-list dense nav>
        <v-list-item v-for="item in items" :key="item.title" link>
          <v-list-item-icon>
            <v-icon>{{ item.icon }}</v-icon>
          </v-list-item-icon>
    
          <v-list-item-content>
            <v-list-item-title>{{ item.title }}</v-list-item-title>
          </v-list-item-content>
        </v-list-item>
      </v-list>
    </v-navigation-drawer>
    
    <v-app-bar app color="gray accent-4" dense dark>
      <v-app-bar-nav-icon @click="drawer = !drawer"></v-app-bar-nav-icon>
    
      <v-toolbar-title class="title">My Darkest Day</v-toolbar-title>
    </v-app-bar>
  </div>
</template>

<script>
export default {
  name: 'Navbar',

  data: () => ({
    drawer: null,
    items: [
      { title: 'Home', icon: 'mdi-view-dashboard' },
      { title: 'Projects', icon: 'mdi-application' },
      { title: 'About', icon: 'mdi-help-box' },
    ],
  }),
}

</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
  .title {
    font-family: 'Mansalva', cursive;
  }
</style>
