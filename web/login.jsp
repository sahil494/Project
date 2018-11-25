<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Login Page</title>
<style>
body {font-family: Arial, Helvetica, sans-serif;}
form {border: 4px solid #f1f1f1;
     text-align:center;
}

input[type=text], input[type=password] {
    width: 25%;
    padding: 12px 25px;
    margin: 8px 0;
    display: inline-block;
    border: 1px solid #ccc;
    box-sizing: border-box;
}

#log {
    background-color: green;
    color: white;
    padding: 14px 20px;
    margin: 8px 0;
    border: none;
    cursor: pointer;
    width: 15%;
}


.imgcontainer {
    text-align: center;
    margin: 24px 0 12px 0;
}

img.voting {
    width: 25%;
    border-radius: 50%;
}

.container {
    padding: 20px;
}
</style>
</head>
<body bgcolor="#E6E6FA">

<h2><center> Login Form</center></h2>
<form id="form" action="LoginServlet" method="POST" onsubmit="return validate()">
<div class="imgcontainer">
<img src="vote.jpg" alt="vote" class="voting">
</div>
<div class="container">
    <label for="email"><b>Student ID:</b></label>
<input type="text" placeholder="Enter your Id" name="email" minlength="10" maxlength="10"/>
<br>
<label for="password"><b>Password:</b></label>
<input type="password" placeholder="Enter password" name="password" id="myInput"/><br>
<input type="checkbox" onclick="myFunction()">Show Password
<script>
function myFunction() {
    var x = document.getElementById("myInput");
    if (x.type === "password") {
        x.type = "text";
    } else {
        x.type = "password";
    }
}
</script>
<br><br>
<center><a href="index.html"><input type="Submit" id="log" value="Login"/></a></center>
<h4><center><p>Need an account? <a href="signup.jsp" style="color:blue">SignUp</center></a></h4>
</div>				
</form>	
</body>
</html>