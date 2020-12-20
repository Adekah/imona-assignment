<template>
    <form-wizard>
        <tab-content title="Personal details">
            <information></information>
        </tab-content>
        <tab-content title="Additional Info">
            <player></player>
        </tab-content>
        <tab-content title="Last step">
            <action></action>
        </tab-content>
    </form-wizard>
</template>

<script>
    import {FormWizard, TabContent} from 'vue-form-wizard'
    import Information from "@/components/Information";
    import Player from "@/components/Player";
    import Action from "@/components/Action";

    export default {
        components: {
            FormWizard,
            TabContent,
            Information,
            Player,
            Action
        },
        props: {
            title: {
                type: String,
                default: 'Imono Assignment'
            },
            subtitle: {
                type: String,
                default: 'this wizard is great'
            },
            nextButtonText: {
                type: String,
                default: 'Next'
            },
            backButtonText: {
                type: String,
                default: 'Back'
            },
            finishButtonText: {
                type: String,
                default: 'Finish'
            },
            stepSize: {
                type: String,
                default: 'md',
                validator: (value) => {
                    let acceptedValues = ['xs', 'sm', 'md', 'lg']
                    return acceptedValues.indexOf(value) !== -1
                }
            },
            /***
             *  Sets validation (on/off) for back button. By default back button ignores validation
             */
            validateOnBack: Boolean,
            /***
             * Applies to text, border and circle
             */
            color: {
                type: String,
                default: '#e74c3c' //circle, border and text color
            },
            /***
             *  Is set to current step and text when beforeChange function fails
             */
            errorColor: {
                type: String,
                default: '#8b0000'
            },
            /**
             * Can take one of the following values: 'circle|square|tab`
             */
            shape: {
                type: String,
                default: 'circle'
            },
            /**
             * name of the transition when transition between steps
             */
            transition: {
                type: String,
                default: '' //name of the transition when transition between steps
            },
            /***
             * Index of the initial tab to display
             */
            startIndex: {
                type: Number,
                default: 0
            }
        }
    }
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>

</style>
