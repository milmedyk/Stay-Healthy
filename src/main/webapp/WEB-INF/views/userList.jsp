<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
      <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<body>

<div><a href="../product/all">Pokaż produkty</a></div>
<div><a href="../dieta/post">Pokaż dietę</a></div>
<div><a href="../user/products">Przykładowe produkty</a></div>
<div><a href="../user/trening">Twój Trening</a></div>
	<h1>Lista userów</h1>
	<c:forEach items="${user}" var="user">
${user.login}  <a href="<c:url value='/user/${user.id}/edit'/>">Suma</a> <a href="<c:url value='/user/${user.id}/del'/>">DEL</a><br><br>
	</c:forEach>
</body>
</body>
</html>

