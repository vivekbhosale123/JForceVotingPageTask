<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register page</title>
</head>
<style>
div#vp {
	background-color: palevioletred;
	color: white;
	width: 211px;
	padding: 44px;
	margin: 20px;
	height: 523px;
	margin-left: 590px;
}

input#username {
	width: 174px;
	padding: 14px;
}

input#password {
	width: 174px;
	padding: 14px;
}

input#email {
	width: 174px;
	padding: 14px;
}

input#phoneNo {
	width: 174px;
	padding: 14px;
}

label {
	font-size: 26px;
}

h2 {
	font-size: 29px;
	color: black;
}

button {
	width: 100px;
	padding: 15px;
}

button:hover {
	background-color: green;
	color: orange;
}
</style>
<body>
	<div id="vp">
		<h2>Register</h2>
		<form action="register" method="post">
			<label for="username">Username:</label> <input type="text"
				id="username" name="username" required><br>
			<br> <label for="password">Password:</label> <input
				type="password" id="password" name="password" required><br>
			<br> <label for="email">Email:</label> <input type="email"
				id="email" name="email" required><br>
			<br> <label for="phoneNo">Phone No:</label> <input type="text"
				id="phoneNo" name="phoneNo" required><br>
			<br>
			<button type="submit">Register</button>
			<button type="button" onclick="window.location.href='login'">Login</button>
		</form>
	</div>
</body>
</html>