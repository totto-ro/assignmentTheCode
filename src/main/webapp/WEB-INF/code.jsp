<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<link rel="stylesheet" type="text/css" href="./css/style.css">
		<title>Code Page</title>
	</head>
	<body>
		<main>
			<ul>
				<c:forEach var="element" items="${ secretList }">
				<li>
					<c:out value="${element.getCode()}"></c:out>
				</li>
				</c:forEach>
			</ul>
		</main>
	</body>
</html>