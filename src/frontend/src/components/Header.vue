<template>
<body>
    
<header class="header">
    <nav class="navbar navbar-default navbar-fixed-top">
        <div class="container-fluid">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar"
                        aria-expanded="false" aria-controls="navbar">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="#">TravelClub</a>
            </div>
            <div id="navbar" class="navbar-collapse collapse">
                <ul class="nav navbar-nav">
                    <li><a @click="handleClickMenu('clubList')">클럽</a></li>
                </ul>
                <ul class="nav navbar-nav navbar-right">
                    <li v-if="!isSignedIn"><a @click="handleClickMenu('memberRegister')">가입</a></li>
                    <li     v-if="!isSignedIn">
                        <!-- trigger modal -->
                        <a href="javascript:;" data-toggle="modal" data-target="#myModal">
                            로그인
                        </a>

                        <!-- Modal -->
                        <div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel"
                             aria-hidden="true">
                            <div class="modal-dialog modal-sm">
                                <div class="modal-content">
                                    <div class="modal-header">
                                        <button type="button" class="close" data-dismiss="modal"
                                                aria-label="Close"><span
                                                aria-hidden="true">&times;</span></button>
                                        <h4 class="modal-title" id="myModalLabel">로그인</h4>
                                    </div>
                                    <div class="modal-body">
                                        <form>
                                            <div class="form-group">
                                                <label for="exampleInputEmail1">이메일</label>
                                                <input type="email" class="form-control" id="exampleInputEmail1"
                                                       placeholder="이메일">
                                            </div>
                                            <div class="form-group">
                                                <label for="exampleInputPassword1">패스워드</label>
                                                <input type="password" class="form-control" id="exampleInputPassword1"
                                                       placeholder="패스워드">
                                            </div>
                                            <button class="btn btn-primary btn-block" type="submit">
                                                로그인
                                            </button>
                                        </form>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </li>
                    <li v-if="isSignedIn"><a @click="handleClickMenu('memberDetail')">내정보</a></li>
                    <li v-if="isSignedIn"><a @click="handleClickMenu('/')" href="#">로그아웃</a></li>
                </ul>
            </div><!--/.nav-collapse -->
        </div><!--/.container-fluid -->
    </nav>
</header>
</body>
</template>

<script>
export default {
    name : "Header",
    data: function(){
        return{
            isSignedIn : false,
        }
    },
    methods:{
        handleClickMenu : function(menuname){
            console.log(menuname)
            this.$router.push(menuname)
        }
    }
}
</script>

<style>

</style>