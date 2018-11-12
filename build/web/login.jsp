<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Login Page</title>
<style>
body {font-family: Arial, Helvetica, sans-serif;}
form {border: 4px solid #f1f1f1;
     text-align:center;
}

input[type=email], input[type=password] {
    width: 30%;
    padding: 12px 20px;
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

<h2> <center> Login Form</center></h2>
<form id="form" action="LoginServlet" method="POST">
<div class="imgcontainer">
<img src="vote.jpg" alt="vote" class="voting">
</div>
<div class="container">
    <label for="email"><b>&nbsp;Email-ID:</b></label>
<input type="email" placeholder="Enter Email" name="email"/>
<br>
<label for="password"><b>Password:</b></label>
<input type="password" placeholder="Enter password" name="password"/>
<br><br>
<center><input type="Submit" id="log" value="Login"/></center>
<h4><center><a href="signup.jsp" style="color:blue">Don't have an account</center></a></h4>
</div>				
</form>	
</body>
</html>