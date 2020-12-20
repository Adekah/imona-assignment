<template>
    <div style="margin-left: auto;  background: linear-gradient(to top, #f12711, #f5af19);">
        <label>lorem İpsun</label>
    </div>
</template>

<script>
    import axios from "axios";

    export default {
        name: "Action",
        created() {
            axios.get("http://localhost:8000/api/action")
                .then(response => {
                    console.log(response.data)
                    this.gameInformation = response.data
                    this.gameLogo = response.data.logo

                })
        }
    }

</script>

<style scoped>

</style>
