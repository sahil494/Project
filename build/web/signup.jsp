<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sign-Up Page</title>
        <script>
            function validate()
            {
                var Pwd = document.form.password.value;
                var Cpwd = document.form.confirm.value;
                 if (Pwd != Cpwd)
                {
                    alert("Confirm Password should match with the Password");
                    return false;
                }
                
            }
        </script>
		<style>
     	body {
            color:black;
        }
        {
            font-family: Arial, Helvetica, sans-serif;
        }
        * {box-sizing: border-box}      
		input[type=text], input[type=password],input[type=email],input[type=tel] {
        width: 20%;
        padding: 10px;
        margin: 5px 0 22px 0;
        display: inline-block;
        border: none;
        background: #f1f1f1;
}#submit
{
  background-color: green;
    color: white;
    padding: 14px 20px;
    margin: 8px 0;
    border: none;
    cursor: pointer;
    width: 15%;
    opacity: 2.9;
    margin-bottom: 10px;
    margin-left: 10px
}
#submit:hover{
            border: none;
            background: #943126;
}
footer{
            position: absolute;
            bottom: 0px;
            right: 0px;
            text-align: right;
}
.container
{
padding : 25px;
}
.bg {
    background-image: url("vote3.jpg");
    height: 119%; 
    background-position: center;
    background-repeat: no-repeat;
    background-size: cover;
}
</style>
</head>
<body>
<div class="bg">
        <form name="form" method="post" action="InfoAdd" onsubmit="return validate()" style="border:1px solid #ccc">
             <div class="container">		  
                 <h1><center>Register to vote</center></h1>
                 <p><center>Please fill in this form to create an account.</center></p>
             <br>
            <center><label for="Name" ><b>Student Name</b></label><br>
            <input type="text" placeholder="Enter your Name"  name="Name" minlength=3 required size="5">
            <br><label for="email" ><b>Student Id</b></label><br>
            <input type="text" placeholder="Enter Student Id" name ="email" required maxlength="10" minlength="10">
            <br><label for="password" ><b>Password</b></label><br>
            <input type="password" placeholder="Password" name="password" id="myInput" minlength="8" required><br>
            <input type="checkbox" onclick="myFunction()">Show Password
            <br>
            <script>
            function myFunction() {
            var x = document.getElementById("myInput");
            if (x.type === "password") {
            x.type = "text";
            } 
            else
            {
        x.type = "password";
            }
          }
          </script>
            <br>
            <label for="confirm"><b>Confirm Password</b></label><br>
            <input type="password" placeholder="Confirm Password" name="confirm" minlength="8">
            <br><label for="phone" ><b>Mobile Number</b></label><br>
            <input type="tel" placeholder="Enter your Mobile number"  name="phone" minlength=10 maxlength=10 required>
            <br><label for="address" ><b>Address</b></label><br>
            <input type="text" placeholder="Enter your Address" name="address" required>
            <br>
            <center><a href="login.jsp"><input type="submit" id="submit" value ="Sign Up"></a></center>
             </div></form>
    </body>
</html>
