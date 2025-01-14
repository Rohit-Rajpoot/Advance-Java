<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Getting Data Printed</title>
</head>
<body>
<% String firstName = request.getParameter("First Name");
   String lastName = request.getParameter("Last Name");
   String dob = request.getParameter("DOB");
   String loginId = request.getParameter("Login Id");
   String password = request.getParameter("Password");
   String phoneNumber = request.getParameter("Phone Number");
   String address = request.getParameter("Address");
%>

<h1><%= firstName %></h1>
<h1><%= lastName %></h1>
<h1><%= dob %></h1>
<h1><%= loginId %></h1>
<h1><%= password %></h1>
<h1><%= phoneNumber %></h1>
<h1><%= address %></h1>
</body>
</html>