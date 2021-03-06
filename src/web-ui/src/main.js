import Vue from 'vue'
import App from './App.vue'
import VueFormWizard from 'vue-form-wizard'
import 'vue-form-wizard/dist/vue-form-wizard.min.css'
import 'bootstrap/dist/css/bootstrap.css'
import 'bootstrap-vue/dist/bootstrap-vue.css'
import {BootstrapVue, IconsPlugin} from 'bootstrap-vue'
import VueToast from 'vue-toast-notification';

import 'vue-toast-notification/dist/theme-sugar.css';

Vue.use(BootstrapVue)
Vue.use(IconsPlugin)
Vue.use(VueFormWizard)
Vue.use(VueToast)
Vue.config.productionTip = false

new Vue({
    render: h => h(App),
}).$mount('#app')
