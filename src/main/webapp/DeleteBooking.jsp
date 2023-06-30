<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="style/Style.css">
<meta charset="ISO-8859-1">

<title>Delete Booking page</title>
</head>
<body>

<script src="https://kit.fontawesome.com/fad24dadb8.js" crossorigin="anonymous"></script>
<!-- header -->
<%@include file="includes/header.jsp" %>
<!-- Assign details of booking to variables -->
	<%
	String id = request.getParameter("bid");
	String name = request.getParameter("username");
	String email = request.getParameter("email");
	String reason = request.getParameter("reason");
	String date = request.getParameter("date");
	%>

	<h5>Delete Booking</h5>
<br>
<br>
<fieldset class="f1">
<form action="DeleteServlet" method="post">
<img src="images/Path.jpg"class="img2">
<h2>Booking ID</h2>
<input type="text" size="50" value="<%=id%>" name="bid" readonly>
<br>
<h2>UserName</h2>
<input type="text" size="50" name="username" value="<%=name%>"readonly>
<br>
<h2>Email</h2>
<input type="text" size="50" name="email" value="<%=email%>"readonly>
<br>
<h2>Reason</h2>
<input type="text" name="reason" style="width:475px;height:150px;" value="<%=reason%>"readonly>
<br>
<h2>Date</h2>
<input type="text" size="50" name="date" value="<%=date %>"readonly>
<br>
<br>
<br>
<button type="submit">Delete My Booking</button>
 </form>
 </fieldset>
<%@include file="includes/footer.jsp" %>
</body>
</html>