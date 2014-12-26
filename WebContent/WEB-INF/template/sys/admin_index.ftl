<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="content-type" content="text/html; charset=utf-8" />
<title>管理中心首页 - Powered By ${systemConfig.systemName}</title>
<meta name="Author" content="XDAYS Team" />
<meta name="Copyright" content="XDAYS" />
<link rel="icon" href="favicon.ico" type="image/x-icon" />
<#include "/WEB-INF/template/common/include.ftl">
<link href="${base}/template/admin/css/admin.css" rel="stylesheet" type="text/css" />
<script type="text/javascript">
$().ready( function() {
	
	
	
});
</script>
</head>
<body class="admin">
	<div class="adminBar">
		<span class="icon">&nbsp;</span>欢迎使用XDEMO系统！
	</div>
	<div class="body">
		<div class="bodyLeft">
			<table class="listTable">
				<tr>
					<th colspan="4">
						软件信息
					</th>
				</tr>
				<tr>
					<td width="110">
						系统名称:
					</td>
					<td>
						${systemConfig.systemName}
					</td>
				</tr>
				<tr>
					<td>
						系统版本:
					</td>
					<td>
						${systemConfig.systemVersion}
					</td>
				</tr>
				<tr>
					<td>
						官方网站:
					</td>
					<td>
						<a href="http://www.xdays.com.cn">http://www.xdays.com.cn</a>
					</td>
				</tr>
				<tr>
					<td>
						技术论坛:
					</td>
					<td>
						<a href="http://bbs.xdays.com.cn">http://bbs.xdays.com.cn</a>
					</td>
				</tr>
				<tr>
					<td>
						授权查询:
					</td>
					<td>
						<a href="http://certificate.xdays.com.cn">在线查询</a>
					</td>
				</tr>
				<tr>
					<td>
						授权提示:
					</td>
					<td>
						<span class="red">在未取得商业授权之前，您不能将本软件应用于商业用途</span>
					</td>
				</tr>
			</table>
			<div class="blank"></div>
			<div class="blank"></div>
			
		</div>
		<div class="bodyRight">
			<table class="listTable">
				<tr>
					<th colspan="4">
						系统信息
					</th>
				</tr>
				<tr>
					<td width="110">
						Java版本:
					</td>
					<td>
						${statics["java.lang.System"].getProperty("java.version")}
					</td>
				</tr>
				<tr>
					<td>
						操作系统名称:
					</td>
					<td>
						${statics["java.lang.System"].getProperty("os.name")}
					</td>
				</tr>
				<tr>
					<td>
						操作系统构架:
					</td>
					<td>
						${statics["java.lang.System"].getProperty("os.arch")}
					</td>
				</tr>
				<tr>
					<td>
						操作系统版本:
					</td>
					<td>
						${statics["java.lang.System"].getProperty("os.version")}
					</td>
				</tr>
				<tr>
					<td>
						当前工作目录:
					</td>
					<td>
						${statics["java.lang.System"].getProperty("user.dir")}
					</td>
				</tr>
				<tr>
					<td>
						临时文件路径:
					</td>
					<td>
						${statics["java.lang.System"].getProperty("java.io.tmpdir")}
					</td>
				</tr>
			</table>
			<div class="blank"></div>
			<div class="blank"></div>
			
		</div>
		<p class="copyright">Copyright © 2015-2020 xdays.com.cn All Rights Reserved.</p>
	</div>
</body>
</html>