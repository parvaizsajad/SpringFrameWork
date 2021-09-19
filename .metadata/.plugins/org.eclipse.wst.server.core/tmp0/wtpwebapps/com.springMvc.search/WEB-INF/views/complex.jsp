<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

  
   <div class="card mx-auto m-5" style="width: 18rem;">
 
  <div class="card-body">
    <h5 class="card-title">Complex form</h5>
    
  <div class="alert alert-danger" role="alert">
<form:errors path="form.*"/>
</div>
    
     <form action="handleform" method="post">
   <h3 class="text-center"></h3>
   
    <div class="form-group">
    <label for="name">Name</label>
    <input type="text" class="form-control" id="name" aria-describedby="emailHelp" name="name" placeholder="Enter Name">
    
     <label for="id">Id</label>
    <input type="text" class="form-control" id="id" aria-describedby="emailHelp" name="id"  placeholder="Enter Id">
    
    
      <label for="dob">DOB</label>
    <input type="text" class="form-control" id="dob" aria-describedby="emailHelp" name="dob"  placeholder="dd/MM/yyyy">
    
    <h7> courses</h7>
   <div class="form-group">
 <label for="">Courses</label><select class="form-control" name="courses" multiple="multiple">
 <option value="Python">Python</option> 
  <option value="java">java</option>
   <option value="C#">C#</option>
    <option value="Spring">Spring</option>
 </select>
    

     <h6>Gender</h6>
    <div class="input-group-text">

    <input class="gender" type="radio" name="gender" value="Male" id="male1">Male
    </div>
    <div class="input-group-text">
    <input class="gender" type="radio"  name="gender" value="Female" id="male1">Female
    </div>

 <div class="form-group">
 <label for="">Student Type</label><select class="form-control" name="type">
 <option value="oldStudent">oldStudent</option>
  <option value="newStudent">newStudent</option>
 </select>
 
 <hr>
    <input type="text" class="form-control" id="street" aria-describedby="emailHelp" name="address.street" placeholder="Enter street">
        <input type="text" class="form-control" id="city" aria-describedby="emailHelp" name="address.city" placeholder="Enter City">
 </div>
<br>
    
      <button type="submit" class="btn btn-primary">Submit</button>
</form>
    

  </div>
  </div>
</div>
  
 

    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
  </body>
</html>