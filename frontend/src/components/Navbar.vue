<template>
  <div>
    <v-navigation-drawer permanent v-if="drawer" v-model="drawer" app>
      <v-list-item>
        <v-list-item-content>
          <v-list-item-title class="text-h6">
            My Darkest Day
          </v-list-item-title>
        </v-list-item-content>
      </v-list-item>
    
      <v-divider></v-divider>
    
      <v-list dense nav>
        <v-list-item v-for="item in items" :key="item.title" link @click="$router.push({ path: item.route})">
          <v-list-item-icon>
            <v-icon>{{ item.icon }}</v-icon>
          </v-list-item-icon>
    
          <v-list-item-content>
            <v-list-item-title>{{ item.title }}</v-list-item-title>
          </v-list-item-content>
        </v-list-item>
      </v-list>
    </v-navigation-drawer>
    
    <v-app-bar 
      app 
      shrink-on-scroll 
      src="moon_header.jpg"
      prominent
    >
      <v-app-bar-nav-icon @click="drawer = !drawer" color="white"></v-app-bar-nav-icon>

      <v-spacer></v-spacer>

    </v-app-bar>
  </div>
</template>

<script>
export default {
  name: 'Navbar',

  data: () => ({
    drawer: null,
    items: [
      { title: 'Home', icon: 'mdi-view-dashboard', route: "/" },
      { title: 'Projects', icon: 'mdi-application', route: "/projects" },
      { title: 'About', icon: 'mdi-account', route: "/about"},
    ],
  }),
}

</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
  .title {
    font-family: 'Mansalva', cursive;
    color: white;
  }
</style>
