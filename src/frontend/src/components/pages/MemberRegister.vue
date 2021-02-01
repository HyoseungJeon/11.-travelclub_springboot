<template>
  <div class="container">

        <h2 class="page-title text-center">회원가입</h2>

        <div class="content">
            <div class="panel panel-bordered">
                <div class="panel-body">
                    <div class="content">
                        <form class="form-horizontal">
                            <div class="form-group">
                                <label for="inputEmail3" class="col-sm-2 control-label">이메일</label>
                                <div class="col-sm-5">
                                    <input type="email" class="form-control" id="inputEmail3" placeholder="이메일">
                                </div>
                            </div>
                            <div class="form-group">
                                <label for="inputEmail3" class="col-sm-2 control-label">이름</label>
                                <div class="col-sm-5">
                                    <input type="text" class="form-control" id="inputEmail3" placeholder="이름">
                                </div>
                            </div>
                            <div class="form-group">
                                <label for="inputEmail3" class="col-sm-2 control-label">닉네임</label>
                                <div class="col-sm-5">
                                    <input type="text" class="form-control" id="inputEmail3" placeholder="닉네임">
                                </div>
                            </div>
                            <div class="form-group">
                                <label for="inputPassword3" class="col-sm-2 control-label">비밀번호</label>
                                <div class="col-sm-5">
                                    <input type="password" class="form-control" id="inputPassword3" placeholder="비밀번호">
                                </div>
                            </div>
                            <div class="form-group">
                                <label for="inputPassword3" class="col-sm-2 control-label">비밀번호 확인</label>
                                <div class="col-sm-5">
                                    <input type="password" class="form-control" id="inputPassword3" placeholder="비밀번호 확인">
                                </div>
                            </div>
                            <div class="form-group">
                                <label for="inputEmail3" class="col-sm-2 control-label">휴대번호</label>
                                <div class="col-sm-5">
                                    <input type="text" class="form-control" id="inputEmail3" placeholder="휴대번호">
                                </div>
                            </div>
                            <div class="form-group">
                                <label for="inputEmail3" class="col-sm-2 control-label">생년월일</label>
                                <div class="col-sm-5">
                                    <input type="text" class="form-control" id="inputEmail3" placeholder="생년월일">
                                </div>
                            </div>
                            <div class="form-group">
                                <label for="inputEmail3" class="col-sm-2 control-label">주소</label>
                                <div class="col-sm-10">
                                    <div class="form-inline">
                                        <div class="row">
                                            <div class="col-sm-12">
                                                <select class="form-control">
                                                    <option>집</option>
                                                    <option>회사</option>
                                                </select>
                                                <input type="text" class="form-control" id="inputEmail3" placeholder="지번 주소">
                                                <input type="text" class="form-control" id="inputEmail3" placeholder="도로명 주소">
                                                <select class="form-control">
                                                    <option>한국</option>
                                                    <option>중국</option>
                                                    <option>미국</option>
                                                    <option>...</option>
                                                </select>
                                                <button class="btn btn-basic">
                                                    <i class="fas fa-plus"></i> 주소 추가
                                                </button>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="col-sm-12">
                <div class="btn-action text-right">
                    <button class="btn btn-primary btn-bordered">
                        <i class="fas fa-check"></i> 가입
                    </button>
                </div>
            </div>
        </div>
    </div>
</template>

<script>
export default {
    name:'memberRegister',
}
</script>

<style>

</style>