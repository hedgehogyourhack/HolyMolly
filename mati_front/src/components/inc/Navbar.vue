<template>
    <div>
        <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
            <div class="container">
                <router-link to="/" class="navbar-brand">Eventrio</router-link>
                <button class="navbar-toggler" type="button" data-toggle="collapse"
                        data-target="#navbarSupportedContent"
                        aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>

                <div class="collapse navbar-collapse" id="navbarSupportedContent">
                    <ul class="navbar-nav ml-auto">
                        <li class="nav-item">
                            <router-link to="/" class="nav-link">Home</router-link>
                        </li>
                        <li class="nav-item dropdown">
                            <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button"
                               data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                Events
                            </a>
                            <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                                <router-link to="/events" class="dropdown-item">Event list</router-link>
                                <router-link to="/create" class="dropdown-item">Create event</router-link>
                            </div>
                        </li>
                    </ul>
                </div>
            </div>
        </nav>
        <div id="nav-fix"></div>
    </div>
</template>

<script>
    export default {
        name: 'navbar',
    }
</script>

<style lang="scss" scoped>
    nav {
        position: fixed;
        top: 0;
        width: 100%;
        z-index: 10000;
    }
    #nav-fix{
        height: 56px;
    }
</style>