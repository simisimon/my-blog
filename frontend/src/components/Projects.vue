<template>
    <div class="main-container">
        <div class="project-card" v-for="project in this.projectData.projects" v-bind:key="project">
            <div class="link">
                <h2>{{ project.title }}</h2>
                <a :href="project.link">
                    <img src="../assets/github.svg" alt="">
                </a>
            </div>
            <img :src="project.img" alt="">
            <p>{{ project.about}}</p>
        </div>
    </div>

</template>

<script>
import jsonData from '../projects.json';
export default {

    data: () => ({
        projectData: jsonData
    }),
}
</script>

<style>

    .main-container {
        display: flex;
        justify-content: center;
        align-items: center;
        flex-wrap: wrap;
    }

    .project-card {
        padding: 10px;
        flex-wrap: 0 0 40%;
        margin: 10px;        
        background-color: white;
        border-radius: 25px;
        box-shadow: rgba(0, 0, 0, 0.24) 0px 3px 8px;
    }

    .project-card img {
        height: 10rem;
    }

    .link {
        display: flex;
        flex-direction: row;
        align-items: center;
        justify-content: center;
    }

    .link img {
        height: 1.5rem;
        margin-left: 10px;
    }

</style>