<template>
    <div class="container pt-3 pb-5">
        <h2> Player List </h2>
        <b-row class="mb-3">
            <b-col md="3">
                <b-form-input v-model="filter" type="search" id="filterInput" placeholder="Search"></b-form-input>
            </b-col>
        </b-row>
        <b-row>
            <b-col>
                <b-table striped
                         hover
                         outlined
                         :items="posts"
                         :filter="filter"
                         :per-page="perPage"
                         :current-page="currentPage"
                         :fields="fields">
                    <template v-slot:cell(edit)="data">
                        <b-button variant="warning" @click="editItem(data.item.id)">Edit</b-button>
                    </template>
                    <template v-slot:cell(delete)="data">
                        <b-button variant="danger" @click="deleteItem(data.item.id)">Delete</b-button>
                    </template>
                </b-table>
                <b-pagination
                        v-model="currentPage"
                        :total-rows="rows"
                        :per-page="perPage" aria-controls="my-table"></b-pagination>
                <b-button variant="success" @click="deleteItem(data.item.id)">---Add New Recod---</b-button>
            </b-col>

        </b-row>

    </div>

</template>

<script>
    export default {
        props: ["posts"],
        data: () => ({
            fields: ["userId", "id", "title", "edit","delete"],
            perPage: 10,
            currentPage: 1,
            filter: ""
        }),
        computed: {
            rows() {
                return this.posts.length;
            },
        },
        methods: {
            deleteItem(id) {
                const index = this.posts.indexOf(x => x.id === id);
                this.posts.splice(index, 1);
            },
            editItem(id) {
                const index = this.posts.indexOf(x => x.id === id);
                this.posts.splice(index, 1);
            },
            addItem(id) {
                const index = this.posts.indexOf(x => x.id === id);
                this.posts.splice(index, 1);
            }
        }
    };
</script>

<style scoped>

</style>
