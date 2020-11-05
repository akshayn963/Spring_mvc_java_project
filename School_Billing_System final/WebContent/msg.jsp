 <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
<title>MSG Page</title>
</head>
<body>

<div class="container-fluid bg-dark">
<main class="d-flex align-items-center" style="height:100vh">
<div class="container" > 
      <div class="row">
       <table align="center" >
		<tr Style="font-size:50px;color:white">
			<td> <%=request.getAttribute("msg")%></td>
		</tr>
		<tr class="d-flex justify-content-center align-items-center" Style="font-size:30px">
			<td> <a href="Admin_login.jsp" >Login</a> </td>
		</tr>
	   </table>
      
      </div>
</div>


</main>

</div>
</body>
</html>