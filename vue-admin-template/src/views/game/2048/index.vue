<template>
  <div id="app">
      <ul>
        <li class="box"
          v-for="num in nums"
          :key="num"
          v-text="num"
          v-getclass="num"
          v-getposition="$index"
          trace-by="$index">
        </li>
      </ul>
      <button @click="reset()">重新开始</button>
  </div>
</template>

<script>
export default {
  data() {
    return {
      start: {}, // 记录移动端起点
      
    }
  }
};
</script>

<style>
</style>