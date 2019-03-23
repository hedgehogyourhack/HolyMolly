import Vue from 'vue';
import Router from 'vue-router';
import createEvent from './views/CreateEvent.vue';
import home from './views/Home.vue';
import events from './views/Events.vue';
import register from './views/auth/Register.vue';

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
            path: '/events',
            name: 'events',
            component: events,
        },
        {
            path: '/create',
            name: 'create event',
            component: createEvent
        },
        {
            path: '/auth/register',
            name: 'register',
            component: register,
        },
    ]
});
