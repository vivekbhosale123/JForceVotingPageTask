<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Voting Page</title>
<style>
div#vb {
	background-color: palevioletred;
	color: white;
	width: 211px;
	padding: 30px;
	margin: 20px;
	height: 288px;
	margin-left: 590px;
	margin-top: 192px;
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

label {
	font-size: 24px;
	padding: 18px;
}
</style>
</head>
<body>
	<div id="vb">
		<h2>Voting Page</h2>
		<form action="vote" method="post">
			<label> <input type="radio" name="candidate" value="1">
				Candidate 1
			</label><br> <label> <input type="radio" name="candidate"
				value="2"> Candidate 2
			</label><br> <label> <input type="radio" name="candidate"
				value="3"> Candidate 3
			</label><br> <label> <input type="radio" name="candidate"
				value="4"> Candidate 4
			</label><br>
			<br>
			<center>
				<button type="submit">Vote</button>
			</center>
		</form>
		<p>${message}</p>

	</div>
</body>
</html>
