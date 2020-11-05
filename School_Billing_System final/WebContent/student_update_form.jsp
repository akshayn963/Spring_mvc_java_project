<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="spr" %> 
    <%@ include file="header.jsp"%>   
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
<title>Update Students Details</title>
</head>
<body>
<main class="d-flex align-items-center bg-dark" style="height:100vh">
<div class="container" > 
      <div class="row">
          <div class="col-md-4 offset-md-4">
               <div class="card">
                   <div class="card-header bg-secondary text-light">
                     <h4 align="center">Update Student Details</h4>
                   </div>
                   <div class="card-body">
	            <spr:form action="student_update.htm" method="post" commandName="student">
		   <table align="center" >
			<tbody>
				<tr>
					<td><spr:hidden path="sid"/> </td>
				</tr>
				<tr>
					<td>Student name:</td>
					<td> <spr:input path="sname"/> </td>
				</tr>
				<tr>
					<td>Standard:</td>
					<td><spr:input path="std"/> </td>
				</tr>
				<tr>
					<td>Division</td>
					<td> <spr:input path="div"/> </td>
				</tr>
				<tr>
					<td>Fee:</td>
					<td><spr:input path="fee"/> </td>
				</tr>
				
				<tr>
				    <td></td>
					<td class="d-flex justify-content-center align-items-center mt-2"><input type="submit" value="Update"  /> </td>
				</tr>
			
			</tbody>
		</table>
	</spr:form>
	
	</div>
          
         </div>
      
      </div>
</div>


</main>
</body>
</html>