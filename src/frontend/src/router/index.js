import Default from '../components/pages/Defalut.vue'
import SignIn from '../components/pages/MemberSignIn.vue'
import VueRouter from 'vue-router'

const routes = [
    {path: '/', component : SignIn},
    {path: '/defalut', component : Default},
];

export default new VueRouter({
    routes:routes // `routes: routes`의 줄임
 })