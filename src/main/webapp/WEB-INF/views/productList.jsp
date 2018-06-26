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
<div><a href="../product/create">Dodaj produkt</a></div>
<div><a href="../userRepo/all">Pokaż użytkowników</a></div>
<div><a href="../dieta/post">Pokaż dietę</a></div>
<div><a href="../user/products">Przykładowe produkty</a></div>
<div><a href="../user/trening">Twój Trening</a></div>
	<h1>Lista produktów</h1>
	<c:forEach items="${product}" var="product">
	<p>login:${product.login}  </p>
<p>${product.name}  <a href="<c:url value='/product/${product.id}/del'/>">DEL</a><br></p><br>
<p>bialko(gr):${product.bialko} </p>
<p>tluszcze(gr):${product.tluszcze}</p>
<p>calories(gr):${product.calories} </p> 
<p>weglowodane(gr):${product.weglowodane} </p> 



	</c:forEach>
</body>
</body>
</html>
