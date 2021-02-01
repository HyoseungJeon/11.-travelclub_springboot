<template>
  <div class="container">

        <h2 class="page-title text-center">Java 클럽 - 회원목록</h2>

        <div class="content">
            <div class="search-form">
                <form action="">
                    <div class="form-group">
                        <div class="input-group">
                            <input type="text" class="form-control" placeholder="검색어를 입력하세요.">
                            <div class="input-group-btn">
                                <button type="button" class="btn btn-primary"><span
                                        class="glyphicon glyphicon-search"></span></button>
                            </div><!-- /btn-group -->
                        </div><!-- /input-group -->
                    </div>
                </form>
            </div>

            <div class="row btn-action">
                <div class="col-sm-12">
                    <div class="fl-right">
                        <!-- trigger modal -->
                        <button class="btn btn-default" data-toggle="modal" data-target="#myModal">
                            <i class="fas fa-plus"></i>
                            등록
                        </button>

                        <!-- Modal -->
                        <div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel"
                             aria-hidden="true">
                            <div class="modal-dialog">
                                <div class="modal-content">
                                    <div class="modal-header">
                                        <button type="button" class="close" data-dismiss="modal"
                                                aria-label="Close"><span
                                                aria-hidden="true">&times;</span></button>
                                        <h4 class="modal-title" id="myModalLabel">회원등록</h4>
                                    </div>
                                    <div class="modal-body">
                                        <form>
                                            <div class="form-group">
                                                <label for="exampleInputEmail1">이메일</label>
                                                <input type="email" class="form-control" id="exampleInputEmail1"
                                                       placeholder="이메일" value="hello@nextree.io">
                                            </div>
                                            <div class="form-group">
                                                <label for="exampleInputEmail1">이름</label>
                                                <input type="text" class="form-control" id="exampleInputEmail1"
                                                       placeholder="이름" value="홍길동">
                                            </div>
                                            <div class="form-group">
                                                <label for="exampleInputPassword1">휴대폰 번호</label>
                                                <input type="text" class="form-control" id="exampleInputPassword1"
                                                       placeholder="휴대폰 번호" value="010-1234-5678">
                                            </div>
                                        </form>
                                        <div class="row btn-action">
                                            <div class="col-sm-12">
                                                <div class="fl-right">
                                                    <button class="btn btn-primary btn-bordered">
                                                        <i class="fas fa-check"></i> 등록
                                                    </button>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>

            <div class="table-wrap">
                <table class="table text-center">
                    <thead>
                    <tr>
                        <th class="text-center">No</th>
                        <th class="text-center">이메일</th>
                        <th class="text-center">이름</th>
                        <th class="text-center">가입일</th>
                        <th class="text-center">역할</th>
                    </tr>
                    </thead>
                    <tbody>
                    <tr>
                        <th scope="row" class="text-center">1</th>
                        <td>hello@nextree.io</td>
                        <td>홍길동</td>
                        <td>92. 5. 22</td>
                        <td>관리자</td>
                    </tr>
                    <tr>
                        <th scope="row" class="text-center">2</th>
                        <td>hello@nextree.io</td>
                        <td>홍길동</td>
                        <td>20. 1. 6</td>
                        <td>멤버</td>
                    </tr>
                    </tbody>
                </table>
            </div>
            <div class="row btn-action">
                <div class="col-sm-12">
                    <button class="btn btn-default">
                        <i class="fas fa-list"></i> 목록
                    </button>
                    <div class="fl-right">
                        <button class="btn btn-default btn-bordered">
                            <i class="fas fa-edit"></i> 수정
                        </button>
                    </div>
                </div>
            </div>
        </div>
    </div>
</template>

<script>
export default {
    name:'membershipList',
}
</script>

<style>

</style>