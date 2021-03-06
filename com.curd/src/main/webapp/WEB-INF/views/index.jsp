<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false"%>
<%@include file="base.jsp"%>


<html>
<body >



	<table class="table  m-5">
		<thead class="thead-dark">
			<tr>
				<th scope="col">Product Id</th>
				<th scope="col">Product Name</th>
				<th scope="col">Prod Desc</th>
				<th scope="col">Product Price</th>
				<th scope="col">Product Action</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${listOfProducts}" var="s">
				<tr>


					<th scope="row">${s.id}</th>
					<td>${s.name }</td>
					<td>${s.pDesc }</td>
					<td class="font-weight-bold">&#8377;${s.pPrice}</td>
					<td >
					<a href="deleteProduct/${s.id }"> <i class="fas fa-trash text-danger"></i></a>
								<a href="updateProduct/${s.id }"> <i class="fas fa-edit pl-5"></i></a>
					</td>
				</tr>
			</c:forEach>

		</tbody>
	</table>

	<div class="text-center">
		<a href="${pageContext.request.contextPath}/addProduct"
			class="btn btn-outline-danger"> AddProduct </a>
	</div>
</body>
</html>
