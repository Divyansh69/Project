<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Regitration page</title>
  
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container">
  <h2 align="center"> User Registration</h2>
  <form class="form-horizontal" action="/action_page.php">
    <div class="form-group">
      <label class="control-label col-sm-2" for="firstName">First Name:</label>
      <div class="col-sm-5">
        <input type="text" class="form-control" id="firstName" placeholder=" Enter first name" name="firstName">
      </div>
    </div>
    <div class="form-group">
      <label class="control-label col-sm-2" for="lastName">Last Name:</label>
      <div class="col-sm-5">          
        <input type="text" class="form-control" id="pwd" placeholder="Enter last name" name="lastName">
      </div>
    </div>
      <div class="form-group">
      <label class="control-label col-sm-2" for="Dob">Date of birth:</label>
      <div class="col-sm-2">          
        <input type="date" class="form-control" id="dob" placeholder="Enter Date of Birth" name="dob">
      </div>
    </div>
      <div class="form-group">
      <label class="control-label col-sm-2" for="mobileNo">Mobile number:</label>
      <div class="col-sm-5">          
        <input type="number" class="form-control" id="pwd" placeholder="Enter the mobile number" name="mobileno">
      </div>
    </div>
      <div class="form-group">
      <label class="control-label col-sm-2" for="address">Address:</label>
      <div class="col-sm-5">          
        <input type="text" class="form-control" id="address" placeholder="Enter your Address" name="address">
      </div>
    </div>
      <div class="form-group">
      <label class="control-label col-sm-2" for="state">State:</label>
      <div class="col-sm-2">          
        <input type="text" class="form-control" id="state" placeholder="Enter state" name="state">
      </div>
    </div>
     <div class="form-group">
      <label class="control-label col-sm-2" for="city">City:</label>
      <div class="col-sm-2">
        <input type="text" class="form-control" id="city" placeholder=" Enter city" name="city">
      </div>
    </div>
    <div class="form-group">
      <label class="control-label col-sm-2" for="pincode">Pin Code:</label>
      <div class="col-sm-5">
        <input type="number" class="form-control" id="pincode" placeholder=" Enter Pin Code" name="pincode">
      </div>
    </div>
    <div class="form-group">
      <label class="control-label col-sm-2" for="userName">User Name:</label>
      <div class="col-sm-5">
        <input type="text" class="form-control" id="userName" placeholder=" Enter User Name" name="userName">
      </div>
    </div>
    <div class="form-group">
      <label class="control-label col-sm-2" for="password">Password:</label>
      <div class="col-sm-5">
        <input type="Password" class="form-control" id="password" placeholder=" Enter Password" name="password">
      </div>
    </div>
    <div class="form-group">
      <label class="control-label col-sm-2" for="confirmPassword">Password:</label>
      <div class="col-sm-5">
        <input type="Password" class="form-control" id="confirmPassword" placeholder=" Enter onfirm Password" name="confirmPassword ">
      </div>
    </div>
   
    <div class="form-group">        
      <div class="col-sm-offset-2 col-sm-10">
        <div class="checkbox">
          <label><input type="checkbox" name="remember"> Remember me</label>
        </div>
      </div>
    </div>
    <div class="form-group">        
      <div class="col-sm-offset-2 col-sm-10">
        <button type="submit" class="btn btn-default">Submit</button>
      </div>
    </div>
  </form>
</div>

</body>
</html>
