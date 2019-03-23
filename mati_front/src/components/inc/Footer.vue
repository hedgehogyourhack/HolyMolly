<template>
    <footer class="p-5">

        <div class="container pt-5">
            <p class="m-0 text-right">
                Made by Jeż+1 2019 &copy;
            </p>
        </div>

    </footer>
</template>

<script>
    export default {
        name: 'footaer',
    }
</script>

<style lang="scss">
    footer{
        /*//background: linear-gradient(30deg, #D22F40, #190528) !important;*/
        -webkit-clip-path: polygon(0 0, 100% 28%, 100% 100%, 0 100%);
        clip-path: polygon(0 0, 100% 28%, 100% 100%, 0 100%);
        color: white;
    }
</style>