<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<link rel="stylesheet" href="style/Style.css">
<link href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.5.0/font/bootstrap-icons.css" rel="stylesheet">

<meta charset="ISO-8859-1">

<title>Update Booking Page</title>
</head>
<body>
<script src="https://kit.fontawesome.com/fad24dadb8.js" crossorigin="anonymous"></script>

<!-- Header -->
<%@include file="includes/header.jsp" %>
<!-- Assign details of booking to variables -->
<%
	String id = request.getParameter("bid");
	String name = request.getParameter("username");
	String email = request.getParameter("email");
	String reason = request.getParameter("reason");
	String date = request.getParameter("date");
%>

<h5>Update Booking</h5>
<br>
<br>
<!-- form -->
<fieldset class="f1">
<form action="UpdateServlet" method="post">
<img src="images/car.jpg"class="img2">
<h2>Booking ID</h2>
<input type="text" size="50" value="<%=id%>" name="bid"required readonly>
<br>
<h2>UserName</h2>
<input type="text" size="50" name="username" value="<%=name%>">
<br>
<h2>Email</h2>
<input type="text" size="50" name="email" value="<%=email%>">
<br>
<h2>Reason</h2>
<input type="text"  name="reason" style="width:475px;height:150px;" value="<%=reason%>">
<br>
<h2>Date</h2>
<input type="text" size="50" name="date" value="<%=date %>">
<br>
<br>
<br>
<button type="submit"> Update My Booking </button>
</form>
</fieldset>

<!-- Footer -->
 <%@include file="includes/footer.jsp" %>
</body>
</html>