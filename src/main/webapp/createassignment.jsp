<!DOCTYPE html>
<html>
<head>
<title>CreateAssignment</title>
<%@include file="Header.jsp"%>
<link rel="stylesheet" type="text/css" href="style.css">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<link href="vendor/fontawesome-free/css/all.min.css" rel="stylesheet"
	type="text/css">
<link rel="stylesheet"
	href="https://use.fontawesome.com/releases/v5.8.2/css/all.css"
	integrity="sha384-oS3vJWv+0UjzBfQzYUhtDYW+Pj2yciDJxpsK1OYPAYjqT085Qq/1cq5FLXAZQ7Ay"
	crossorigin="anonymous">

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
		<h2>Create-Assignment</h2>
		<form action="createAssignment.ams" method="post">
			<div class="form-group">
				<div class="row">
					<div class="col-sm-3">
						<label for="course">Course:</label> <select name="course"
							style="color: black">
							<option>--select--</option>
							<option>JAVA</option>
							<option>SPRING</option>
							<option>HIBERNATE</option>
							<option>SQL</option>
							<option>HTML</option>
							<option>ANGULAR</option>
							<option>PYTHON</option>
							<option>C</option>
							<option>EMBEDDED</option>
							<option>VLSI</option>
						</select><br>
					</div>
				</div>
			</div>

			<div class="form-group">
				<div class="row">
					<div class="col-sm-3">
						<label for="topic">Topic:</label> <select name="topic"
							style="color: black">
							<option>--select--</option>
							<option>Collections</option>
							<option>Spring-MVC</option>
							<option>Hibernate-Mapping</option>
							<option>Joins</option>
							<option>Html-tags</option>
							<option>Angular-Directives</option>
							<option>Python-Collection</option>
							<option>C-pointers</option>
							<option>Analog-circuits</option>
							<option>Digital-Vlsi</option>
						</select><br>
					</div>
				</div>
			</div>
			<div class="form-group">
				<div class="row">
					<div class="col-sm-3">
						<label for="description">Description:</label>
						<textarea rows="4" cols="4" class="form-control"
							name="description" placeholder="Enter Email"></textarea>
					</div>
				</div>
			</div>
			<div class="form-group">
				<div class="row">
					<div class="col-sm-3">
						<label for="deadLine"> DeadLine:</label> <input type="date"
							class="form-control" name="deadLine" placeholder="Enter sub-date">

					</div>
				</div>
			</div>
		<div class="form-group">
				<div class="row">
					<div class="col-sm-3">
						<label for="uploadType">UploadType</label> <select
							name="uploadType" style="color: black">
							<option>--select--</option>
							<option>.zip</option>
							<option>.pdf</option>
							<option>.docx</option>
							<option>.sql</option>
							<option>.xml</option>
							<option>.py</option>
							<option>.ppt</option>
						</select><br>
					</div>
				</div>
			</div>  
			<input type="submit" value="Create"> 
			<input type="reset" value="reset">

		</form>
	</div>
	<h3>${msg}</h3>
	<script src="vendor/jquery/jquery.min.js"></script>
  <script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

  <!-- Core plugin JavaScript-->
  <script src="vendor/jquery-easing/jquery.easing.min.js"></script>
</body>
</html>