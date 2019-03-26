<template>
    <div>
        <navbar :homepage="false"></navbar>
        <div class="create-event container my-5">

            <div class="card">
                <div class="card-header p-4">
                    <h1 class="m-0 text-right">
                        Create new event
                    </h1>
                </div>
                <div class="card-body p-0">
                    <div class="row m-0">
                        <div class="col-md-6 poster">
                        </div>
                        <div class="col-md-6 p-4">
                            <div class="form-group">
                                <label for="ename">Event name:</label>
                                <input type="text" class="form-control" id="ename" placeholder="Event name" name="ename"
                                       required v-model="newEvent.name">
                            </div>
                            <div class="form-group">
                                <div class="row">
                                    <div class="col-lg-12">
                                        <label class="control-label" for="sdate">Start date</label>
                                    </div>
                                    <div class="col-lg-5">
                                        <input class="form-control date" id="sdate" name="sdate" placeholder="MM/DD/YYY"
                                               type="date"
                                               required v-model="newEvent.date_beg">
                                    </div>
                                    <div class="col-lg-3">
                                        <input class="form-control" placeholder="HH" type="number" required
                                               v-model="newEvent.date_begH" min="0" max="23">
                                    </div>
                                    <div class="col-lg-1">
                                        <p class="m-0 h4 text-center">
                                            :
                                        </p>
                                    </div>
                                    <div class="col-lg-3">
                                        <input class="form-control" placeholder="MM" type="number" required
                                               v-model="newEvent.date_begM" min="0" max="59">
                                    </div>
                                </div>
                            </div>
                            <div class="form-group">
                                <div class="row">
                                    <div class="col-lg-12">
                                        <label class="control-label" for="sdate">End date</label>
                                    </div>
                                    <div class="col-lg-5">
                                        <input class="form-control date" id="sdate" name="sdate" placeholder="MM/DD/YYY"
                                               type="date"
                                               required v-model="newEvent.date_end">
                                    </div>
                                    <div class="col-lg-3">
                                        <input class="form-control" placeholder="HH" type="number" required
                                               v-model="newEvent.date_endH" min="0" max="23">
                                    </div>
                                    <div class="col-lg-1">
                                        <p class="m-0 h4 text-center">
                                            :
                                        </p>
                                    </div>
                                    <div class="col-lg-3">
                                        <input class="form-control" placeholder="MM" type="number" required
                                               v-model="newEvent.date_endM" min="0" max="59">
                                    </div>
                                </div>
                            </div>
                            <div class="form-group">
                                <label for="eaddress">Event address:</label>
                                <input type="text" class="form-control" id="eaddress" placeholder="Event address:"
                                       name="eaddress"
                                       required v-model="newEvent.address">
                            </div>
                            <div class="form-group">
                                <label for="edescription">Event description:</label>
                                <textarea class="form-control description" rows="5" id="edescription" v-model="newEvent.description"></textarea>
                            </div>
                            <div class="form-group">
                                <label for="etags">Event tags:</label>
                                <select multiple class="form-control" v-model="newEvent.tags">
                                    <option :value="tag.id" v-for="tag in tags">{{tag.name}}</option>
                                </select>
                            </div>
                            <div class="form-group">
                                <label for="etags">Status:</label>
                                <input type="number" class="form-control" id="etags" placeholder="Event name"
                                       name="etags"
                                       required v-model="newEvent.status">
                            </div>
                            <div class="form-group">
                                <label for="etags">Level:</label>
                                <input type="number" class="form-control" id="etags" placeholder="Event name"
                                       name="etags"
                                       required v-model="newEvent.level">
                            </div>
                            <div class="form-group">
                                <div class="file-field">
                                    <div class="btn btn-primary btn-sm">
                                        <span class="pr-2">Choose files</span>
                                        <input type="file" multiple>
                                    </div>
                                </div>
                            </div>
                            <div class="form-group form-check">
                                <label class="form-check-label">
                                    <input class="form-check-input" type="checkbox" name="marketing"
                                           v-model="newEvent.publi">
                                    Public
                                </label>
                            </div>
                            <button type="submit" class="btn btn-primary" @click="addEvent()">Create event</button>

                        </div>
                    </div>
                </div>
            </div>


        </div>
    </div>
