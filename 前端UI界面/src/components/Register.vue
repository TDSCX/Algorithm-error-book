<template>
	<div class="page">
		<el-form class="framework" :model="user" :rules="loginrule" ref="userform">
			<div class="logo">
				<img src="../assets/images/TDlogo.jpg"/>
			</div>
			<div class="title">注册</div>
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
				<el-button @click="register" class="registerin" type="primary" round>注册</el-button>			
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
			register(){
				this.$refs['userform'].validate((valid)=>{
					if(valid){
						
						this.$axios.post("http://localhost:9999/register",
						this.$qs.stringify({username:this.user.username,password:this.user.password})
						).then(function(result){
							console.log(result)
							if(result.data=='fail'){
								
							}
							else{
								window.location="http://localhost:8080/#/login"
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
			
			.registerin{
				margin-left: 45%;
				margin-top: 10px;
				margin-bottom: 10px;
			}
			
		}
	}
</style>