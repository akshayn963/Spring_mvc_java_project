 <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="com.sbs.dto.Student"%>
    <%@page import="java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Records</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">

</head>
<body class="bg-dark">

<h3 class="mb-3"><a href="student_search.jsp" >Back</a></h3>
	<table class="table table-bordered text-light">
    <thead class="bg-danger">
    <tr>
      <th scope="col">StudentId</th>
      <th scope="col">Student name</th>
      <th scope="col">standard</th>
      <th scope="col">division</th>
      <th scope="col">fee</th>
      </tr>
  </thead>
	<tbody>
		<tr>
	    <% 
		List<Student> slist = (List<Student>)request.getAttribute("studentlist");
		for(Student st: slist){
		%>
	
		<td><%=st.getSid()%></td>
	    <td><%=st.getSname()%></td>
		<td><%=st.getStd()%></td>
		<td><%=st.getDiv()%></td>
		<td><%=st.getFee()%></td>
	</tr>
	</tbody>
	<%
	} %>
	
	</table>
</body>
</html>