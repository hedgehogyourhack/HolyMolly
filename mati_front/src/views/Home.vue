<template>
    <div class="home">

        <navbar :homepage="true"></navbar>

        <div class="container-fluid">

            <div class="row pt-5" id="first-slider">
                <div class="col-lg-7 text-right" id="phone-slider">
                </div>
                <div class="col-lg-5 d-flex align-items-center">
                    <div class="pb-5 mb-5">
                        <p class="display-2 font-weight-bold text-white m-0" style="font-weight: 100 !important;">
                            Eventrio
                        </p>
                        <p class="h4" style="color: #FF8F54; position: relative; left: 6px;">
                            Discover events in okolica
                        </p>
                        <button class="btn btn-lg btn-primary mt-5">
                            How it works?
                        </button>
                    </div>
                </div>
            </div>

            <div class="row my-5 py-5">
                <div class="col-lg-2">

                </div>
                <div class="col-lg-4">
                    <div id="carouselExampleSlidesOnly" class="carousel slide" data-ride="carousel">
                        <div class="carousel-inner">
                            <div class="carousel-item active">
                                <img class="d-block w-75 mx-auto" src="../assets/slider1.png" alt="First slide">
                            </div>
                            <div class="carousel-item">
                                <img class="d-block w-75 mx-auto" src="../assets/slider2.png" alt="Second slide">
                            </div>
                            <div class="carousel-item">
                                <img class="d-block w-75 mx-auto" src="../assets/slider3.png" alt="Second slide">
                            </div>
                        </div>
                    </div>
                </div>

                <div class="col-lg-4 d-flex align-items-center">
                    <div class="card p-5">
                        <h3 style="color: #420233">
                            What is Eventrio?
                        </h3>
                        <p>
                            <i class="bx bx-caret-right"></i> Lorem ipsum dolor sit amet, consectetur adipiscing elit.
                            Quisque rutrum mollis leo vel elementum. Aliquam mollis purus volutpat mauris pulvinar
                            tincidunt. In consequat sapien in orci pellentesque.
                        </p>
                        <h3 class="mt-5" style="color: #420233;">
                            Why Eventrio?
                        </h3>
                        <p>
                            <i class="bx bx-caret-right"></i> Vitae convallis sem sodales. Nullam pellentesque aliquam
                            pharetra. Fusce rutrum nisi laoreet, molestie massa sed, bibendum arcu. Morbi vulputate
                            ligula non.
                        </p>
                    </div>
                </div>
            </div>

            <div class="row" id="second-slider">
                <div class="d-flex align-items-center w-100">
                    <div class="row w-100">
                        <div class="col-lg-12 pb-5 mb-3">
                            <h1 class="text-center text-white display-3">
                                How to use eventrio
                            </h1>
                        </div>
                        <div class="col-lg-3">
                            <img src="../assets/slider2.png" class="img-fluid"/>
                            <p class="text-center mt-3 h4 text-light">
                                1. Lorem ipsum
                            </p>
                        </div>
                        <div class="col-lg-3">
                            <img src="../assets/slider1.png" class="img-fluid"/>
                            <p class="text-center mt-3 h4 text-light">
                                1. Lorem ipsum
                            </p>
                        </div>
                        <div class="col-lg-3">
                            <img src="../assets/slider3.png" class="img-fluid"/>
                            <p class="text-center mt-3 h4 text-light">
                                1. Lorem ipsum
                            </p>
                        </div>
                        <div class="col-lg-3">
                            <img src="../assets/slider2.png" class="img-fluid"/>
                            <p class="text-center mt-3 h4 text-light">
                                1. Lorem ipsum
                            </p>
                        </div>
                    </div>
                </div>
            </div>

            <div class="row py-5 mb-3 mt-5">
                <div class="col-lg-12">
                    <h1 class="text-center display-4 mb-5 pb-5" style="color: #420233 !important;">
                        Pricing for finders
                    </h1>
                </div>
                <div class="col-lg-2 text-center pricing ml-auto">
                    <i class="bx bx-book display-1"></i>
                    <p class="h1 pb-3">
                        Pleps
                        <span class="pin free">Always Free</span>
                    </p>
                    <ul class="text-left">
                        <li>
                            Join up to <strong>50</strong> events /month
                        </li>
                        <li>
                            Get <strong>notifications</strong> about <strong>upcoming</strong> events
                        </li>
                    </ul>
                </div>
                <div class="col-lg-2 text-center pricing mr-auto">
                    <i class="bx bxs-book display-1"></i>
                    <p class="h1 pb-3">
                        Unlimited
                        <span class="pin silver animated pulse infinite slower">1.99$ /m</span>
                    </p>
                    <ul class="text-left">
                        <li>
                            Join <strong>unlimited</strong> events
                        </li>
                        <li>
                            Go anywhere with <strong>3</strong> friends
                        </li>
                        <li>
                            Get <strong>notifications 7 days earlier</strong> than others
                        </li>
                    </ul>
                </div>
                <div class="col-lg-12">
                    <h1 class="text-center display-4 my-5 py-5" style="color: #420233 !important;">
                        Pricing for organizers
                    </h1>
                </div>
                <div class="col-lg-2 text-center pricing ml-auto">
                    <i class="bx bx-book display-1"></i>
                    <p class="h1 pb-3">
                        Pleps
                        <span class="pin free">Free</span>
                    </p>
                    <ul class="text-left">
                        <li>
                            <strong>5</strong> private events /month
                        </li>
                    </ul>
                </div>
                <div class="col-lg-2 text-center pricing">
                    <i class="bx bxs-book display-1"></i>
                    <p class="h1 pb-3">
                        Silver
                        <span class="pin silver animated pulse infinite slower">9.99$ /m</span>
                    </p>
                    <ul class="text-left">
                        <li>
                            <strong>Unlimited</strong> private events
                        </li>
                        <li>
                            Up to <strong>2</strong> public events in radius of <strong>10</strong>km /month
                        </li>
                    </ul>
                </div>
                <div class="col-lg-2 text-center pricing">
                    <i class="bx bx-book-bookmark display-1"></i>
                    <p class="h1 pb-3">
                        Golden
                        <span class="pin golden animated heartBeat infinite slower text-center">19.99$ /m <img src="../assets/iconfinder_money_bag_2639867.svg" style="height: 28px"> </span>
                    </p>
                    <ul class="text-left">
                        <li>
                            <strong>Unlimited</strong> private events
                        </li>
                        <li>
                            Up to <strong>5</strong> public events in radius of <strong>20</strong>km /month
                        </li>
                        <li>
                            <strong>Special notifications</strong> about your events
                        </li>
                    </ul>
                </div>
                <div class="col-lg-2 text-center pricing mr-auto">
                    <i class="bx bxs-book-bookmark display-1"></i>
                    <p class="h1 pb-3">
                        Platinium
                        <span class="pin platinium animated pulse infinite">29.99 $/m</span>
                    </p>
                    <ul class="text-left">
                        <li>
                            <strong>Unlimited</strong> private events
                        </li>
                        <li>
                            Up to <strong>10</strong> public events in radius of <strong>30</strong>km /month
                        </li>
                        <li>
                            <strong>1 super public</strong> event in radius of <strong>whole country</strong>! /month
                        </li>
                        <li>
                            <strong>Unstoppable notifications</strong> about your events
                        </li>
                    </ul>
                </div>
            </div>

            <div class="row my-5 pb-5" id="last-slider">
                <div class="col-lg-4 mx-auto">
                    <div class="card text-center p-4 my-5">
                        <img src="../assets/google-play-logo-1.png" class="w-50 mx-auto"/>
                        <p class="h1">
                            Download <strong>Eventrio</strong>
                        </p>
                        <small>
                            Application is available on Google Play!
                        </small>
                    </div>
                </div>
            </div>


        </div>

        <div class="rain">
            <img src="../assets/logos.png" style="width: 16px; height: auto; transition: 5s all" id="alien" @click="alien()">
        </div>

    </div>

