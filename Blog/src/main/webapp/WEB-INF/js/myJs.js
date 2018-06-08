/** 分页跳转 **/
function skip() {
	var numer=document.getElementById("nowPageNum").value;
	var maxPage=document.getElementById("maxPage").value;
	var skipurl=document.getElementById("skipurl").value;
	//写个正则表达式
	var reg=new RegExp("^[0-9]*[1-9][0-9]*$");
	var bool =reg.test(numer);
	if(bool){
		if(parseInt(numer) > parseInt(maxPage)){
			window.location.href=skipurl+"nowPageNum=1";
		}else{
			window.location.href=skipurl+"nowPageNum="+numer;
		}
	}else{
		window.location.href=skipurl+"nowPageNum=1";
	}
}

/** 搜索分页跳转 **/
function skipSearch() {
	var numer=document.getElementById("nowPageNum").value;
	var maxPage=document.getElementById("maxPage").value;
	var searchText=document.getElementById("searchText").value;
	//写个正则表达式
	var reg=new RegExp("^[0-9]*[1-9][0-9]*$");
	var bool =reg.test(numer);
	if(bool){
		if(parseInt(numer) > parseInt(maxPage)){
			window.location.href="searchWorld.html?nowPageNum=1&searchText="+searchText;
		}else{
			window.location.href="searchWorld.html?nowPageNum="+numer+"&searchText="+searchText;
		}
	}else{
		window.location.href="searchWorld.html?nowPageNum=1&searchText="+searchText;
	}
}

/** 点赞 **/
function addpraise(id){
	var loadPage = document.getElementById("loadPage");
	loadPage.style.display = "";
	$.ajax({
			type:"post",
			url:"addPraise.html",
			data:"id="+id,
			success:function(dataall){
				var counts = document.getElementById("counts");
				var count = document.getElementById("count");
				counts.innerHTML=parseInt(counts.innerHTML)+1;
				count.innerHTML=parseInt(count.innerHTML)+1;
				loadPage.style.display = "none";
				}
			});
}

/** 评论文章 **/
function addComment() {
	var context = $("#context").val();
	var id = $("#aticleId").val();
	var tittle = $("#aticleTittle").val();
	var loadPage = document.getElementById("loadPage");
	loadPage.style.display = "";
	$.ajax({
		type : "post",
		url : "addCommenting.html",
		data : "id=" + id + "&tittle=" + tittle + "&comment=" + context,
		dataType : 'json',
		success : function(data) {
			if (parseInt(data.check) == 1) {
				window.location.href = "getAticle.html?id=" + id;
			}else if(parseInt(data) == -4) {
				window.location.href = "index.html";
			}else if(parseInt(data) == -5) {
				window.location.href = "wocao.html";
			}else if(parseInt(data.check) == -6) {
				loadPage.style.display = "none";
				swal("OMG", "内容不能为空!", "error");
			}
		}
	});
}

/** 提交留言板 **/
function addMessage() {
	var context = $("#context").val();
	var loadPage = document.getElementById("loadPage");
	loadPage.style.display = "";
	$.ajax({
		type : "post",
		url : "messageAdding.html",
		data : "context=" + context,
		dataType : 'json',
		success : function(data) {
			if (parseInt(data.check) == 1) {
				window.location.href = "message.html";
			}else if(parseInt(data) == -4) {
				window.location.href = "index.html";
			}else if(parseInt(data) == -5) {
				window.location.href = "wocao.html";
			}else if(parseInt(data.check) == -6) {
				loadPage.style.display = "none";
				swal("OMG", "内容不能为空!", "error");
			}
		}
	});
}

/** 搜索 **/
function searching() {
	var context = $("#s").val();
	var loadPage = document.getElementById("loadPage");
	loadPage.style.display = "";
	window.location.href="searchWorld.html?searchText="+context;
}