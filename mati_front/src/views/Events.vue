<template>
    <div class="events">
        <div class="card mb-4" v-for="event in events" v-bind:key="event.id">
            <div class="card-header">
                <h3 class="m-0">
                    #{{event.id}} | {{event.name}}
                </h3>
            </div>
            <div class="card-body">
                <p class="mb-0">
                    {{event.dateBeg}} - {{event.dateEnd}}
                </p>
                <small class="mb-0">
                    Publi - {{event.publi}} | Status - {{event.status}}
                </small>
            </div>
        </div>
    </div>
</template>

<script>
    export default {
        name: 'events',
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
                fetch('http://10.200.3.218:8080/api/events')
                    .then(res => res.json()).then(data => this.events = data);
            }
        }
    }
</script>