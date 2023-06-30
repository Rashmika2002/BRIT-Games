<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>

<!--Validation part-->
<script href="JS/validations.js" type="text/javascript">
</script>
<link rel="stylesheet" href="style/Style.css" type="text/css">
<link href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.5.0/font/bootstrap-icons.css" rel="stylesheet">

<meta charset="ISO-8859-1">

<title>Contact Us page</title>
</head>

<body>

<%@include file="includes/header.jsp" %>
<!-- Bootstrap icons -->
	
<script src="https://kit.fontawesome.com/fad24dadb8.js" crossorigin="anonymous"></script>
<!-- Create booking-->

<img name="img"src="images/contact us.jpg" alt="Image" >
<h1>CONTACT US</h1>

<center><h3>OUR SOCIAL MEDIA</h3></center>
<br>
<a href="https://www.facebook.com"><i id="socialIcons" class="fa-brands fa-square-facebook fa-large"><h4 class="text">BRITGAMES</h4></i></a>
<a href="https://www.youtube.com"><i id="socialIcons" class="fa-brands fa-youtube"><h4 class="text">BRITGames</h4></i></a>
<a href="https://www.twitter.com"><i id="socialIcons" class="fa-brands fa-twitter"><h4 class="text">britGames</h4></i></a>
<a href="https://www.instagram.com"><i id="socialIcons" class="fa-brands fa-instagram"><h4 class="text">BRIT_GAMES</h4></i></a>

<br>
<br>
<center><h3>OUR Emails</h3>
<h4>www.BritGames@gmail.com</h4>
</center>
<br>
<center><h3>CREATE YOUR BOOKING HERE</h3></center>

<fieldset>

<form name="f1" action="DataServlet" method="post" >
<img src="images/img1.jpg"class="img1">
<h2>*Username</h2>
<input type="text" name="username" size="30"  placeholder="Name" required>
<br>
<h2>*Email</h2>
<input type="email" name="email" size="30"  placeholder="example999@gmail.com" pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,4}$" required>
<br>
<h2>Reason For booking</h2>
<textarea name="reason" placeholder="Reason" ></textarea>
<br>
<h2>*Date</h2>
<input type="date" name="date" placeholder="mm-dd-yyyy" required>
<br>
<br>
<br>
<button type="submit" id="submit" name="submit" onclick="return validateForm()">Create Booking</button>
<br>
<br>
</form>
</fieldset>

<br>
<br>

<form action ="RetrieveServlet" method ="post" class="all">
<center><h3>CHECKOUT ALL YOUR BOOKINGS</h3></center>
<center><button type="submit" name="submit" class="retrieve" >VIEW ALL BOOKINGS</button></center>
</form>
<br>
<br>
<%@include file="includes/footer.jsp" %>
</body>

</html>