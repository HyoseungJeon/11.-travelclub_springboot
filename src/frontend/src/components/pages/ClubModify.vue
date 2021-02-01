<template>
  <div class="container">

        <h2 class="page-title text-center">Java 클럽</h2>

        <div class="panel panel-bordered">
            <div class="panel-body">
                <div class="content">
                    <form class="form-inline">
                        <div class="row">
                            <div class="col-sm-4">
                                <div class="form-group">
                                    <label for="exampleInputName2" class="title">창설일</label>
                                    <input type="text" class="form-control" id="exampleInputName2" placeholder="" value="20. 1. 3
        ">
                                </div>
                            </div>
                            <div class="col-sm-4">
                                <div class="form-group">
                                    <label for="exampleInputName2" class="title">회원수</label>
                                    <p>3</p>
                                </div>
                            </div>
                        </div>
                    </form>
                </div>

                <div class="content">
                    <div class="title">소개</div>

                    <div class="content-inner">
                        <textarea class="form-control" rows="15">java를 탐구하고</textarea>
                    </div>
                </div>
            </div>
        </div>
        <div class="content">
            <div class="row btn-action">
                <div class="col-sm-12">
                    <button @click="onClickListBtn()" class="btn btn-default">
                        <i class="fas fa-list"></i> 목록
                    </button>
                    <div class="fl-right">
                        <button @click="onClickComplateBtn('',clubId)" class="btn btn-primary btn-bordered">
                            <i class="fas fa-check"></i> 수정 완료
                        </button>
                    </div>
                </div>
            </div>
        </div>
    </div>
</template>

<script>
export default {
    name:'clubModify',
    methods:{
        onClickListBtn : function(){
            this.$emit('btnCliked','clubList');
        },
        onClickComplateBtn :function(menuname, clubId){
            //Update club logic~

             this.$emit('btnCliked','clubDetail',clubId);
        }
    }
}
</script>

<style>

</style>