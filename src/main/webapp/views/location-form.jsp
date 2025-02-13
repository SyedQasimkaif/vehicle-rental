<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Location Form</title>
</head>
<body>
    <h2>Location Form</h2>
    <form action="${pageContext.request.contextPath}/location/save" method="post">
        <label for="id">Location ID:</label>
        <input type="text" name="id" id="id" required><br><br>

        <label for="locationName">Location Name:</label>
        <input type="text" name="locationName" id="locationName" required><br><br>

        <label for="locationAddress">Location Address:</label>
        <input type="text" name="locationAddress" id="locationAddress" required><br><br>

        <button type="submit">Submit</button>
    </form>
</body>
</html>
    