<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
body {
  font-family: "Lato", sans-serif;
}

.sidenav {
  height: 100%;
  width: 0;
  position: fixed;
  z-index: 1;
  top: 0;
  left: 0;
  background-color: #111;
  overflow-x: hidden;
  transition: 0.5s;
  padding-top: 60px;
}

.sidenav a {
  padding: 8px 8px 8px 32px;
  text-decoration: none;
  font-size: 25px;
  color: #818181;
  display: block;
  transition: 0.3s;
}

.sidenav a:hover {
  color: #f1f1f1;
}

.sidenav .closebtn {
  position: absolute;
  top: 0;
  right: 25px;
  font-size: 36px;
  margin-left: 50px;
}

#main {
  transition: margin-left .5s;
  padding: 16px;
}

@media screen and (max-height: 450px) {
  .sidenav {padding-top: 15px;}
  .sidenav a {font-size: 18px;}
}
</style>
 <link href="style.css" rel="stylesheet">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
 <link href="vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.2/css/all.css" integrity="sha384-oS3vJWv+0UjzBfQzYUhtDYW+Pj2yciDJxpsK1OYPAYjqT085Qq/1cq5FLXAZQ7Ay" crossorigin="anonymous">
        <link href="vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

</head>

<body >
<div class="fixed-header" >


<div id="main">
<div class="row">

<span style="font-size:30px;cursor:pointer" onclick="openNav()">&#9776;	</span>
			<div class="col-md-4">
			<div class="site-logo">
					<img src="Logo.png" width="90px" height="40px">
				</div>
			
				
		 
		 <div id="mySidenav" class="sidenav">
  <a href="javascript:void(0)" class="closebtn" onclick="closeNav()">&times;</a>
  <a href="searching.jsp">Search</a>
  <a href="createassignment.jsp">CreateAssignment</a>
  <a href="assigning.jsp">Assign</a>
  <a href="changesettings.jsp">ChangeSettings</a>
</div>
</div>

			
			<nav>
			<div class="scrollmenu">
				<a class="active" href="Home.jsp"><i class="fa fa-fw fa-home"></i> Home</a>
				<a href="#about">About</a> <a href="#"><i
					class="fa fa-fw fa-envelope"></i> Contact</a>
					<div class="float-right">
					<a class="dn_btn mr-1 ml-1" href="signin.jsp"> <i
						class="fas fa-sign-in-alt"></i> login
					</a> <a class="dn_btn mr-1 ml-1" href="signup.jsp"> <i
						class="fas fa-user-plus"></i> signup
					</a>
					</a> <a class="dn_btn mr-1 ml-1" href="signout.ams"> <i class="fas fa-sign-out-alt"></i></i>signout
					</a>

				</div>
			</div>
		</nav>
		</div>
		</div>

  <!-- <h2>Sidenav Push Example</h2>
  <p>Click on the element below to open the side navigation menu, and push this content to the right.</p> -->
 
</div>

<script>
function openNav() {
  document.getElementById("mySidenav").style.width = "250px";
  document.getElementById("main").style.marginLeft = "250px";
}

function closeNav() {
  document.getElementById("mySidenav").style.width = "0";
  document.getElementById("main").style.marginLeft= "0";
}
</script>
<div class="text-center welcom-text"></div>
	<div class="fixed-footer">
		<div class="container" align="center">Copyright &copy; 2019 Your Company</div>
	</div>   
</body>
</html> 
