<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Compose</title>
</head>
<body>
<h2>Compose your mail</h2>
<form action="">
<label>From</label>
<input type="email" name="from" placeholder="from"><br>
<label>To</label>
<input type="email" name="to" placeholder="to"><br>
<label>Sub</label>
<input type="text" name="sub" placeholder="subject"><br>
<textarea name="message" placeholder="type your message here" rows="10" cols="50"></textarea><br>
<input type="submit" value="send">
</form>
</body>
</html>