<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Vehicle Form</title>
</head>
<body>
    <h2>Vehicle Form</h2>
    <form action="${pageContext.request.contextPath}/vehicle/save" method="post">
        <label for="id">Vehicle ID:</label>
        <input type="text" name="id" id="id" required><br><br>

        <label for="vehicleType">Vehicle Type:</label>
        <input type="text" name="vehicleType" id="vehicleType" required><br><br>

        <label for="vehicleName">Vehicle Name:</label>
        <input type="text" name="vehicleName" id="vehicleName" required><br><br>

        <label for="vehicleStatus">Vehicle Status:</label>
        <input type="text" name="vehicleStatus" id="vehicleStatus"><br><br>

        <label for="vehicleImage">Vehicle Image:</label>
        <input type="text" name="vehicleImage" id="vehicleImage"><br><br>

        <label for="rentalPrice">Rental Price:</label>
        <input type="text" name="rentalPrice" id="rentalPrice" required><br><br>

        <label for="locationId">Location ID:</label>
        <input type="text" name="locationId" id="locationId" required><br><br>

        <button type="submit">Submit</button>
    </form>
</body>
</html>
    