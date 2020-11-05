<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
<title>Welcome Page</title>

</head>
<body class="bg-dark">
       <div class=" text-light mt-2" style="font-size:50px">
                     <h1 align="center">School Billing System </h1>
      </div>
<div class="container-fluid ">
<main class="d-flex justify-content-center align-items-center" style="height:100vh">
<div class="container" > 
      <div class="row">
          <div class="col-md-4 offset-md-4">
                   <div >
                       <table align="center" >
		                     <tr>
			                   <td><a href="Admin_login.jsp" class="btn btn-primary btn-lg btn-block text-light mb-3" >Admin Login</a> </td>
		                     </tr>
		                      <tr>
		                    	<td> <a href="student_search.jsp" class="btn btn-primary btn-lg btn-block text-light mb-3">Student Bill</a> </td>
	                    	 </tr>
		                     <tr>
		                    	<td><a href="staff_search.jsp" class="btn btn-primary btn-lg btn-block text-light">Staff Salary Bill </a> </td>
		                    </tr>
	                   </table>  
                   </div>
              </div>
          
          </div>
      
      </div>
</div>


</main>

</div>
</body>
</html>