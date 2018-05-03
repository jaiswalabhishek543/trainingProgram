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
<p>
<%  

ArrayList<Customer> list =(ArrayList<Customer>) request.getAttribute("listServlet");

for(Customer category : list) {
    out.println(category.getCustomerId());
    out.println(category.getCustomerName());
    out.println(category.getCustomerAddress());
}

%>


</p>
</body>
</html>