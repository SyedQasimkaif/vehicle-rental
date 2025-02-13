<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Vehicle List</title>
</head>
<body>
    <h2>Vehicle List</h2>
    <a href="${pageContext.request.contextPath}/vehicle/create">Add New Vehicle</a>
    <table border="1">
        <tr>
            <th>ID</th>
            <th>Vehicle Type</th>
            <th>Vehicle Name</th>
            <th>Rental Price</th>
            <th>Location ID</th>
            <th>Actions</th>
        </tr>
        <c:forEach var="vehicle" items="${vehicles}">
            <tr>
                <td>${vehicle.id}</td>
                <td>${vehicle.vehicleType}</td>
                <td>${vehicle.vehicleName}</td>
                <td>${vehicle.rentalPrice}</td>
                <td>${vehicle.locationId}</td>
                <td>
                    <a href="${pageContext.request.contextPath}/vehicle/edit/${vehicle.id}">Edit</a>
                    <a href="${pageContext.request.contextPath}/vehicle/delete/${vehicle.id}" 
                       onclick="return confirm('Are you sure you want to delete this vehicle?')">Delete</a>
                </td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
    