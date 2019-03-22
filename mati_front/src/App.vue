<template>
    <div id="app">

        <navbar></navbar>

        <div class="container my-4">

            <router-view/>

        </div>

    </div>
</template>
<script>
    import navbar from "./components/inc/Navbar";
    export default {
        components: {navbar}
    }
</script>