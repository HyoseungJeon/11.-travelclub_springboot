//import Default from '../components/pages/Defalut.vue'
import MemberSignIn from '../components/pages/MemberSignIn.vue'
import ClubDetail from '../components/pages/ClubDetail.vue'
import ClubList from '../components/pages/ClubList.vue'
import ClubModify from '../components/pages/ClubModify.vue'
import ClubRegister from '../components/pages/ClubRegister.vue'
import MemberDetail from '../components/pages/MemberDetail.vue'
import MemberModify from '../components/pages/MemberModify.vue'
import MemberRegister from '../components/pages/MemberRegister.vue'
import MembershipList from '../components/pages/MembershipList.vue'
import MembershipModify from '../components/pages/MembershipModify.vue'
import VueRouter from 'vue-router'

const routes = [
    {path: '/', component : MemberSignIn},
    {path: '/clubDetail', name : 'clubDetail', component : ClubDetail, props: true},
    {path: '/clubList', name : 'clubList', component : ClubList, props: true},
    {path: '/clubModify', name : 'clubModify', component : ClubModify, props: true},
    {path: '/clubRegister', component : ClubRegister},
    {path: '/memberSignin', component : MemberSignIn},
    {path: '/memberDetail', component : MemberDetail},
    {path: '/memberModify', component : MemberModify},
    {path: '/memberRegister', component : MemberRegister},
    {path: '/membershipList', component : MembershipList},
    {path: '/membershipModify', component : MembershipModify},
];

export default new VueRouter({
    routes:routes // `routes: routes`의 줄임
 })