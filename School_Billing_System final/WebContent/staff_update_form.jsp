 <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="spr" %> 
    <%@ include file="header.jsp"%>   
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
<title>Update Staff Details</title>
</head>
<body>
<main class="d-flex align-items-center bg-dark" style="height:100vh">
<div class="container" > 
      <div class="row">
          <div class="col-md-4 offset-md-4">
               <div class="card">
                   <div class="card-header bg-secondary text-light">
                     <h4 align="center">Update Staff Details</h4>
                   </div>
                   <div class="card-body">
	            <spr:form action="staff_update.htm" method="post" commandName="staff">
		   <table align="center" >
			<tbody>
				<tr>
					<td><spr:hidden path="staffId"/> </td>
				</tr>
				<tr>
					<td>Staff name:</td>
					<td> <spr:input path="StaffName"/> </td>
				</tr>
				<tr>
					<td>Staff salary::</td>
					<td><spr:input path="StaffSalary"/> </td>
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