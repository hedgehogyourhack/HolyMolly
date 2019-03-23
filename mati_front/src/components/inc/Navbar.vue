<template>
    <div>
        <nav class="navbar navbar-expand-lg navbar-dark bg-dark" v-bind:class="{'home': homepage}">
            <div v-bind:class="{'container' : !homepage, 'container-fluid': homepage}">
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
                            <a class="nav-link dropdown-toggle" href="#" role="button"
                               data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                User
                            </a>
                            <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                                <router-link to="/auth/register" class="dropdown-item">Register</router-link>
                            </div>
                        </li>
                        <li class="nav-item dropdown">
                            <a class="nav-link dropdown-toggle" href="#" role="button"
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
        <div id="nav-fix" v-if="!homepage"></div>
    </div>
</template>

<script>
    export default {
        name: 'navbar',
        props: ['homepage'],
    }
</script>

<style lang="scss" scoped>
    nav {
        position: fixed;
        top: 0;
        width: 100%;
        z-index: 10000;
        transition: 0.3s all;
        &.home {
            background-color: transparent !important;
            box-shadow: unset !important;
            .navbar-brand {
                font-size: 3rem;
            }
            &.scrolled {
                background-color: #0d0d0d !important;
                box-shadow: 0 4px 2px -2px #0a0a0a !important;

                .navbar-brand {
                    font-size: 1.5rem;
                }
            }
        }
    }

    #nav-fix {
        height: 56px;
    }
</style>