<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="header.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
<title>Add Students Details</title>
</head>
<main class="d-flex align-items-center bg-dark" style="height:100vh">
<div class="container" > 
      <div class="row">
          <div class="col-md-4 offset-md-4">
               <div class="card">
                   <div class="card-header bg-secondary text-light">
                     <h4 align="center">Add Student Details</h4>
                   </div>
                   <div class="card-body">
	            <form action="process" method="post" >
		<table align="center" >
			<tbody>
				<tr>
					<td>Student Id:</td>
					<td><input type="text" name="sid" required /> </td>
				</tr>
				<tr>
					<td>Student name:</td>
					<td><input type="text" name="sname" required  /> </td>
				</tr>
				<tr>
					<td>Standard:</td>
					<td><input type="text" name="std" required /> </td>
				</tr>
				<tr>
					<td>Division</td>
					<td><input type="text" name="div" required /> </td>
				</tr>
				<tr>
					<td>Fee:</td>
					<td><input type="text" name="fee" required /> </td>
				</tr>
				
				<tr>
					<td><a href="home.jsp" >Back</a> </td>
					<td class="d-flex justify-content-center mt-2"><input type="submit" value="Add"  /> </td>
				</tr>
			
			</tbody>
		</table>
	</form>
	
	</div>
          
         </div>
      
      </div>
</div>


</main>
</body>
</html>