<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Location List</title>
</head>
<body>
    <h2>Location List</h2>
    <a href="${pageContext.request.contextPath}/location/create">Add New Location</a>
    <table border="1">
        <tr>
            <th>ID</th>
            <th>Location Name</th>
            <th>Location Address</th>
            <th>Actions</th>
        </tr>
        <c:forEach var="location" items="${locations}">
            <tr>
                <td>${location.id}</td>
                <td>${location.locationName}</td>
                <td>${location.locationAddress}</td>
                <td>
                    <a href="${pageContext.request.contextPath}/location/edit/${location.id}">Edit</a>
                    <a href="${pageContext.request.contextPath}/location/delete/${location.id}" 
                       onclick="return confirm('Are you sure you want to delete this location?')">Delete</a>
                </td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
    