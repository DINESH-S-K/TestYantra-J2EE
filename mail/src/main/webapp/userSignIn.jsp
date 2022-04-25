<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>mailSimulation/sign-In</title>
</head>
<body>
	<form action="./validate" method="post">
		<table>
			<tr>
				<td>Email:</td>
				<td><input type="text" name="userEmail"
					placeholder="Type your email" /></td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><input type="password" name="userPassword"
					placeholder="Type your password" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="submit" /></td>
			</tr>
		</table>
	</form>
</body>
</html>