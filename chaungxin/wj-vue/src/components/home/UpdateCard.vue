<template>
  <el-card class="box-card">
    <div slot="header" class="clearfix">
      <span style="font-weight: bold;font-size: 20px">最近更新</span>
      <!--<el-button style="float: right; padding: 3px 0" type="text">修改</el-button>-->
    </div>
    <div class="block">
      <el-timeline>
        <el-timeline-item timestamp="2022/9/11" placement="top">
          <el-card>
            <h4>实现登陆界面 初步建立前后端联系(未使用数据库) </h4>
            <p>hn 提交于 2022/9/11 11:11</p>
          </el-card>
        </el-timeline-item>
        <el-timeline-item timestamp="2022/9/18" placement="top">
          <el-card>
            <h4>网站主页初步制作，导航栏功能规划</h4>
            <p>hn 提交于 2022/9/18 09:02</p>
          </el-card>
        </el-timeline-item>
        <el-timeline-item timestamp="2022/9/25" placement="top">
          <el-card>
            <h4>数据库相关知识学习，网站主页面大致完成</h4>
            <p>hn 提交于 2022/9/25 22:10</p>
          </el-card>
        </el-timeline-item>
        <el-timeline-item timestamp="2022/10/5" placement="top">
          <el-card>
            <h4>图书界面初步完成</h4>
            <p>hn 提交于 2022/10/5 20:10</p>
          </el-card>
        </el-timeline-item>
        <el-timeline-item timestamp="2022/10/16" placement="top">
          <el-card>
            <h4>数据库的引入(账号密码存入数据库)，增添了前端登录拦截器</h4>
            <p>hn 提交于 2022/10/16 16:10</p>
          </el-card>
        </el-timeline-item>
        <el-timeline-item timestamp="2022/10/24" placement="top">
          <el-card>
            <h4>后端编写图书信息的增删改查接口</h4>
            <p>hn 提交于 2022/10/24 11:58</p>
          </el-card>
        </el-timeline-item>
        <el-timeline-item timestamp="2022/11/1" placement="top">
          <el-card>
            <h4>前端实现图书的增删改核心功能</h4>
            <p>hn 提交于 2022/11/1 15:45</p>
          </el-card>
        </el-timeline-item>
        <el-timeline-item timestamp="2022/11/9" placement="top">
          <el-card>
            <h4>前端实现图书的搜索功能</h4>
            <p>hn 提交于 2022/11/9 16:45</p>
          </el-card>
        </el-timeline-item>
        <el-timeline-item timestamp="2022/11/15" placement="top">
          <el-card>
            <h4>实现图书可按出版社搜索和账户注册功能(密码加盐加密)</h4>
            <p>hn 提交于 2022/11/15 17:21</p>
          </el-card>
        </el-timeline-item>
        <el-timeline-item timestamp="2022/11/23" placement="top">
          <el-card>
            <h4>实现账号的登出功能</h4>
            <p>hn 提交于 2022/11/23 17:35</p>
          </el-card>
        </el-timeline-item>
        <el-timeline-item timestamp="2022/11/30" placement="top">
          <el-card>
            <h4>个人中心初步开发</h4>
            <p>hn 提交于 2022/11/30 15:28</p>
          </el-card>
        </el-timeline-item>
        <el-timeline-item timestamp="2022/12/07" placement="top">
          <el-card>
            <h4>个人中心后端功能实现</h4>
            <p>hn 提交于 2022/12/07 18:32</p>
          </el-card>
        </el-timeline-item>
        <el-timeline-item timestamp="2022/12/12" placement="top">
          <el-card>
            <h4>个人中心功能实现</h4>
            <p>hn 提交于 2022/12/12 21:59</p>
          </el-card>
        </el-timeline-item>
      </el-timeline>
    </div>
  </el-card>
</template>

<script>
export default {
  name: 'UpdateCard'
}
</script>

<style scoped>
  .box-card {
    margin-top: 5px;
    margin-left: 20%;
    width: 988px;
    height: 2400px;
    text-align: left;
    background-color: #ffffff;
  }
</style>
