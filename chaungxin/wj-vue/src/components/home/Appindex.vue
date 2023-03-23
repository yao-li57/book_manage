<template>
  <div style="margin-top: 40px">
    <side-menu id="side-menu"></side-menu>
    <div className="home">
      <div id="header-div">
        <div style="height: 150px"></div>
        <carousel></carousel>
        <quick-nav style="float: right;margin-top: -450px;margin-right: 480px"></quick-nav>
      </div>
      <update-card id="update-card"></update-card>
      <slogan id="slogan"></slogan>
      <about id="about"></about>
    </div>
  </div>
</template>

<script>
import Carousel from './Carousel' // 走马灯
import QuickNav from './QuickNav' // 卡通
import Slogan from './Slogan' // 底部导航栏
import About from '@/components/common/About' // 底部
import UpdateCard from './UpdateCard' // 更新日志
import SideMenu from './SideMenu' // 侧边导航

export default {
  name: 'AppIndex',
  components: {Carousel, Slogan, About, UpdateCard, QuickNav, SideMenu}
}
</script>

<style scoped>
.home {
  width: 990px;
  margin-left: auto;
  margin-right: auto;
  margin-top: -20px;
}

#header-div {
  padding-bottom: 20px;
  padding-left: 5px;
  background-color: #ffffff;
}

#side-menu {
  position: fixed;
  margin-left: 50%;
  left: -680px;
  top: 100px;
}
</style>
