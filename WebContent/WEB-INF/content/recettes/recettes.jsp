<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>liste des recettes</title>
</head>
<body style="border: 1">
	<h1>les recettes</h1>
	<table>
		<tr>
			<td>#ID</td>
			<td>Nom</td>
			<td>Ingredients</td>
			<td>Action</td>
		</tr>
		<c:forEach items="${recettes.entrySet() }" var="rc">
			<tr>
				<td>${rc.getValue().id}</td>
				<td>${rc.getValue().nom}</td>
				<td>${rc.getValue().ingredients }</td>
				<td><a href="deleteRecette?id_selectionner=${rc.getValue().id}">Delete</a><a href="editRecette?id_selectionner=${rc.getValue().id}">Update</a></td>
			</tr>
		</c:forEach>

	</table>
</body>
</html>