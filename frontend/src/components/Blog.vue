<template>
    <div class="main-container">
        <div class="intro">

        </div>
        <div class="recent-posts">
            <div class="container">

                

            </div>
        </div>
    </div>
</template>

<script>
export default {
    name: 'Navbar',

    data: () => ({
        drawer: null,
        posts: [
            { title: 'This is my first blog post', img: '', tags: ["sport", "fitness"], content: "Lorem ipsum", author: "Sebastian Simon"},
            { title: 'This is my second blog post', img: '', tags: ["gaming", "computer"], content: "Lorem ipsum", author: "Sebastian Simon"},
            { title: 'This is my third blog post', img: '', tags: ["real life story"], content: "Lorem ipsum", author: "Sebastian Simon" },
            { title: 'This is my fourth blog post', img: '', tags: ["test"], content: "Lorem ipsum", author: "Sebastian Simon" },
            { title: 'This is my sixth blog post', img: '', tags: ["test"], content: "Lorem ipsum", author: "Sebastian Simon" },
        ],
    }),
}

</script>

<style>

</style>