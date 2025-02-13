<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Admin Login</title>
</head>
<body>
    <h2>Admin Login</h2>
    <form action="/company-payments" method="get">
        <label for="adminUsername">Username:</label>
        <input type="text" name="adminUsername" required>
        <br>
        <label for="adminPassword">Password:</label>
        <input type="password" name="adminPassword" required>
        <br>
        <button type="submit">Login</button>
    </form>
</body>
</html>