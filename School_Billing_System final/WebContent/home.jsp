<%@ page import="com.sbs.dto.Admin" %>
<%@ include file="header.jsp"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 
  <% 
     Admin admin=(Admin)session.getAttribute("admin");
	if(admin!=null){
  %> 
  <%@ include file="cache_control.jsp"  %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>Home</title>
</head>
<body>
<div class="container-fluid bg-dark">
<div class="container d-flex justify-content-center align-items-center" style="height:100vh">
  <div class="col-sm-6">
    <div class="card">
      <div class="card-body">
        <h5 class="card-title">Add students details</h5>
        <a href="add_form.htm" class="btn btn-primary">Add details</a>
        <a href="show_record.htm" class="btn btn-primary">show records</a>
      </div>
    </div>
  </div>
  <div class="col-sm-6">
    <div class="card">
      <div class="card-body">
        <h5 class="card-title">Add Staff and Teachers details</h5>
        <a href="addstaff_form.htm" class="btn btn-primary">Add details</a>
         <a href="showstaff_record.htm" class="btn btn-primary">show records</a>
      </div>
    </div>
  </div>
</div>
</div>

</body>
</html>
<% }else{
     response.sendRedirect("Admin_login.jsp");	
	}
 %>
