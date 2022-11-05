<template>
    <div class="wrapper">
        <div class="main-container">
            <div class="first">
                <div class="profile">
                    <img src="../assets/profilbild_sws.jpg" alt="">
                    <h3>Sebastian Simon</h3>
                    <p>M.Sc. Computer Science</p>
                </div>
                <div class="social-links">
                    <div class="link">
                        <a href="https://github.com/simisimon">
                            <img src="../assets/github.svg" alt="">
                        </a>
                        <a href="https://twitter.com/SimiSimon17">
                            <img src="../assets/twitter.svg" alt="">
                        </a>
                        <a href="https://www.linkedin.com/in/sebastian-simon-8baa75191/">
                            <img src="../assets/linkedin.svg" alt="">
                        </a>
                        <a href="https://www.xing.com/profile/Sebastian_Simon65/cv">
                            <img src="../assets/xing.svg" alt="">
                        </a>
                        <a href="mailto:Bastisimon95@googlemail.com">
                            <img src="../assets/gmail.svg" alt="">
                        </a>
                    </div>
                </div>
            </div>
            <div class="second">
                <div class="about">
                    <h1 style="text-align: center; margin-bottom: 15px;">About Me</h1>
                    <p>
                    I'm a Ph.D. student and a research assistant at the Chair of Software Systems at Leipzig University.
                    My research interests include configurable software systems, configuration dependencies, and the configuration of machine learning projects and experiments. 
                    Specifically, I'm interested in taming configuration problems caused by the large number of different technologies incorporated in todays software development.
                    I received my B.Sc. in 2018 and M.Sc. in 2020 from the Otto-von-Guericke University of Magdeburg.
                    </p>
                </div>
                <div class="technology-stack">
                    <h2>Technology Stack</h2>
                    <div class="languages">
                        <h3>Programming Languages</h3>
                        <div class="logo">
                            <img src="../assets/technologies/python.svg" alt="">
                            <img src="../assets/technologies/javascript.svg" alt="">
                            <img src="../assets/technologies/csharp.svg" alt="">
                        </div>
                    </div>
                    <div class="frameworks">
                        <h3>Frameworks</h3>
                        <div class="logo">
                            <img src="../assets/technologies/vuedotjs.svg" alt="">
                            <img src="../assets/technologies/spring.svg" alt="">
                            <img src="../assets/technologies/springboot.svg" alt="">
                        </div>
                    </div>
                    <div class="others">
                        <h3>Others</h3>
                        <div class="logo">
                            <img src="../assets/technologies/latex.svg" alt="">
                            <img src="../assets/technologies/microsoftpowerpoint.svg" alt="">
                            <img src="../assets/technologies/microsoftexcel.svg" alt="">
                            <img src="../assets/technologies/unity.svg" alt="">
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</template>

<script>

export default {
    name: 'About',
}



</script>

<style scoped>
.wrapper {
        padding: 10px;
        display: flex;
        justify-content: center;
    }

    .main-container {
        display: flex;
        flex-direction: row;
        border-radius: 25px;
        border-radius: 25px;
        width: 60%;
        
    }

    .first {
        padding: 5px;
        width: 20%;
        border-radius: 25px;
    }

    .second {
        padding: 1.5%;
        width: 80%;
        border-radius: 25px;
    }

    .profile {
        text-align: center;
        padding: 10px;
    }

    .profile img {
        height: 15rem;
        border-radius: 25%;
        padding: 5px;
    }

    .social-links {
        display: flex;
        flex-direction: row;
        justify-content: center;
    }

    .link a {
        text-decoration: none;
        color: black;
        font-size: 12px;
    }

    .link img {
        height: 2rem;
        margin: 7.5px;

    }

    .about {
        text-align: left;
    }

    .technology-stack {
        text-align: center;
        padding: 10px;
    }

    .logo {
        margin: 5px;
    }

    .logo img {
        height: 2rem;
        margin: 7.5px;
        margin-top: 15px;
    }

    .logo v-img {
        height: 2rem;
        margin: 7.5px;
        margin-top: 15px;
    }

    .projects {
        text-align: center;
        display: flex;
        flex-direction: row;
        justify-content: center;
        align-items: center;
    }

    .project-button  {
        margin: 5px;
        background-color: darkgray;
        padding: 5px;
        margin: 5px;
        border-radius: 15px;
        font-size: 20px;
    }

    .project-button a {
        text-decoration: none;
        color: #2c3e50;
    }

    @media only screen and (max-width: 950px) {
        .main-container {
            width: 95%;
        }
        
    }

    .languages {
        margin-top: 10px;
    }
</style>