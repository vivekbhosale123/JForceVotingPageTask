<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Home</title>
<style>
div#v {
	background-color: palevioletred;
	color: white;
	width: 211px;
	padding: 30px;
	margin: 20px;
	height: 349px;
	margin-left: 590px;
	margin-top: 192px;
}

input#username {
	width: 174px;
	padding: 14px;
}

input#password {
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
</head>
<body>
    <div id="v">
	<h2>LOGIN</h2>
	<form action="login" method="post">
		<label for="username">Username:</label> <input type="text"
			id="username" name="username" required><br>
		<br> <label for="password">Password:</label> <input
			type="password" id="password" name="password" required><br>
		<br>
		<button type="submit">Login</button>
		<button type="button" onclick="window.location.href='register'">Register</button>
	</form>
	</div>
</body>
</html>
