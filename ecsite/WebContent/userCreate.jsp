<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
	<meta http-equiv="Content-Style-Type" content="text/css" />
	<meta http-equiv="Content-Script-Type" content="text/javascript" />
	<meta http-equiv="imagetoolbar" content="no" />
	<meta name="description" content="" />
	<meta name="keywords" content="" />
	<title>UserCreate画面</title>

	<style type="text/css"></style>

</head>
<body>

	<div id="header"></div>
	<div id="main">
		<div id="top">
			<p>UserCreate</p>
		</div>
		<div>
			<s:if test="errorMassage !=''">
				<s:property value="errorMassage" escape="false" />
			</s:if>
			<table>
				<s:form action="UserCreateConfirnAction">
					<tr>
						<td><label>ログインID：</label></td>
						<td><input type="text" name="loginUserId" value="" /></td>
					</tr>
					<tr>
						<td><label>ログインPASS：</label></td>
						<td><input type="text" name="loginPassword" value="" /></td>
					</tr>
					<tr>
						<td><label>ユーザー名：</label></td>
						<td><input type="text" name="userName" value="" /></td>
					</tr>
					<s:submit value="登録" />
				</s:form>
			</table>
				<div>
					<span>前画面に戻るには</span>
					<a href='<s:url action="HomeAction" />'>こちら</a>
				</div>
		</div>
		<div id="footer"></div>
	</div>

</body>
</html>