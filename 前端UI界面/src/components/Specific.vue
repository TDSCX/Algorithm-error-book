<template>
	<div class="pageall">
		<el-container>
		  <el-aside width="600px">
			  <h2>题目简介</h2>
			  <div class="protext">
				  {{prodetail}}
			  </div>
		  </el-aside>
		  <el-container>		    
		    <el-main class="answer">
				{{solvecode}}
			</el-main>
		    <el-footer class="axfoot">
				{{proname}}
			</el-footer>
		  </el-container>
		</el-container>
	</div>
</template>

<script>
	export default{
		data() {
			return{
				prodetail:'',
				solvecode:'',
				proname:''
			}
		},
		
		created(){
			this.$axios.get(
				'http://127.0.0.1:9999/'
			).then(res=>{
				this.prodetail=res.data[0].details;
				this.solvecode=res.data[0].analysis;
				this.proname=res.data[0].proname;
			})
		}
	}
</script>

<style lang="scss">
	.pageall{
	height: 100vh;
	width: 100%;
	.el-aside{
		background-color: #8bfff8;
		height: 100vh;
		h2{
			text-align: center;
		}
	}
	.el-container{
		.answer{
			background-color: #55557f;
		}
		
		.axfoot{
			position: relative;
			height: 30%;
			
			background-color: #ff557f;
			color: #333;
			text-align: center;
			line-height: 60px;
		  }
		}
	}
</style>