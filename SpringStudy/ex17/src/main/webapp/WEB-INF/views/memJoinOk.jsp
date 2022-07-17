<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
	<h1> memJoinOk </h1>
	ID : ${memId}<br />
	PW : ${memPw}<br />
	Mail : ${memMail} <br />
	Phone : ${memPhone1} <br />
	
	<a href="/ex17/resources/html/memJoin.html"> Go MemberJoin </a><br />
	<a href="/ex17/resources/html/login.html">Login</a>
</body>
</html>
