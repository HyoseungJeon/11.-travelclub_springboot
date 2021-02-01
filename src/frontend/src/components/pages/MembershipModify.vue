<template>
  <div class="container">

        <h2 class="page-title text-center">Java 클럽 - 회원 정보 수정</h2>

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

            <div class="table-wrap">
                <table class="table text-center">
                    <thead>
                    <tr>
                        <th class="text-center">No</th>
                        <th class="text-center">이메일</th>
                        <th class="text-center">이름</th>
                        <th class="text-center">가입일</th>
                        <th class="text-center">역할</th>
                        <th class="text-center">관리</th>
                    </tr>
                    </thead>
                    <tbody>
                    <tr>
                        <th scope="row" class="text-center">1</th>
                        <td class="text-left">hello@nextree.io</td>
                        <td>홍길동</td>
                        <td>92. 5. 22</td>
                        <td>
                            <div role="presentation" class="dropdown">
                                <a id="drop5" href="#" class="dropdown-toggle" data-toggle="dropdown"
                                   aria-haspopup="true" role="button" aria-expanded="false">
                                    관리자
                                    <span class="caret"></span>
                                </a>
                                <ul id="menu2" class="dropdown-menu" role="menu" aria-labelledby="drop5">
                                    <li role="presentation"><a role="menuitem" tabindex="-1" href="#">관리자</a>
                                    </li>
                                    <li role="presentation"><a role="menuitem" tabindex="-1" href="#">멤버</a>
                                    </li>
                                </ul>
                            </div>
                        </td>
                        <td class="align-center">
                            <button class="btn btn-default btn-sm">
                                삭제
                            </button>
                        </td>
                    </tr>
                    <tr>
                        <th scope="row" class="text-center">2</th>
                        <td class="text-left">hello@nextree.io</td>
                        <td>홍길동</td>
                        <td>92. 5. 22</td>
                        <td>
                            <div role="presentation" class="dropdown">
                                <a id="drop5" href="#" class="dropdown-toggle" data-toggle="dropdown"
                                   aria-haspopup="true" role="button" aria-expanded="false">
                                    멤버
                                    <span class="caret"></span>
                                </a>
                                <ul id="menu2" class="dropdown-menu" role="menu" aria-labelledby="drop5">
                                    <li role="presentation"><a role="menuitem" tabindex="-1" href="#">관리자</a>
                                    </li>
                                    <li role="presentation"><a role="menuitem" tabindex="-1" href="#">멤버</a>
                                    </li>
                                </ul>
                            </div>
                        </td>
                        <td class="align-center">
                            <button class="btn btn-default btn-sm">
                                삭제
                            </button>
                        </td>
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
                        <button class="btn btn-primary btn-bordered">
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
    name:'membershipModify',
}
</script>

<style>

</style>