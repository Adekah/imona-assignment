<template>
    <div style="margin-left: auto;  background: linear-gradient(to top, #f12711, #f5af19);">
        <div class="container pt-3 pb-5">
            <h2> Action List </h2>

            <b-row>
                <b-col>
                    <b-table striped
                             hover
                             outlined
                             :items="posts"
                             :fields="fields">
                    </b-table>
                </b-col>

            </b-row>

        </div>

    </div>




</template>

<script>
    import axios from "axios";

    export default {
        props: ["posts"],
        data: () => ({
            fields: ["name", "description", "point"]
        }),

        name: "Action",
        created() {
            axios.get("http://localhost:8000/api/action")
                .then(response => {
                    this.posts = response.data
                })
        }
    }

</script>

<style scoped>

</style>