</template>

<script>
    import Navbar from "../components/inc/Navbar";

    export default {
        name: 'home',
        components: {Navbar},
        data () {
            return {
                alienW: 1,
            }
        },
        methods: {
            alien() {
                this.alienW *= 2;
                document.querySelector('#alien').style.width = this.alienW + 'px';
            }
        }
    }
</script>

<style lang="scss">

    #first-slider {
        height: 100vh;
        background: linear-gradient(30deg, #D22F40, #190528);
        -webkit-clip-path: polygon(0 0, 100% 0, 100% 100%, 0 89%);
        clip-path: polygon(0 0, 100% 0, 100% 100%, 0 89%);

        #phone-slider {
            background-image: url("../assets/slider1.png");
            background-size: cover;
        }
    }

    #second-slider {
        height: 100vh;
        background: linear-gradient(30deg, #D22F40, #190528);
        -webkit-clip-path: polygon(0 5%, 100% 0, 100% 93%, 0 100%);
        clip-path: polygon(0 5%, 100% 0, 100% 93%, 0 100%);
    }

    .pricing {
        .pin {
            position: absolute;
            left: 50%;
            top: 3.4rem;
            z-index: 100;
            color: white;
            padding: 0.5rem;
            font-size: 1rem;
            border-radius: 12px;
            font-weight: 700;
            &.free {
                background: linear-gradient(30deg, #00FFA1, #00FFFF);
                color: #0d0d0d;
            }
            &.silver {
                background: linear-gradient(30deg, #2E3192, #1BFFFF);
            }
            &.golden {
                background: linear-gradient(30deg, #ED1C24, #FCEE21);
            }
            &.platinium {
                background: linear-gradient(30deg, #662D8C, #ED1E79);
            }
        }
    }

    strong{
        font-weight: 800 !important;
    }

</style>