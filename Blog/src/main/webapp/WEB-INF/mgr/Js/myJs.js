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
	alert(reg);
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

/** 搜索 **/
function searching() {
	var context = $("#s").val();
	var loadPage = document.getElementById("loadPage");
	loadPage.style.display = "";
	window.location.href="searchWorld.html?searchText="+context;
}

/** 验证码处理 **/
function reloadImgCode() {
	loadPage.style.display = "none";
	$("#imgCode").attr('src', "image_code.html?time=" + new Date().getTime());
}

function doLogin(){
	$("#usernamecheck").html("");
	$("#passwordcheck").html("");
	$("#verifycheck").html("");
	var username = $("#username").val();
	var password = $("#password").val();
	var verify = $("#verify").val();
	if(username != "" && username.length >= 3 ){
		if(password != ""){
			if(verify != "" && verify.length == 4){
				loadPage.style.display = "";
				$.ajax({
					type : "post",
					url : "login.html",
					data : "username=" + username + "&password=" + password + "&verify=" + verify,
					success : function(data) {
						data = JSON.parse(data);
						if (data.check == 0) {
							window.location.href="logining.html";
						} else if (data.check == -1) {
							$("#verifycheck").html("请输入正确的验证码...");
							reloadImgCode();
						}else if(data.check == -2){
							$("#usernamecheck").html("账号密码错误...");
							reloadImgCode();
						}else if(parseInt(data) == -4){
							window.location.href = "index.html";
						}else if(parseInt(data) == -5) {
							window.location.href = "wocao.html";
						}else{
							$("#usernamecheck").html("未知错误...");
							reloadImgCode();
						}
					}
				});
			}else{
				$("#verifycheck").html("请输入正确的验证码...");
				reloadImgCode();
			}
		}else{
			$("#passwordcheck").html("密码不能为空...");
		}
	}else{
		$("#usernamecheck").html("账号必须3位以上...");
	}
}

/** 清空搜索内容 **/
function clearMgrSearch() {$("#searchTerms").find("input").each(function(index, element) {$(this).val(""); }); }

/** 修改文章评论状态 **/
function changeAticleComment(id) {
	var loadPage = document.getElementById("loadPage");
	loadPage.style.display = "";
	$.ajax({
		type : "post",
		url : "changeAticleComment.html",
		data : "id=" + id,
		success : function(data) {
			data = JSON.parse(data);
			$("#" + id).html(data.status);
			if (parseInt(data.status) == 0) {
				$("#" + id + "show").html("显示");
			} else {
				$("#" + id + "show").html("隐藏");
			}
			loadPage.style.display = "none";
		}
	});
}

/** 修改留言状态 **/
function changeComment(id) {
	var loadPage = document.getElementById("loadPage");
	loadPage.style.display = "";
	$.ajax({
		type : "post",
		url : "changeComment.html",
		data : "id=" + id,
		success : function(data) {
			data = JSON.parse(data);
			$("#" + id).html(data.status);
			if (parseInt(data.status) == 0) {
				$("#" + id + "show").html("显示");
			} else {
				$("#" + id + "show").html("隐藏");
			}
			loadPage.style.display = "none";
		}
	});
}

/** 修改心情状态 **/
function changeMood(id) {
	var loadPage = document.getElementById("loadPage");
	loadPage.style.display = "";
	$.ajax({
		type : "post",
		url : "changeMood.html",
		data : "id=" + id,
		success : function(data) {
			data = JSON.parse(data);
			$("#" + id).html(data.status);
			if (parseInt(data.status) == 0) {
				$("#" + id + "show").html("显示");
			} else {
				$("#" + id + "show").html("隐藏");
			}
			loadPage.style.display = "none";
		}
	});
}

/** 发布心情 **/
function addMood(id) {
	var loadPage = document.getElementById("loadPage");
	loadPage.style.display = "";
	var context = $("#context").val();
	$.ajax({
		type : "post",
		url : "addMood.html",
		data : "context=" + context,
		success : function(data) {
			data = JSON.parse(data);
			$("#" + id).html(data.status);
			if (parseInt(data.check) == 0) {
				loadPage.style.display = "none";
				swal("OMG!", "心情内容不能为空!", "error");
			} else {
				window.location.href = "mood.html";
			}
		}
	});
}

/** 修改文章是否首页推荐 **/
var loadPage = document.getElementById("loadPage");
function changeAticle(id) {
	loadPage.style.display = "";
	$.ajax({
		type : "post",
		url : "changeAticle.html",
		data : "id=" + id,
		success : function(data) {
			data = JSON.parse(data);
			$("#" + id).html(data.status);
			if (parseInt(data.status) == 0) {
				$("#" + id + "show").html("置顶首");
			} else {
				$("#" + id + "show").html("不置顶");
			}
			loadPage.style.display = "none";
		}
	});
}

/** 删除文章 **/
function deleteAticle(id) {
	swal({
		title : "您确定要删除吗？",
		text : "您确定要删除这篇文章吗？",
		type : "warning",
		showCancelButton : true,
		closeOnConfirm : false,
		confirmButtonText : "是的，我要删除",
		confirmButtonColor : "#ec6c62"
	}, function() {
		loadPage.style.display = "";
		$.ajax({
			type : "post",
			url : "deleteAticle.html",
			data : "id=" + id,
			success : function(data) {
			}
		}).done(function(data) {
			window.location.href = "aticle.html";
		}).error(function(data) {
			swal("OMG", "删除操作失败了!", "error");
		});
	});
}

/** 删除黑名單 **/
function delBlacklist(id) {
	var ip = $("#"+id).html();
	swal({
		title : "您确定要删除吗？",
		text : "您确定要删除这个黑名单吗？",
		type : "warning",
		showCancelButton : true,
		closeOnConfirm : false,
		confirmButtonText : "是的，我要删除",
		confirmButtonColor : "#ec6c62"
	}, function() {
		loadPage.style.display = "";
		$.ajax({
			type : "post",
			url : "delBlacklist.html",
			data : "id=" + id + "&ip=" + ip,
			success : function(data) {
			}
		}).done(function(data) {
			window.location.href = "blacklistLogs.html";
		}).error(function(data) {
			swal("OMG", "删除操作失败了!", "error");
		});
	});
}
/** 刷新黑名单 **/
function flushBlack() {
	var loadPage = document.getElementById("loadPage");
	swal({
		title : "您确定要刷新吗？",
		text : "您确定要刷新黑名单吗？",
		type : "warning",
		showCancelButton : true,
		closeOnConfirm : false,
		confirmButtonText : "是的，我要刷新",
		confirmButtonColor : "#ec6c62"
	}, function() {
		loadPage.style.display = "";
		$.ajax({
			type : "post",
			url : "flush.html",
			success : function(data) {
			}
		}).done(function(data) {
			swal("Hei", "刷新操作成功了!", "success");
			loadPage.style.display = "none";
		}).error(function(data) {
			swal("OMG", "刷新操作失败了!", "error");
			loadPage.style.display = "none";
		});
	});
}