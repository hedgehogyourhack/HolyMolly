<template>
    <div class="pb-5 mb-5">
        <navbar></navbar>
        <div class="container">
            <div class="row pb-5 mb-1">
                <div class="col-lg-6"></div>
                <div class="col-lg-6">
                    <h1 class="my-5">
                        Register form
                    </h1>
                    <div class="form-group">
                        <input class="form-control" type="email" placeholder="E-mail" v-model="email">
                    </div>
                    <div class="form-group">
                        <input class="form-control" type="text" placeholder="Pseudonym" v-model="pseudonym">
                    </div>
                    <div class="form-group">
                        <input class="form-control" type="password" placeholder="Password" v-model="password">
                    </div>
                    <div class="form-group">
                        <input class="form-control" type="password" placeholder="Confirm password" v-model="password2">
                    </div>
                    <div class="form-group">
                        <label class="form-check-label">Birth Date</label>
                        <input class="form-control" type="date" placeholder="BirthDate" v-model="birthday">
                    </div>
                    <div class="form-check">
                        <label class="form-check-label">
                            <input type="radio" class="form-check-input" name="optionsRadios" id="optionsRadios1"
                                   value="m" v-model="gender"> Male
                        </label>
                    </div>
                    <div class="form-check">
                        <label class="form-check-label">
                            <input type="radio" class="form-check-input" name="optionsRadios" id="optionsRadios2"
                                   value="f" v-model="gender"> Female
                        </label>
                    </div>
                    <div class="form-check">
                        <label class="form-check-label">
                            <input type="radio" class="form-check-input" name="optionsRadios" id="optionsRadios2"
                                   value="o" v-model="gender"> Other
                        </label>
                    </div>
                    <button class="btn btn-primary mx-0 mt-4" @click="registerUser()">Register</button>
                </div>
            </div>
        </div>
    </div>
</template>

<script>
    import Navbar from "../../components/inc/Navbar";

    export default {
        components: {Navbar},
        data() {
            return {
                email: '',
                pseudonym: '',
                password: '',
                password2: '',
                birthday: '',
                gender: '',
            }
        },
        methods: {
            registerUser() {

                if (this.password === this.password2) {

                    const formData = new FormData();
                    formData.append('email', this.email);
                    formData.append('pseudonym', this.pseudonym);
                    formData.append('password', this.password);
                    formData.append('birthday', new Date(this.birthday).toISOString());
                    formData.append('gender', this.gender);
                    formData.append('lvl', 0);

                    fetch('http://10.200.3.218:8090/api/user/create', {
                        method: 'POST',
                        body: formData,
                    }).then(res => res.json()).then(data => console.log(data));

                }

            }
        }

    }
</script>