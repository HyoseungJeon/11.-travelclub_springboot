<template>
  <div class="container">

        <h2 class="page-title text-center">클럽 등록</h2>

        <div class="content">
            <div class="panel panel-bordered">
                <div class="panel-body">
                    <div class="content">
                        <form class="form-horizontal">
                            <div class="form-group">
                                <label for="inputEmail3" class="col-sm-2 control-label">클럽 이름</label>
                                <div class="col-sm-10">
                                    <input type="text" class="form-control" id="inputEmail3" placeholder="클럽 이름">
                                </div>
                            </div>
                            <div class="form-group">
                                <label for="inputEmail3" class="col-sm-2 control-label">소개</label>
                                <div class="col-sm-10">
                                    <textarea class="form-control" rows="15">java를 탐구하고</textarea>
                                </div>
                            </div>
                        </form>
                    </div>
                </div>
            </div>

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
</template>

<script>
export default {

}
</script>

<style>

</style>