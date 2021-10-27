<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<link rel="stylesheet" type="text/css" href="./css/style.css">
		<title>Index</title>
	</head>
	<body>
		<main>
			<form action="/validate" method="POST">
				<div>
					<h1 class="errorAlert"><c:out value="${ errorAlert }" /></h1>
				</div>
				<div>
					<label for="userFirstName"> What is the ninja code? </label>
					<input type="text" id="secretCode" name="secretCode" />
				</div>
				<div>
					<button type="submit">
						Try Code
					</button>
				</div>
			</form>
		</main>
	</body>
</html>