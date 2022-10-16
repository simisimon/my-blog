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
                    <p>Lorem ipsum dolor sit amet consectetur, adipisicing elit. Molestias, voluptate officiis.
                        Mollitia dolorum perferendis iusto aliquid distinctio at quibusdam dicta,
                        necessitatibus maxime ipsam doloremque aspernatur! Distinctio officiis quis dicta. Asperiores!
                    </p>
                </div>
                <div class="technology-stack">
                    <h2>Technology Stack</h2>
                    <div class="logo">
                        <img src="../assets/python.svg" alt="">
                        <img src="../assets/javascript.svg" alt="">
                        <img src="../assets/vuedotjs.svg" alt="">
                        <img src="../assets/spring.svg" alt="">
                    </div>
                </div>
                <div class="projects">
                    <div class="project-button">
                        <a href="https://github.com/simisimon/RepoMiner">RepoMiner</a>
                    </div>
                    <div class="project-button">
                        <a href="">Test</a>
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
        padding: 20px;
        display: flex;
        justify-content: center;
    }

    .main-container {
        display: flex;
        flex-direction: row;
        border-radius: 25px;
        background-color: aquamarine;
        border-radius: 25px;
        width: 60%;
        
    }

    .first {
        background-color: lightcoral;
        padding: 2.5%;
        width: 20%;
        border-radius: 25px;

    }

    .second {
        background-color: lightgray;
        padding: 2.5%;
        width: 80%;
        border-radius: 25px;
    }

    .profile {
        text-align: center;
    }

    .profile img {
        height: 5rem;
        border-radius: 50%;
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

    .logo img {
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

</style>