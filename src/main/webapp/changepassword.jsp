<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>ChangePassword</title>
<%@include file="Header.jsp" %>
  <link rel="stylesheet" type="text/css" href="style.css">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
        <link href="vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.2/css/all.css" integrity="sha384-oS3vJWv+0UjzBfQzYUhtDYW+Pj2yciDJxpsK1OYPAYjqT085Qq/1cq5FLXAZQ7Ay" crossorigin="anonymous">
        <link href="vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">

        <!-- Custom styles for this template-->
        <link href="style.css" rel="stylesheet">
      
        <!-- Page level plugin CSS-->
        <link href="vendor/datatables/dataTables.bootstrap4.css" rel="stylesheet">
      
        <!-- Custom styles for this template-->
        <link href="css/sb-admin.css" rel="stylesheet">
</head>
<body class="bg-dark">
	<h2>${msg}</h2>
    <div class="container">
        <h2>Change-Password</h2>
        <form action="changepassword.ams" method="post">
          <div class="form-group">
              <div class="row">
                  <div class="col-sm-3">
            <label for="emailId" >EmailId:</label>
            <input type="text" class="form-control" name="emailId" placeholder="Enter emailId">
          </div>
        </div>
      </div>
          <div class="form-group">
              <div class="row">
                  <div class="col-sm-3">
            <label for="oldPassword">OldPassword:</label>
            <input type="pwd" class="form-control" name="oldPassword" placeholder="Enter OldPassword">
          </div>
        </div>
      </div>
       <div class="form-group">
              <div class="row">
                  <div class="col-sm-3">
            <label for="newPassword">NewPassword:</label>
            <input type="pwd" class="form-control" name="newPassword" placeholder="Enter NewPassword">
          </div>
        </div>
      </div>
       <div class="form-group">
              <div class="row">
                  <div class="col-sm-3">
            <label for="confirmPassword">ConfirmPassword:</label>
            <input type="pwd" class="form-control" name="confirmPassword" placeholder="Enter ConfirmPassword">
          </div>
        </div>
      </div>
          
          <input type="submit"  value="Submit"></input> 
          
        </form>
      </div>

  <!-- Bootstrap core JavaScript-->
  <script src="vendor/jquery/jquery.min.js"></script>
  <script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

  <!-- Core plugin JavaScript-->
  <script src="vendor/jquery-easing/jquery.easing.min.js"></script>

</body>

</html>