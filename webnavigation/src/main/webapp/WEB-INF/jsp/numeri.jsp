<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
	integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
	crossorigin="anonymous">
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="calcolatore">
		<input type="number" name="numero1" placeholder="Inserisci primo numero"><br>
		<input type="number" name="numero2" placeholder="Inserisci secondo numero"><br>
		<input type="hidden"  name="operazione" value= <c:out value = "${operazione}"/>>
		<input type="submit" value="Invio">
	</form>

</body>
</html>