<template>
    <div style="margin-left: auto;background: linear-gradient(to right, #f12711, #f5af19);">
        <bootstrap-vue-datatable :posts="posts"></bootstrap-vue-datatable>
    </div>
</template>

<script>

    import BootstrapVueDatatable from "@/components/BootstrapVueDatatable";

    export default {
        name: "Player",
        components: {
            BootstrapVueDatatable
        },
        data: () => ({
            posts: [
                {userId: 1, id: 1, title: "lorem ipsum "},
                {userId: 1, id: 1, title: "lorem ipsum "},
                {userId: 1, id: 1, title: "lorem ipsum "},
                {userId: 1, id: 1, title: "lorem ipsum "},
                {userId: 1, id: 1, title: "lorem ipsum "},
                {userId: 1, id: 1, title: "lorem ipsum "},
                {userId: 1, id: 1, title: "lorem ipsum "},
                {userId: 1, id: 2, title: "lorem ipsum lorem "},
                {userId: 1, id: 3, title: "lorem ipsum lorem ipsum lorem ipsum"},
                {userId: 1, id: 4, title: "lorem ipsum lorem ipsum lorem ipsum lorem ipsum"}]
        })
    }
</script>

<style scoped>

</style>
