<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
<style>
.button {
  background-color: dodgerblue; /* Green */
  border: none;
  color: white;
   padding: 10px 24px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 14px;
  margin: 4px 2px;
  cursor: pointer;
   border-radius:4px;
 
}
</style>

</style>
</head>
<body>
 <form:form action="register" method="post" modelAttribute="regBean">
 <table align="center" cellspacing="30" border="0">
      <tr>
      <td>Username</td>
      <td><input type="text" name="name" autofocus ></td>
      </tr>
      <tr>
      <td>Email</td>
      <td><input type="text" name="email" ></td>
      </tr>
       <tr>
      <td>Password</td>
      <td><input type="password" name="pass"  ></td>
      </tr>
      <tr>
      <td>Phone</td>
      <td><input type="number" name="phone"  ></td>
      </tr>
      <tr><td colspan="4" style="text-align: center;"><input type="submit" class="button" name="submit" value="SignUp" ></td>
   
      </tr>
      </table>
      </form:form>

</body>
</html>