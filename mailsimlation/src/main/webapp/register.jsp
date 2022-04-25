<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
</head>
<body>
	<h2>Register</h2>
	<form action="index.jsp">
		<label>First Name</label> <input type="text" name="fname"
			placeholder="enter here" required><br> <label>Last
			Name</label> <input type="text" name="lname" placeholder="enter here"
			required><br> <label>User Name</label> <input
			type="text" name="username" placeholder="enter here" required><br>
		<label>Mail-Id</label> <input type="text" name="email"
			placeholder="enter here" required><br> <label>Password</label>
		<input type="password" name="password" placeholder="enter here"
			required><br> <label>Confirm password</label> <input
			type="password" name="confpassword" placeholder="enter here" required><br>
		<label for="question">Choose a security question:</label> <select
			name="question" id="question">
			<option value="a">What is the name of your pet?</option>
			<option value="b">Who is your school crush?</option>
			<option value="c">What is your favorite book name?</option>
			<option value="d">What is your birth month?</option>
		</select> <label>Answer</label> <input type="text" name="answer"
			placeholder="type your answer here" required><br> <input
			type="submit" value="Register">

	</form>

</body>
</html>