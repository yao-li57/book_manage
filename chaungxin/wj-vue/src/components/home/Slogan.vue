<template>
  <div class="slogan">
    <el-card className="box-card" class="box-card">
      <div style="font-size: 45px;color: azure;white-space: nowrap">Hello World</div>
      <a href="https://github.com/Antabot/White-Jotter" target="_blank">
<!--        <img src="../../assets/img/icon/icon6.png" alt="" className="git-link" class="git-link">-->
      </a>
      <a href="https://blog.csdn.net/Neuf_Soleil" target="_blank">
<!--        <img src="../../assets/img/icon/csdn.png" alt="" className="csdn-link" class="csdn-link">-->
      </a>
    </el-card>
  </div>
</template>

<script>
export default {
  name: 'Slogan'
}
</script>

<style scoped>
.box-card {
  width: 100%;
  height: 100px;
  background-color: #222;
  text-align: center;
  margin-top: 110px;
}

.slogan {
  width: 100%;
}

.git-link {
  width: 80px;
  /*position: absolute;*/
}

.csdn-link {
  width: 65px;
  /*position: absolute;*/
  margin-bottom: 7px;
  margin-left: 20px;
}
</style>
