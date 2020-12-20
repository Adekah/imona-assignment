<template>
    <div style="margin-left: auto;background: linear-gradient(to right, #f12711, #f5af19);">
        <bootstrap-vue-datatable :posts="posts">{{posts}}</bootstrap-vue-datatable>
        <b-button variant="info" @click="getPlayers">Get All Players</b-button>


        <div id="form">
            <b-form @submit="onSubmit" inline>

                <b-input-group prepend="Name" class="mb-2 mr-sm-2 mb-sm-0">
                    <b-form-input v-model="playerDto.name" required></b-form-input>
                </b-input-group>

                <b-input-group prepend="Surname" class="mb-2 mr-sm-2 mb-sm-0">
                    <b-form-input v-model="playerDto.surname" required></b-form-input>
                </b-input-group>

                <b-input-group prepend="Gender" class="mb-2 mr-sm-2 mb-sm-0">
                    <b-form-select v-model="playerDto.gender" required :options="gender"></b-form-select>
                </b-input-group>

                <b-input-group prepend="Birth City" class="mb-2 mr-sm-2 mb-sm-0">
                    <b-form-select v-model="playerDto.birthCity" required :options="cityOptions"></b-form-select>
                </b-input-group>

                <b-form-datepicker placeholder="Birth Date" v-model="playerDto.birthDate" class="mb-2 mr-sm-2 mb-sm-0"/>

                <b-input-group prepend="Choose Action" class="mb-2 mr-sm-2 mb-sm-0">
                    <b-form-select v-model="playerDto.actionId" required :options="actionOptions"></b-form-select>
                </b-input-group>

                <b-input-group prepend="Score" class="mb-2 mr-sm-2 mb-sm-0">
                    <b-form-input v-model="playerDto.score" number required></b-form-input>
                </b-input-group>

                <b-form-checkbox class="form-control" style="margin: 10px;" name="checkBox" required
                       v-model="playerDto.isActive"          v-bind:value="true"  v-bind:unchecked-value="false">isActive
                </b-form-checkbox>

                <b-button type="submit" variant="primary">Add New Player</b-button>
            </b-form>
        </div>

    </div>
</template>

<script>

    import BootstrapVueDatatable from "@/components/BootstrapVueDatatable";
    import axios from "axios";

    export default {
        name: "Player",
        components: {
            BootstrapVueDatatable
        },
        data: () => ({
            posts: [],
            selected: null,
            gender: [
                {value: null, text: ''},
                {value: 'male', text: 'male'},
                {value: 'female', text: 'female'},
            ],
            cityOptions: [
                {value: 'İstanbul', text: 'İstanbul'},
                {value: 'Ankara', text: 'Ankara'},
                {value: 'Adana', text: 'Adana'},
                {value: 'Tokat', text: 'Tokat'}
            ],
            actionOptions: [
                {value: '1', text: 'Action1'},
                {value: '2', text: 'Action2'},
                {value: '3', text: 'Action3'},
                {value: '4', text: 'Action4'}
            ],
            playerDto: {
                surname: '',
                name: '',
                birthDate: '',
                birthCity: '',
                actionId: '',
                isActive:'',
                gender: '',
                score: ''
            }
        }), methods: {
            onSubmit() {
                axios.post("http://localhost:8000/api/player", this.playerDto)
                    .then(response => {
                        console.log(response.data)
                    })
                    .catch(response => {

                        alert(response + " "+this.playerDto)
                    })
            },
            getPlayers() {
                axios.get("http://localhost:8000/api/player")
                    .then(response => {
                        this.posts = response.data
                    })
            },

        }

    }
</script>

<style scoped>

    #form {
        margin: 20px;
        padding: 20px;
    }

</style>
