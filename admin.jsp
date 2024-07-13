<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admin Home Page</title>
<style>
div#vm {
	background-color: palevioletred;
	color: white;
	width: 211px;
	padding: 57px;
	margin: 20px;
	height: 229px;
	margin-left: 590px;
	margin-top: 192px;
}

p {
	font-size: 18px;
}

h2 {
	font-size: 29px;
	color: black;
}
</style>
</head>
<body>
	<div id="vm">
		<h2>Admin Page</h2>
		<p>Candidate 1 Vote Count: ${candidate1Votes}</p>
		<p>Candidate 2 Vote Count: ${candidate2Votes}</p>
		<p>Candidate 3 Vote Count: ${candidate3Votes}</p>
		<p>Candidate 4 Vote Count: ${candidate4Votes}</p>
	</div>
</body>
</html>
