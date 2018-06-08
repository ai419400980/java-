/** 360抓取连接 **/
(function() {
	var src = (document.location.protocol == "http:") ? "http://js.passport.qihucdn.com/11.0.1.js?8b603c2f170b820ee9a56307206c453a"
			: "https://jspassport.ssl.qhimg.com/11.0.1.js?8b603c2f170b820ee9a56307206c453a";
	document.write('<script src="' + src + '" id="sozz"><\/script>');
})();

/** 百度抓取连接 **/
window.onload=function(){
	(function(){
	    var bp = document.createElement('script');
	    var curProtocol = window.location.protocol.split(':')[0];
	    if (curProtocol === 'https'){
	   bp.src = 'https://zz.bdstatic.com/linksubmit/push.js';
	  }
	  else{
	  bp.src = 'http://push.zhanzhang.baidu.com/push.js';
	  }
	    var s = document.getElementsByTagName("script")[0];
	    s.parentNode.insertBefore(bp, s);
	})();
}


/** 分页跳转 **/
function skip() {
	var numer=document.getElementById("nowPageNum").value;
	var maxPage=document.getElementById("maxPage").value;
	var skipurl=document.getElementById("skipurl").value;
	//写个正则表达式
	var reg=new RegExp("^[0-9]*[1-9][0-9]*$");
	var bool =reg.test(numer);
	if(bool){
		if(numer > maxPage){
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
		if(numer > maxPage){
			window.location.href="searchWorld.html?nowPageNum=1&searchText="+searchText;
		}else{
			window.location.href="searchWorld.html?nowPageNum="+numer+"&searchText="+searchText;
		}
	}else{
		window.location.href="searchWorld.html?nowPageNum=1&searchText="+searchText;
	}
}

/** 点赞 * */
function addpraise(id) {
	var loadPage = document.getElementById("loadPage");
	loadPage.style.display = "";
	$.ajax({
		type : "post",
		url : "addPraise.html",
		data : "id=" + id,
		success : function(dataall) {
			var counts = document.getElementById("counts");
			var count = document.getElementById("count");
			counts.innerHTML = parseInt(counts.innerHTML) + 1;
			count.innerHTML = parseInt(count.innerHTML) + 1;
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