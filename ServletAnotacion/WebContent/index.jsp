<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
	<form action='auth' method='post'>
		<h1>Login</h1>
		<div>
			<label>Username:</label>
			<input type='text' placeholder='Username' name='username'/>
		</div>
		<div>
			<label>Password:</label>
			<input type='text' placeholder='password' name='password' />
		</div>
		<input type='submit' value='Login' />
	</form>
</body>
</html>