</template>

<script>

    import Navbar from "../components/inc/Navbar";

    export default {
        name: 'createEvent',
        components: {Navbar},
        data() {
            return {
                tags: [],
                newEvent: {
                    name: '',
                    address: '',
                    date_beg: '',
                    date_begH: 0,
                    date_begM: 0,
                    date_end: '',
                    date_endH: 0,
                    date_endM: 0,
                    level: 0,
                    lat: '',
                    lng: '',
                    description: '',
                    publi: 0,
                    tags: '',
                    status: 0,
                }
            }
        },
        created() {
            this.getTags();
        },
        methods: {
            getTags() {
                fetch('http://10.200.3.218:8090/api/tags').then(res => res.json()).then(data => this.tags = data);
            },
            addEvent() {

                fetch('https://api.mapbox.com/geocoding/v5/mapbox.places/' + this.newEvent.address + '.json?access_token=pk.eyJ1IjoibXZ0dGhldyIsImEiOiJjanRrcXp5b3AxNzlnNDNuenh4eDdzMTM2In0.4aymvKsy1qurOY43bB8tWw', {
                    method: 'GET',
                }).then(res => res.json()).then(data => {
                    console.log(data.features[0].center[0]);
                    this.newEvent.lng = data.features[0].center[0];
                    this.newEvent.lat = data.features[0].center[1];

                    const dateBeg = new Date(this.newEvent.date_beg);
                    const dateEnd = new Date(this.newEvent.date_end);


                    const formData = new FormData();
                    formData.append('name', this.newEvent.name);
                    formData.append('address', this.newEvent.address);
                    formData.append('user', 1);
                    formData.append('dateBeg', new Date(dateBeg.getTime() + parseInt(this.newEvent.date_begH) * 60 * 60 * 1000 + parseInt(this.newEvent.date_begM) * 60 * 1000).toISOString());
                    formData.append('dateEnd', new Date(dateEnd.getTime() + parseInt(this.newEvent.date_endH) * 60 * 60 * 1000 + parseInt(this.newEvent.date_endM) * 60 * 1000).toISOString());
                    formData.append('lat', this.newEvent.lat);
                    formData.append('lng', this.newEvent.lng);
                    formData.append('publi', this.newEvent.publi);
                    formData.append('description', this.newEvent.description);
                    formData.append('tags', this.newEvent.tags);
                    formData.append('lvl', this.newEvent.level);
                    formData.append('status', this.newEvent.status);

                    fetch('http://10.200.3.218:8090/api/events/add', {
                        method: 'POST',
                        mode: 'no-cors',
                        body: formData,
                    }).then(() => {
                        // this.newEvent.name = '';
                        // this.newEvent.address = '';
                        // this.newEvent.date_beg = '';
                        // this.newEvent.date_end = '';
                        // this.newEvent.lat = '';
                        // this.newEvent.lng = '';
                        // this.newEvent.publi = 1;
                        // this.newEvent.status = 0;
                    });

                });


            }
        }
    }

</script>

<style>
    .description {
        overflow-y: scroll;
        min-height: 200px;
        max-height: 200px;
    }

    .date:focus {
        box-shadow: 0px 0px 5px -1px #F05D4B !important;
        border: 1px solid #F05D4B !important;
    }

    .description::-webkit-scrollbar {
        width: 12px;
        background-color: #F5F5F5;
        border-radius: 2px;
    }

    .description::-webkit-scrollbar-thumb {
        border-radius: 10px;
        background-color: #56032B;
    }

    .form-control:focus {
        box-shadow: 0px 0px 5px 0px #56032B;
        border: 1px solid #56032B;
    }

    .btn.btn-primary {
        background-color: #99153D !important;
    }

    .poster {
        background-image: url("../assets/poster.jpg");
        background-size: cover;
        background-position: center;
    }
</style>