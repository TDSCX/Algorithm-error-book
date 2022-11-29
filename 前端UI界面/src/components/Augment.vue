<template>
	<div class="page">
		<el-form ref="proform" :model="problem">
			<el-form-item label="题目名称" style="margin-left:25%;">
				<el-input v-model="problem.proname" style="width: 50%;"></el-input>
			</el-form-item>
			
			<el-form-item class="problem">
				<div class="general">题目概述</div>
				<el-input class="inputgen"
							  type="textarea"
							  :rows="6"
							  placeholder="请输入题目概述"
							  v-model="problem.protext">
				</el-input>
			</el-form-item> 
			
			<el-form-item label="题目来源" style="margin-left:25%;">
				<el-input v-model="problem.sourceurl" style="width: 50%;"></el-input>
			</el-form-item>
			
			<el-form-item label="题目难度" style="margin-left:25%">
			    <el-select v-model="problem.level" placeholder="请选择题目难度">
			      <el-option label="简单" value="easy"></el-option>
			      <el-option label="中等" value="middle"></el-option>
				  <el-option label="困难" value="difficult"></el-option>
			    </el-select>
			  </el-form-item>
			  
			<el-form-item class="solve">
				<div class="title">解决代码</div>
				<el-input class="inputgen"
							  type="textarea"
							  :rows="7"
							  placeholder="请输入实现代码"
							  v-model="problem.soltext">
				</el-input>
			</el-form-item>
			
			<el-button @click="addpro" class="backin" type="success">提交</el-button>
			  
		</el-form>
		
		
		
	</div>
</template>

<script>
	export default{
		 data() {
		    return {
		      problem:{
				  proname:'',
				  protext:'',
				  sourceurl:'',
				  level:'',
				  soltext:''
			  }
		    }
		},
		methods:{
			addpro(){
				this.$refs['proform'].validate((valid)=>{
					if(valid){						
						this.$axios.post("http://localhost:9999/augment",
						this.$qs.stringify({
							proname:this.problem.proname,
							details:this.problem.protext,
							sourceurl:this.problem.sourceurl,
							analysis:this.problem.soltext,
							level:this.problem.level
							})
						).then(function(result){
							console.log(result)
							window.location="http://localhost:8080/#/"
						})
					}
				})
			}
		}
	}
</script>

<style scoped lang="scss">
	.page{
		height:100vh;
		width: 100%;
		margin: 0;
		background-color: #7daa9b;
		.problem{
			.general{
				padding-top: 10px;
				text-align: center;
				font-weight: bold;
				font-size: 30px;
				color: #aa0e9d;
			}
			.inputgen ::v-deep .el-textarea__inner{
				width: 80%;
				margin-top: 20px;
				margin-left: 10%;
			}
		}
		
		.solve{
			.title{
				padding-top: 10px;
				text-align: center;
				font-weight: bold;
				font-size: 30px;
				color: #aa0e9d;
			}
			.inputgen ::v-deep .el-textarea__inner{
				width: 80%;
				margin-top: 20px;
				margin-left: 10%;
			}
		}
		.backin{
			margin-top: 15px;
			margin-left: 48%;
			margin-bottom: 5px;
		}
	}
</style>