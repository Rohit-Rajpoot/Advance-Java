<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

    <form action="FirstServlet" method="post">
		<table>
			<tr>
				<th>First Name</th>
				<td><input type="text" name="First Name"
					placeholder="Enter First Name"></td>
			</tr>

			<tr>
				<th>Last Name</th>
				<td><input type="text" name="Last Name"
					placeholder="Enter Last Name"></td>
			</tr>

			<tr>
				<th>DOB</th>
				<td><input type="date" name="DOB" placeholder="Enter DOB"></td>
			</tr>

			<tr>
				<th>Login Id</th>
				<td><input type="email" name="Login Id"
					placeholder="Enter Login Id"></td>
			</tr>

			<tr>
				<th>Password</th>
				<td><input type="password" name="Password"
					placeholder="Enter Your Password"></td>
			</tr>

			<tr>
				<th>Address</th>
				<td><input type="text" name="Address"
					placeholder="Enter Your Address"></td>
			</tr>

			<tr>
				<th></th>
				<td><input type="submit"></td>
			</tr>

		</table>

	</form>

</body>
</html>