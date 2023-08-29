<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<!--  Title of the HTML Document -->
<title>Simple Search Engine</title>
</head>
<body>

<!--  Heading with the Text -->
<h1>Simple Search Engine</h1>

<!--  Create a form for user input-->
<form action="SearchEngine" method="get">


<!--  Label for the input field -->
<label for="query">Enter your search query:</label>


<!--  Input the field for user to type the search query -->
<input type="text" id="query" name="query">

<!--  Submit the button to initiate the search -->
<input type="submit" value="Search">

</form>
</body>
</html>