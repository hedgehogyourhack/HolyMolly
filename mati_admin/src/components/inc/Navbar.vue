<template>
    <nav class="navbar navbar-expand-lg navbar-light bg-light">
        <div class="container">
            <router-link to="/" class="navbar-brand">Eventrio - Admin Panel</router-link>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent"
                    aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>

            <div class="collapse navbar-collapse" id="navbarSupportedContent">
                <ul class="navbar-nav ml-auto">
                    <li class="nav-item">
                        <router-link to="/" class="nav-link">Home</router-link>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link disabled" href="#">Disabled</a>
                    </li>
                    <li class="nav-item dropdown">
                        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button"
                           data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                            Admin
                        </a>
                        <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                            <router-link to="/admin" class="dropdown-item">Dashboard</router-link>
                        </div>
                    </li>
                </ul>
            </div>
        </div>
    </nav>
</template>

<script>
    export default {
        name: 'navbar',
    }
</script>