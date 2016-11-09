<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Résultat de la conversion</title>
</head>
<body>
<p>Vous avez demandé la conversion de la valeur en Celsius ${requestScope.temperature.celsius}</p>
<p><b>et le résultat est: ${requestScope.temperature.fahrenheit} degrés Fahrenheit</b></p>
<a href="/Temperature/">Retour</a>
</body>
</html>