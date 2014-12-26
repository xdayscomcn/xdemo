<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="content-type" content="text/html; charset=utf-8" />
<title>选择角色 - Powered By ${systemConfig.systemName}</title>
<meta name="Author" content="山东汇久" />
<meta name="Copyright" content="山东汇久" />
<link rel="icon" href="favicon.ico" type="image/x-icon" />
<#include "/WEB-INF/template/common/include.ftl">
<link href="${base}/template/admin/css/message.css" rel="stylesheet" type="text/css" />
</head>
<body class="message">
	<div class="body">
		<div class="messageBox">
			<div class="boxTop">
				<div class="boxTitle">选择角色&nbsp;</div>
				<a class="boxClose windowClose" href="#" hidefocus="true"></a>
			</div>
			<div class="boxMiddle" style="width:100%;">
				<div class="messageContent"  style="width:100%;">
					<table>
						<tr>
							<#list adminRoles as list>
								<td width="33%" style="cursor:pointer;padding:10px;"  onclick="window.location.href='admin!main.action?id=${list.id}'">
									<div style=" margin-right:0px; margin-left:0;"><img src="${base}/template/admin/images/admin01.png" height="100px"  border="0" alt="${(list.name)!}"></div>
									<div style=" margin-right:0px; margin-left:0;"><strong>${(list.name)!}</strong></div>
								</td>
								
							</#list>
						</tr>
					</table>
				</div>
			</div>
			<div class="boxBottom"></div>
		</div>
	</div>
</body>
</html>