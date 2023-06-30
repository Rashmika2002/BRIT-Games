<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="style/Style.css" type="text/css">
<meta charset="ISO-8859-1">
<title>Booking Details</title>
</head>
<body><%@include file="includes/header.jsp" %>

	<h5>Bookings & Details</h5>

	<!--User Profile page-->
		<c:forEach var="us" items="${Udetails}">
		
		<!--  assign values for variables -->
		<c:set var="BID" value="${us.BId}"/>
		<c:set var="USERNAME" value="${us.username}"/>
		<c:set var="EMAIL" value="${us.email}"/>
		<c:set var="REASON" value="${us.reason}"/>
		<c:set var="DATE" value="${us.date}"/>
		
		<!-- Display details cards -->
		<center><div class="column">
		
				<div class="card">
					<h2>Booking ID : ${us.BId}</h2>
					<h2>Username : ${us.username}</h2>
					<h2>Email : ${us.email}</h2>
					<h2>Reason : ${us.reason}</h2>
					<h2>Date : ${us.date}</h2>
				
			
		
		<!-- Update -->
		<c:url value="UpdateBooking.jsp" var="UpdateB">
		
		<c:param name="bid" value="${BID}"/>
		<c:param name="username" value="${USERNAME}"/>
		<c:param name="email" value="${EMAIL}"/>
		<c:param name="reason" value="${REASON}"/>
		<c:param name="date" value="${DATE}"/>
		</c:url>
		
		<a href="${UpdateB}">
		<button style=";margin-right:0">Update My Profile</button>
		</a>
		&nbsp;&nbsp;
		<!-- Delete -->
		<c:url value="DeleteBooking.jsp" var="DeleteB">
		
			<c:param name="bid" value="${BID}"></c:param>
			<c:param name="username" value="${USERNAME}"></c:param>
			<c:param name="email" value="${EMAIL}"></c:param>
			<c:param name="reason" value="${REASON}"></c:param>
			<c:param name="date" value="${DATE}"></c:param>
		</c:url>
		<a href="${DeleteB}">
		<button style="margin-left:3%;">Delete My Booking</button>
 		</a>	
 		
 </div>
 </div></center>
	</c:forEach>

</body>

</html>