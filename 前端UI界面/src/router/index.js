import Vue from 'vue'
import Router from 'vue-router'
import Overview from '@/components/Overview'
import Login from '@/components/Login'
import Register from '@/components/Register'
import Augment from '@/components/Augment'
import Specific from '@/components/Specific'

Vue.use(Router)

export default new Router({
  routes: [
    {
		path:'/login',
		name:'Login',
		component:Login
    },
	{
		path: '/',
		name: 'Overview',
		component: Overview
	},
	{
		path:'/register',
		name:'Register',
		component:Register		
	},
	{
		path:'/augment',
		name:'Augment',
		component:Augment
	},
	{
		path:'/specific',
		name:'Specific',
		component:Specific
	}
  ]
})