<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form action="resetPass" method="post" modelAttribute="repass">
		<table align="center" cellspacing="30" border="0">
			<tr>
				<td>New password : </td>
				<td><input type="password" name="pass1"  autofocus></td>
			</tr>
			<tr>
				<td>Confirm Password : </td>
				<td><input type="password" name="pass2" ></td>
			</tr>
			<tr>
				<td colspan="4" style="text-align: center;"><input type="submit" name="submit"
					value="Submit"> </td>
					
					</tr>
		</table>
	</form:form>
</body>
</html>