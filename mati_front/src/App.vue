<template>
    <div id="app">

        <router-view/>

        <footaer></footaer>

    </div>
</template>

<script>
    import navbar from "./components/inc/Navbar";
    import Footaer from "./components/inc/Footer";

    export default {
        components: {Footaer}
    }
</script>

<style>
    @font-face {
        font-family: 'VarelaRound';
        src: url("./assets/VarelaRound-Regular.ttf");
    }
    .invert{
        filter: invert(100%);
    }
    .text-black{
        color: black !important;
    }
    *{
        font-family: VarelaRound !important;
    }
    body{
        /*//background: url("./assets/smoke3.png");*/
        background: url("./assets/ludzie.png");
        background-position: bottom;
        background-repeat: no-repeat;
        background-size: contain;
    }
    .card-header{
        background: linear-gradient(30deg, #D22F40, #190528) !important;
        color: #fff;
        font-weight: 800;
    }
</style>