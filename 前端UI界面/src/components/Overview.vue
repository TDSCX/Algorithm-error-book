<template>
	<div class="page">
		<el-container style="height: 100%; border: 1px solid">
		  <el-aside width="200px" style="background-color: rgb(238, 241, 246)">
		    <el-menu>
		      <el-submenu index="1">
		        <template slot="title"><i class="el-icon-message"></i>推荐推广</template>
		        <el-menu-item-group>
		          <template slot="title">好物推荐</template>
		          <el-menu-item index="1-1">
					  <a style="text-decoration: none;" href="https://union-click.jd.com/jdc?e=618%7Cpc%7C&p=JF8BAJwJK1olXDYDZBoCUBVIMzZNXhpXVhgcBwADUlRMVnBaRQcLbX1JNQctaS9pZhtqbF4WXFgEF0Qraw0bD18NG1oUVAQCU1ZbOEgWAGcNElwTXQQyZF5eOAB5Al8KGloQVQcLUVdaOEsQBGwBHFkcWQEAUVhtD0seMypdUx9BCEIyZG5eOEwXCnsOaRpHSQBwZG5cOEgnM20JGl8cbTY">
						  图书
					  </a>
				  </el-menu-item>
		          <el-menu-item index="1-2">
					  <a style="text-decoration: none;" href="https://union-click.jd.com/jdc?e=618%7Cpc%7C&p=JF8BAJwJK1olXDYDZBoCUBVIMzZNXhpXVhgcAwADXVRMVnBaRQcLbX95M1cObxlIYAQSEkFwImNjLDspew0bD18NG1oUVAQCU1ZbOEgWAGcNElwTXQQyZF5eOAB5Al8KGloQVQcLUVdaOEsQBGwBHFkdWQEHXFxtD0seMypdUx9BCEIyZG5eOEwXCnsOaRpHSQBwZG5cOEgnM20JGl8cbTY">
						  食品饮料
					  </a>
				  </el-menu-item>
		        </el-menu-item-group>
		        <el-menu-item-group title="折扣福利群">
		          <el-menu-item index="1-3">
					  QQ群:444306536
				  </el-menu-item>
		        </el-menu-item-group>		        
		      </el-submenu>
		      <el-button  style="margin-left: 40px;">   
					<a style="text-decoration: none;" href="/#/augment">添加题目</a>				
			   </el-button>		      
		    </el-menu>
		  </el-aside>
		  
		  <el-container>
		    <el-header style="text-align: right; font-size: 24px">
		      <span>{{username}}</span>
		    </el-header>
		    
		    <el-main>
		      <el-table :data="tableData">
		        <el-table-column prop="name" label="题目名称" width="300px">
		        </el-table-column>
				<el-table-column prop="source" label="题目来源" width="350px">					
				</el-table-column>
		        <el-table-column prop="level" label="题目评级" width="100px">				
		        </el-table-column>
				<el-table-column prop="detail" label="详情">		
					
				</el-table-column>
		      </el-table>
		    </el-main>
		  </el-container>
		</el-container>
	</div>
</template>

<script>
	export default{
		data(){
			return{
				username:"",
				tableData:[{
					name:'',
					source:'',
					level:'',
					detail:''
				}]					
			}
		},
		created(){
			this.$axios.get(
				'http://127.0.0.1:9999/'
			).then(res=>{
				var len = res.data.length;
				var i = 0;
				this.username=res.data[0].username;
				for(;i<len;i++){
				this.tableData[i].level=res.data[i].level;
				this.tableData[i].name=res.data[i].proname;
				this.tableData[i].source=res.data[i].sourceurl;
				this.tableData[i].detail='http://localhost:8080/#/specific'+'?'+'id='+res.data[i].id
				}
				
				
			})
		}
	}
</script>

<style scoped lang="scss">
	.page{
		height:100vh;
		width: 100%;
		margin: 0;
		.el-header {
		    background-color: #4bcfd1;
		    color: #333;
		    line-height: 60px;
		  }
		  
		  .el-aside {
		    color: #333;
		  }
	}
</style>