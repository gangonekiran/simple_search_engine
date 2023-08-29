<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<!--  Title of the HTML Document -->
<title>Search Results</title>
</head>
<body>

<!--  Heading with the Text -->
<h1>Search Results</h1>

<!--  Unordered List to display search results -->
<ul>

<!--  Java Server Pages Standard tag library-->
<c:forEach var="result" items="${searchResults}">
<!--  Loop contains each item in the search results-->

<!--  Display each result as a list item -->
<li>${result}</li>
<!--  The ${result} expression evaluates to the current result in the loop -->
</c:forEach>
</ul>

</body>
</html>