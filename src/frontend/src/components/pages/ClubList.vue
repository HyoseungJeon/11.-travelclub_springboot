<template>
  <div class="container">

        <h2 class="page-title text-center">나의 클럽</h2>

        <div class="content">
            <div class="search-form">
                <form action="">
                    <div class="form-group">
                        <div class="input-group">
                            <input v-model="searchClubName" type="text" class="form-control" placeholder="검색어를 입력하세요.">
                            <div class="input-group-btn">
                                <button @click="onClickSearchBtn" type="button" class="btn btn-primary"><span
                                        class="glyphicon glyphicon-search"></span></button>
                            </div><!-- /btn-group -->
                        </div><!-- /input-group -->
                    </div>
                </form>
            </div>

            <div class="row btn-action">
                <div class="col-sm-12">
                    <div class="fl-right">
                        <button @click="onClickRegisterBtn()" class="btn btn-default">
                            <i class="fas fa-plus"></i>
                            등록
                        </button>
                    </div>
                </div>
            </div>

            <div class="table-wrap">
                <table class="table text-center">
                    <thead>
                    <tr>
                        <th class="text-center">No</th>
                        <th class="text-center">클럽명</th>
                        <th class="text-center">창설일</th>
                        <th class="text-center">회원수</th>
                        <th class="text-center">관리</th>
                    </tr>
                    </thead>
                    <tbody>
                        <tr v-for="(value, index) in clubs" v-bind:key="index">
                            <th scope="row" class="text-center">{{index + 1}}</th>
                                <td @click="onClickDetailBtn('clubDetail','value.usid')">{{value.name}}</td>
                                <td>{{value.foundationDay}}</td>
                                <td>{{value.membershipList.length}}</td>
                                <td>
                            <button class="btn btn-default btn-sm">
                                수정
                            </button>
                            <button class="btn btn-default btn-sm">
                                삭제
                            </button>
                        </td>
                        </tr>
                    <!-- <tr>
                        <th scope="row" class="text-center">1</th>
                        <td>Java 클럽</td>
                        <td>20. 1. 3</td>
                        <td>3</td>
                        <td>
                            <button class="btn btn-default btn-sm">
                                수정
                            </button>
                            <button class="btn btn-default btn-sm">
                                삭제
                            </button>
                        </td>
                    </tr>
                    <tr>
                        <th scope="row" class="text-center">2</th>
                        <td>트래킹 클럽</td>
                        <td>20. 1. 6</td>
                        <td>15</td>
                        <td>
                            <button class="btn btn-basic btn-sm">
                                탈퇴하기
                            </button>
                        </td>
                    </tr> -->
                    </tbody>
                </table>
            </div>
        </div>
    </div>
</template>

<script>
import {club_findByName} from '../../api/ClubApi.js'
export default {
    name:'clubList',
    data :function(){
        return{
            clubs:{},
            searchClubName:"",
        }
    },
    mounted: async function(){
        this.clubs = await club_findByName("newtest15");
    },
    methods:{
        onClickSearchBtn : async function(){
            //this.clubList = await club_findByName(this.searchClubName);
            console.log(this.searchClubName)
        },
        /* handleClickMenu : function(menuname){
            console.log(menuname)
        }, */
        onClickDetailBtn : function(menuname, clubId){
            this.$emit('btnCliked',menuname,clubId);
        },
        onClickRegisterBtn : function(){
            this.$emit('btnCliked','clubRegister');
        }
    }
}
</script>

<style>

</style>