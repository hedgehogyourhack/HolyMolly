<template>
    <div>
        <navbar :homepage="false"></navbar>
        <div class="events container my-5">
            <div class="card mb-4" v-for="event in events" v-bind:key="event.id">
                <div class="card-header">
                    <h3 class="m-0">
                        #{{event.id}} | {{event.name}}
                    </h3>
                </div>
                <div class="card-body">
                    <p class="mb-0">
                        <span class="badge badge-info mr-1" :style="{backgroundColor:tag.color + ' !important'}" v-for="tag in event.tags" v-bind:id="tag.id">{{tag.name}}</span><br>
                        {{event.dateBeg}} - {{event.dateEnd}}
                    </p>
                    <small class="mb-0">
                        Publi - {{event.publi}} | Status - {{event.status}}
                    </small>
                </div>
            </div>
        </div>
    </div>
</template>

<script>
    import Navbar from "../components/inc/Navbar";
    export default {
        name: 'events',
        components: {Navbar},
        data() {
            return {
                events: {},
            }
        },
        created() {
            this.getEvents();
        },
        methods: {
            getEvents() {
                fetch('http://10.200.3.218:8090/api/events')
                    .then(res => res.json()).then(data => this.events = data);
            }
        }
    }
</script>