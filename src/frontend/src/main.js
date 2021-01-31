import Vue from 'vue'
import App from './App.vue'
import SuiVue from 'semantic-ui-vue';
import 'semantic-ui-css/semantic.min.css';
import VueSession from 'vue-session'
import VueRouter from 'vue-router'
import router from './router'
// import BootstrapVue from "bootstrap-vue"
// import "bootstrap/dist/css/bootstrap.min.css"
// import jquery from 'vue-jquery'

var Sessionoptions = {
  persist: true
}

Vue.config.productionTip = false
Vue.use(SuiVue);
Vue.use(VueSession,Sessionoptions)
Vue.use(VueRouter)
// Vue.use(BootstrapVue);
// Vue.use(jquery)

new Vue({
  render: h => h(App),
  router : router,
}).$mount('#app')