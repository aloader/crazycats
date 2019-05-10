<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>FirstServlet</title>
</head>
<body>
Enter two numbers to sum:
<h3>Notice the queryString(number1="number1"&number2="number2" in the URL)</h3>
<form action="SumTwoNumbersServlet" method="get">
First number : <input type="text" name="number1"><br/>
Second number: <input type="text" name="number2"><br/>
<input type="submit"> <br/>
</form>

</body>
</html>