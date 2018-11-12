<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>register Page</title>
		<style>
   .center {
    text-align:center;
    background-color: lightgrey;
    border: 10px solid blue;
    padding: 10px;
    width: 500px;
    height: 950px;
    margin-right: 150px;
    margin-left: 350px;
}
     	body 
        {                     
            color:darkblue;
        }
        label
        {
            color:darkblue;
        }
        {font-family: Arial, Helvetica, sans-serif;}
        {box-sizing: border-box}
		
	input[type=text],input[type=email] {
        width: 40%;
        padding: 10px;
        margin: 5px 0 22px 0;
        display: inline-block;
        border: none;
        background: #f1f1f1;
}#submit
{
  background-color:brown;
    color: white;
    padding: 14px 20px;
    margin: 2px 0;
    border: none;
    cursor: pointer;
    width: 20%;
    opacity: 2.9;
    margin-bottom: 10px;
    margin-left: 10px
}
footer{
            position: absolute;
            bottom: 0px;
            right: 0px;
            text-align: right;
}
.container
{
padding : 50px;
}

</style>
</head>
<body>
<center><img src="vote6.jpg" width="1300" height="500"></center>
        <form name="form" method="post" action="InfoAdd" onsubmit="return validate()">
                 <div class="container">
                 <div class="center">
                 <center> <h1><b><u>Voter Register</u></b></h1><br>
                 <label for="Name" ><b>Aadhar Card No:-</b></label><br>
                 <input type="text" placeholder="Enter Aadhar Card No"  name="Aadhar Card No" minlength="12" maxlength="12">
            <br><label for="Name"><b>Voter Card No:-</b></label><br>
            <input type="text" placeholder="Enter Voter Card No" name ="Voter Card No" minlength="11" maxlength="11"><br>
            <label for="Name"><b>Voter Name:-</b></label><br>
            <input type="text" placeholder="Enter Voter Name" name ="Voter Name" required><br>
            <label for="Name"><b>Gender:-</b></label><br><br>
            <input type="radio" name="gender" value="male" checked>Male &nbsp;&nbsp;&nbsp;
            <input type="radio" name="gender" value="female">Female &nbsp;&nbsp;&nbsp;
            <input type="radio" name="gender" value="other">Other<br><br>
            <label for="D.O.B"><b>D.O.B.:-</b></label><br>
            <input type="date" name="bday"><br><br>
            <label for="Name"><b>Mobile Number:-</b></label><br>
            <input type="text" placeholder="Enter Mobile Number" name ="mobile number" minlength="10" maxlength="10"><br>
            <label for="Name"><b>Address:-</b></label><br>
            <input type="text" placeholder="Enter Address" name ="Address" required><br>
            <label for="Name"><b>City:-</b></label><br>
            <input type="text" placeholder="Enter City" name ="City" required><br>
            <label for="Name"><b>State:-</b></label><br>
            <input type="text" placeholder="Enter State" name ="state" required><br>
            <label for="Name"><b>Country:-</b></label><br>
            <input type="text" placeholder="Enter Country" name ="Country" required><br>
                 <center><input type="Submit" id="submit" value ="Submit"></center>
             </div>
             </div>
        </form>
    </body>
</html>
