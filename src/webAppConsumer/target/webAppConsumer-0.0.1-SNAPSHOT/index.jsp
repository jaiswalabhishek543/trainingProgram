<%@page import="java.util.ArrayList"%>
<%@page import="model.Customer" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Demp Project</title>
</head>
<body>
<form action="ServletDemo" method="get">
<input type="submit" name="btn1" value="click to view customers" />
<br />
<br />
<input type="text" name="field1" placeholder="Enter the id to be deleted" />
<input type="submit" name="btn3" value="click to delete customer" />
</form>
<br />
<a href="add1.jsp"><input type="submit" value="click to add customer" /></a>

</body>
</html>