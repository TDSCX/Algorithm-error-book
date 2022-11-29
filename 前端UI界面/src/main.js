import Vue from 'vue'
import App from './App.vue'
import router from './router'
import ElementUI from 'element-ui'
import 'element-ui/lib/theme-chalk/index.css'
import axios from 'axios'
import qs from 'qs'
import { prototype } from 'core-js/library/core/dict'
import VueResource from 'vue-resource'
Vue.use(VueResource)
Vue.config.productionTip = false
Vue.use(axios)
Vue.prototype.$axios=axios
Vue.prototype.$qs = qs
Vue.use(ElementUI)

new Vue({
  el:'#app',
  axios,
  router,
  render: h => h(App)
})
