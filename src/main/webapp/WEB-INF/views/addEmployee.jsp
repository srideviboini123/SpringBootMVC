<%@ page contentType="text/html;charset=UTF-8"%>
<html>
<head>
	<title>add employee data</title>
</head>
	
	<body>
		<form action="/employees/saveEmp" method="post">
		Employee name:<input type="text" name="ename" required/><br>
		Employee salary:<input type="number" name="sal" required/><br>
	    <input type="submit" value="register"/>
		</form>
	</body>
</html>