<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
<title>Search Staff Records</title>
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
                     <h4 align="center">Search Staff Records</h4>
                   </div>
                   <div class="card-body">
                          <form action="show_staffbill.htm" method="post">
                            <div>
                               <label for="staffId">Staff id:</label>
                                 <input type="text" name="staffId" id="staffId" required></input>
                            </div>
                            <div class="d-flex justify-content-center align-items-center mt-3">
                                 <button type="submit">Show Bill</button>
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