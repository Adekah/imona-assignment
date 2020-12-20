<template>
    <div id="information">
        <img src="../assets/logo.png"/>
        <h2>{{gameInformation.name}}</h2>
        <label>{{gameInformation.description}}</label>
    </div>
</template>

<script>
    import axios from "axios";
    import Vue from "vue";

    export default {
        name: "information",
        data() {
            return {
                gameInformation: {},
                gameLogo: {
                    logo: 'logo.png'
                }
            }
        },
        created() {
            axios.get("http://localhost:8000/api/game/1")
                .then(response => {
                    console.log(response.data)
                    this.gameInformation = response.data
                    this.gameLogo = response.data.logo
                    Vue.$toast.open({
                        message: 'Game Informations fetched',
                        type: 'success',
                        position: 'top-right'
                    });
                })
        }
    }


</script>

<style scoped>

    #information {
        margin-left: auto;
        padding: 20px;
        background: linear-gradient(to right, #f5af19, #f12711);

    }

</style>
