function ValidatForm() 
{ 
  let x = document.getElementsByName("username").value;
  if (x == "") {
    alert("Name must be filled out");
    return false;
  }
    alert("You have entered an invalid email address!")
    return (false)
}