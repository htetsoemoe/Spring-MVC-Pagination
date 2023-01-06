<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Pagination</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js" integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN" crossorigin="anonymous"></script>
</head>
<body>

	<div class="container">
		<h2 class="text-center text-primary mt-4 mb-4">Spring MVC Pagination Example</h2>
		
		<table class="table table-striped">
			<thead class="bg-primary">
				<tr>
					<th>ID</th>
					<th>Name</th>
					<th>Position</th>
					<th>Salary</th>
				</tr>
			</thead>
				
			<tbody>
				<c:forEach var="emp" items="${ list }">
					<tr>
						<td>${ emp.id }</td>
						<td>${ emp.name }</td>
						<td>${ emp.position }</td>
						<td>${ emp.salary }</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		
		<!-- Pagination links -->
		<ul class="pagination pagination-sm">
			<li class="page-item">
				<a class="page-link" href="/home/init/1" >1</a>
			</li>
			<li class="page-item">
				<a class="page-link" href="/home/init/2" >2</a>
			</li>
			<li class="page-item">
				<a class="page-link" href="/home/init/3" >3</a>
			</li>
		</ul>
		
	</div>
	
</body>
</html>