<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
<title>AdminLogin</title>
</head>
<body>

<div class="container-fluid bg-dark">
<h3 class="mb-3"><a href="index.jsp" >Back</a></h3>
<main class="d-flex align-items-center" style="height:100vh">
<div class="container" > 
      <div class="row">
          <div class="col-md-4 offset-md-4">
               <div class="card">
                   <div class="card-header bg-secondary text-light">
                     <h4 align="center">Login</h4>
                   </div>
                   <div class="card-body">
                         <form action="home.htm" method="post">
                              <div class="form-group">
                                 <label for="adminName">Admin Name</label>
                                    <input type="text" class="form-control" name="adminName" minlength="3" maxlenth="10" required >
                                
                              </div>
                               <div class="form-group">
                                  <label for="adminPass">Password</label>
                                  <input type="password" class="form-control" name="adminPass" minlength="3" maxlenth="10" required>
                               </div>
                              <div class="d-flex justify-content-center mt-2">
                                    <button type="submit" class="btn btn-primary">Login</button>
                              </div>
                              <div class="d-flex justify-content-center mt-2">
                                    <a href="forgot_password.jsp" >Forgot Password</a>
                              </div> 
				               
                              <div class="d-flex justify-content-center mt-2">
                                   <a href="admin_login_form.jsp">SignUp Here</a>
                              </div>
  
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