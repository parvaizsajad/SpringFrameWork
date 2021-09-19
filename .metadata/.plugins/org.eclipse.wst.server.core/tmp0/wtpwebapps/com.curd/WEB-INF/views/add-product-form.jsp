<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%@include file="./base.jsp"%>
</head>
<body>
	<div class="container mt-5">
		<div class="row">
			<div class="col-md-6 offset-md-3">
				<form action="takeForm" method="post">
					<div class="text-center">
						<h3>Add Product Form</h3>
					</div>
					<div class="form-group">
						<label for="exampleInputEmail1">Product Name</label> <input
							type="text" class="form-control" id="exampleInputEmail1"
							aria-describedby="emailHelp" placeholder="Enter Product Name" name="name"> 
						
					</div>
					<div class="form-group">
						<label for="exampleInputPassword1">Product Description</label> 
						<textarea rows="3" cols="3" class="form-control" name="pDesc" placeholder="Enter Description here.."></textarea>
					<div class="form-group">
						<label for="exampleInputEmail1">Product price</label> <input
							type="text" class="form-control" id="exampleInputEmail1"
							aria-describedby="emailHelp" placeholder="Enter Product price" name="pPrice"> 
						
					</div>
						<div class="text-center">
							<a href="${pageContext.request.contextPath}/" class="btn btn-outline-danger">
							Back
							</a>
							
					<button type="submit" class="btn btn-primary btn-outline-success">Submit</button>
							</div>
					
				</form>
			</div>
		</div>
	</div>
</body>
</html>