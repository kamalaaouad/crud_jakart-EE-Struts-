<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Ajouter une recette</title>
</head>
<body>

<!-- <form action="ajouter-recette"> -->
<%-- ID :: <input type="text" name="recette.id" value='<s:property value="recette.id"/>'/><br> --%>
<%-- Nom :: <input type="text" name="recette.nom" value='<s:property value="recette.nom "/>'/><br> --%>
<%-- Ingredients ::<input type="text" name="recette.ingredients" value='<s:property value="recette.ingredients"/>'/><br> --%>
<!-- <button type="submit" name="save_recette">Save Recette</button> -->
<!-- </form> -->
<s:form action="ajouter-recette">
<s:textfield key="recette.id"/><br/>
<s:textfield key="recette.nom"/><br/>
<s:textfield key="recette.ingredients"/><br/>
<s:submit key="saved"/>
</s:form>
</body>
</html>