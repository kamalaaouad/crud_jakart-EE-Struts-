<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>edit recette</title>
</head>
<body>
<form action="update-recette"> 
 <input type="hidden" name="recette.id" value='<s:property value="recette.id"/>'/><br>
Nom :: <input type="text" name="recette.nom" value='<s:property value="recette.nom "/>'/><br>
Ingredients ::<input type="text" name="recette.ingredients" value='<s:property value="recette.ingredients"/>'/><br>
<button type="submit" name="update_recette">Update Recette</button>
</form>
</body>
</html>