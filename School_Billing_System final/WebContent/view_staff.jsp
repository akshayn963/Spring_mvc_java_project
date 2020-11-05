  <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="com.sbs.dto.Staff"%>
    <%@page import="java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Records</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">

</head>
<body class="bg-dark">

<h3 class="mb-3"><a href="staff_search.jsp" >Back</a></h3>
	<table class="table table-bordered text-light">
    <thead class="bg-danger">
    <tr>
      <th scope="col">StaffId</th>
      <th scope="col">Staff name</th>
      <th scope="col">Staff Salary</th>
      </tr>
  </thead>
	<tbody>
		<tr>
	    <% 
		List<Staff> slist = (List<Staff>)request.getAttribute("stafflist");
		for(Staff sf: slist){
		%>
	
		<td><%=sf.getStaffId()%></td>
	    <td><%=sf.getStaffName()%></td>
		<td><%=sf.getStaffSalary()%></td>
	</tr>
	</tbody>
	<%
	} %>
	
	</table>
</body>
</html>