<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Détails du Produit</h1>
	<p>Produit : ${produit.label}</p>
	<p>Prix : ${produit.prix}</p>
	<p>Disponibilité : ${produit.disponibilite ? 'Disponible' : 'Non disponible'}</p>

	<a href="accueil">Retour Accueil</a>
</body>
</html>