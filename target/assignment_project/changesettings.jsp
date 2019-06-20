<!DOCTYPE html>
<html>
<head>
 <title>X-workz-Change-Settings</title>
 <%@include file="Header.jsp" %>
<link rel="stylesheet" type="text/css" href="style.css">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<link href="vendor/fontawesome-free/css/all.min.css" rel="stylesheet"
	type="text/css">
<link rel="stylesheet"
	href="https://use.fontawesome.com/releases/v5.8.2/css/all.css"
	integrity="sha384-oS3vJWv+0UjzBfQzYUhtDYW+Pj2yciDJxpsK1OYPAYjqT085Qq/1cq5FLXAZQ7Ay"
	crossorigin="anonymous">
<link href="vendor/fontawesome-free/css/all.min.css" rel="stylesheet"
	type="text/css">

<!-- Custom styles for this template-->
<link href="style.css" rel="stylesheet">

<!-- Page level plugin CSS-->
<link href="vendor/datatables/dataTables.bootstrap4.css"
	rel="stylesheet">

<!-- Custom styles for this template-->
<link href="css/sb-admin.css" rel="stylesheet">
 
</head>
<body class="bg-dark">
    
    <div class="container">
        <h2>Change-Settings</h2>
        <form action="changesettings.ams" method="post" >
          <div class="form-group">
              <div class="row">
              <div class="col-sm-3">
            <label for="firstName">First name:</label>
              <input type="text" class="form-control" name="firstName" placeholder="Enter FirstName">
          </div>
        </div>
          </div>
          
          <div class="form-group">
              <div class="row">
            <div class="col-sm-3">
            <label for="lastName">Last name:</label>
                <input type="text" class="form-control" name="lastName" placeholder="Enter LastName">
          </div>
        </div>
        </div>
          <div class="form-group">
              <div class="row">
              <div class="col-sm-3">
                  <label for="emailId">Email Address:</label>
                <input type="text" class="form-control" name="emailId" placeholder="Enter Email">
                </div>
              </div>
              </div>
         
              <div class="form-group">
              <div class="row">
                  <div class="col-sm-3">
              <label for="phoneNo">Phone.No:</label>
            <input type="text" class="form-control" name="phoneNo" placeholder="Enter Phone.No">
                </div>
              </div>
              </div> 
         <input type="submit" value="change">
		<input type="reset" value="reset">
        </form>
      </div>
  <h3>${msg}</h3>	

  <!-- Bootstrap core JavaScript-->
  <script src="vendor/jquery/jquery.min.js"></script>
  <script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

  <!-- Core plugin JavaScript-->
  <script src="vendor/jquery-easing/jquery.easing.min.js"></script>

</body>

</html>
