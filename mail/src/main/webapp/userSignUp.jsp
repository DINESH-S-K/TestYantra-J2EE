<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Mail Simulation/Sign-In</title>
</head>
<body>
	<h1>Welcome</h1>
	<form action="./register" method="post">
		<table>
			<tr>
				<td>Name:</td>
				<td><input type="text" name="userName"
					placeholder="Type your user name" /></td>
			</tr>
			<tr>
				<td>Phone:</td>
				<td><input type="text" name="userPhoneNumber"
					placeholder="Type your email" /></td>
			</tr>
			<tr>
				<td>Email:</td>
				<td><input type="text" name="userEmail"
					placeholder="Type your email" /></td>
			</tr>
			<tr>
				<td>Answer the Security Question:</td>
				<td>1. What was your childhood nickname?</td>
				<td>
				<td>2. What was your pet name?</td>
				<td>3. What was the name of the first school you attended?</td>
				<td><input type="text" name=""/></td>
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