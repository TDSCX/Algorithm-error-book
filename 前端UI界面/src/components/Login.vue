<template>
	<div class="page">
		<el-form class="framework" :model="user" :rules="loginrule" ref="userform">
			<div class="logo">
				<img src="../assets/images/TDlogo.jpg"/>
			</div>
			<div class="title">登录</div>
			<div class="name">
				<el-form-item class="username" prop="username" label="用户名">
				<el-input v-model="user.username" placeholder="请输入用户名"></el-input>
				</el-form-item>
			</div>
			<div class="password">
				<el-form-item class="userpassword" prop="password" label="密码">
				<el-input v-model="user.password" placeholder="请输入密码"></el-input>
				</el-form-item>
			</div>
			<el-button @click="login" class="loginin" type="primary" round>登录</el-button>
			<div class="prompt">
				<div class="promptregister">您还没有注册?</div>
				<a href="/#/register" style="text-decoration: none;">
					点击这里注册
				</a>
			</div>
		</el-form>
	</div>
</template>

<script>
	export default{
		data(){
			return{
				user:{
				username:'',
				password:'',
				},
				loginrule:{
					username:[
						{required:true,message:'请输入账号',trigger:'blur'},
						{min:3,max:10,message:'长度在3到10个字符范围内',trigger:'blur'}
					],
					password:[
						{required:true,message:'请输入密码',trigger:'blur'},
						{min:6,max:12,message:'长度在6到12个字符范围内',trigger:'blur'}
					]
				}
			}
		},
		methods:{
			login(){
				this.$refs['userform'].validate((valid)=>{
					if(valid){
						this.$axios.post("http://localhost:9999/login",
						this.$qs.stringify({
							username:this.user.username,
							password:this.user.password,
							})
						).then(function(result){
							console.log(result)
							if(result.data=='fail'){
								window.location="http://localhost:8080/#/login"
							}
							else{
								window.location="http://localhost:8080/#/"
							}
						})
					}
				})
			}
		}
	}
</script>

<style scoped lang="scss">
	
	.page{
		height:120vh;
		width: 100%;
		background-color: #0055ff;	
		.framework{
			position: absolute;
			left: 30%;
			top: 5%;
			width: 40%;
			background-color: #fff;
			border: #000000 1px;
			border-radius: 4px;
			.logo{
				margin-left: 20%;
			}
			.title{
				text-align: center;
				font-weight: bold;
				font-size: 24px;
			}
			.name{
				width: 80%;
				margin-left: 10%;				
			}
			.password{
				margin-top: 10px;
				width: 80%;
				margin-left: 10%;
			}
			.loginin{
				margin-top: 15px;
				margin-left: 45%;
			}
			.prompt{
				margin: 15px;
				margin-left: 43%;
			}
		}
	}
</style>