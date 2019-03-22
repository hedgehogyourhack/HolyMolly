import Vue from 'vue';
import Router from 'vue-router';
import adminDashboard from './views/admin/Dashboard.vue';
import home from './views/Home.vue';

Vue.use(Router);

export default new Router({
    mode: 'history',
    base: process.env.BASE_URL,
    routes: [
        {
            path: '/',
            name: 'home',
            component: home,
        },
        {
            path: '/admin',
            name: 'home',
            component: adminDashboard
        },
    ]
});
