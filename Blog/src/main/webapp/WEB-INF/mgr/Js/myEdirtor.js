//添加
var editor;
KindEditor.ready(function(K) {
	editor = K.create('textarea[name="content"]', {
	newlineTag : "br",   
    resizeType : 2,  
    allowPreviewEmoticons : true,  
	fileManagerJson : 'upload.html', 
	uploadJson : 'fileUpload.html',  
	allowFileManager : true,
	allowImageUpload : true,
	});

	K('input[name=getHtml]').click(function(e) {
		var loadPage = document.getElementById("loadPage");
		loadPage.style.display = "";
		var content = editor.html();
		content = encodeURIComponent(content); 
		var tittle = $("#tittle").val();
		var introduction = $("#introduction").val();
		var type = $("#type").val();
		var id = $("#checkUpdateOrAdd").val();
		var imageUrl = $("#url1").val();
		
		if(parseInt(id) == 0){
			$.ajax({
				type:"post",
				url:"addAtcile.html",
				data:"content="+content+"&tittle="+tittle+"&introduction="+introduction+"&type="+type+"&imageUrl="+imageUrl,
				success:function(data){
					data = JSON.parse(data);
					if(parseInt(data.check) == 1){
						window.location.href="aticle.html";
					}else{
						 loadPage.style.display = "none";
						 swal("OMG!", "所有内容都不能为空!", "error");
					}
					}
			});
		}else{
			$.ajax({
				type:"post",
				url:"addAtcile.html",
				data:"content="+content+"&tittle="+tittle+"&introduction="+introduction+"&type="+type+"&id="+id+"&imageUrl="+imageUrl,
				success:function(data){
					data = JSON.parse(data);
					if(parseInt(data.check) == 1){
						window.location.href="aticle.html";
					}else{
						 loadPage.style.display = "none";
						 swal("OMG!", "所有内容都不能为空!", "error");
					}
					}
			});
		}
	});
	
	K('#uploadImage').click(function() {
		editor.loadPlugin('image', function() {
			editor.plugin.imageDialog({
				imageUrl : K('#url1').val(),
				clickFn : function(url, title, width, height, border, align) {
					K('#url1').val(url);
					editor.hideDialog();
				}
			});
		});
	});
});

//单击取消清空
function cleanId() {
	editor.html("");
	$("#tittle").val("");
	$("#introduction").val("");
	$("#url1").val("");
	$("#type option:first").prop("selected", 'selected');
	$("#checkUpdateOrAdd").val("0");
}

//点击添加的时候要清空内容
function cleanAll() {
	editor.html("");
	$("#tittle").val("");
	$("#introduction").val("");
	$("#url1").val("");
	$("#type option:first").prop("selected", 'selected');
	$("#checkUpdateOrAdd").val("0");
}

//查询
function updateAtcile(id) {
	editor.html("");
	$("#tittle").val("");
	$("#introduction").val("");
	$("#url1").val("");
	$("#type option:first").prop("selected", 'selected');
	$.ajax({
		type:"post",
		url:"seleteAtcile.html",
		data:"id="+id,
		dataType:'json',
		success:function(data){
			$("#checkUpdateOrAdd").val(data.aticle.atId);
			$("#tittle").val(data.aticle.atTitle);
			$("#introduction").val(data.aticle.atIntroduction);
			$("#url1").val(data.aticle.atImageUrl);
			editor.html(data.aticle.atContent);
			document.getElementById("type").options[parseInt(data.aticle.atTypeId)-1].selected=true;
			}
		});
	$('#myModal').modal();
}

