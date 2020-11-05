<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
<title>Forgot Password Form</title>
</head>
<body>

<div class="container-fluid bg-dark">
<main class="d-flex align-items-center" style="height:100vh">
<div class="container" > 
      <div class="row">
          <div class="col-md-4 offset-md-4">
               <div class="card">
                   <div class="card-header bg-secondary text-light">
                     <h4 align="center">Forgot Password Form</h4>
                   </div>
                   <div class="card-body">
                        <form action="forgot_password.htm" method="post" >
	                       <table align="center" >
	                       	<tr>
		                    	<td>
				                  Registered Email:
			                   </td>
			                   <td>
			                    	<input type="email" name="adminEmail">
			                  </td>
		                   </tr>
		
		                    <tr>
		                 	<td>
		                 		<a href="Admin_login.jsp" >Back</a>
		                 	</td>
		                	<td>
			                	<input type="submit"  value="Submit" >
		                 	</td>
		                   </tr>
	                    </table>
	                  </form> 
                   </div>
              </div>
          
          </div>
      
      </div>
</div>


</main>

</div>
</body>
</html>