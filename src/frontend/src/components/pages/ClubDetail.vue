<template>
  <main id="main" class="index-main">
    <div class="container">

        <h2 class="page-title text-center">Java 클럽</h2>

        <div class="panel panel-bordered">
            <div class="panel-body">
                <div class="content">
                    <ul class="list-inline">
                        <li><span class="title">창설일</span> 20. 1. 3</li>
                        <li><span class="title">회원수</span> 3
                            <button class="btn btn-basic"><span class="glyphicon glyphicon-search"></span></button>
                        </li>
                    </ul>
                </div>

                <div class="content">
                    <div class="title">소개</div>

                    <div class="content-inner">
                        <p>
                            Java 를 탐구하고 객체 지향 프로그래밍에 대해서 심도있게 탐구합니다.
                            분기에 1번씩 파일럿 프로젝트를 통해 실제 세상의 문제를 해결합니다.
                            Java 를 탐구하고 객체 지향 프로그래밍에 대해서 심도있게 탐구합니다.
                            분기에 1번씩 파일럿 프로젝트를 통해 실제 세상의 문제를 해결합니다.
                        </p>
                    </div>
                </div>
            </div>
        </div>
        <div class="content">
            <div class="row btn-action">
                <div class="col-sm-12">
                    <button @click="onClickListBtn('clubList')" class="btn btn-default">
                        <i class="fas fa-list"></i> 목록
                    </button>
                    <div class="fl-right">
                        <button @click="onClickListBtn('clubModify',clubId)" class="btn btn-default btn-bordered">
                            <i class="fas fa-edit"></i> 수정
                        </button>
                        <button @click="onClickDeleteBtn(clubId)" class="btn btn-danger btn-bordered">
                            <i class="fas fa-trash-alt"></i> 삭제
                        </button>
                    </div>
                </div>
            </div>
        </div>
    </div>
</main>
</template>

<script>
import {club_find} from '../../api/ClubApi.js'
export default {
    name:'clubDetail',
    data:function(){
        return{
            club:{},
        }
    },
    props:{
        clubId:{
            type: String,
            defalut: '',
        }
    },
    mounted: async function(){
        this.club = await club_find(this.clubId)
    },
    methods:{
        onClickListBtn : function(menuname){
            this.$emit('btnCliked',menuname);
        },
        onClickModifyBtn :function(menuname, clubId){
             this.$emit('btnCliked',menuname,clubId);
        },
        onClickDeleteBtn : function(clubId){
            //delete club logic
            console.log(clubId)

            this.$emit('btnCliked','clubList');
        }
    }
}
</script>

<style>

</style>