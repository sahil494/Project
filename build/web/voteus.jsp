<!DOCTYPE html>
<html lang="en">
<head>
  <title>vote us</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <style>
      .navbar {
      margin-bottom: 0;
      border-radius: 0;
    }
.imgcontainer {
    text-align:left;
}
img.voting {
    width: 15%;
}
     .jumbotron {
      margin-bottom: 5;
    }
.container .btn {
    position: absolute;
    top: 50%;
    left: 50%;
    transform: translate(-50%, -50%);
    -ms-transform: translate(-50%, -50%);
    background-color:#555;
    color: white;
    font-size: 20px;
    padding: 12px 24px;
    border: none;
    cursor: pointer;
    border-radius: 5px;
    text-align: center;
}
.container .btn:hover {
    background-color:black;
}
#boii {
    background-color:black;
    color: white;
    padding: 14px 20px;
    margin: 8px 0;
    border: none;
    cursor: pointer;
    width: 100%;
}
  </style>
  <script>
      <%
          
          Object bool = request.getAttribute("cannotVote");
          boolean cannotVote;
          boolean hasCannotVote = false;
          if (bool == null) {
              cannotVote = false;
          } else {
              cannotVote = (boolean) bool;
              hasCannotVote = true;
          }
          
          if (cannotVote) {
      %>
          alert("You have already Voted !");
          <%} else if (!cannotVote && hasCannotVote){ %>
          alert("Thanks for voting!");
          <% } %>
      </script>
</head>
<body>   
<nav class="navbar navbar-inverse">
      <a class="navbar-brand" href="index.html">HOME</a>
    <div class="collapse navbar-collapse" id="myNavbar">
      <ul class="nav navbar-nav">
      </ul>
      <ul class="nav navbar-nav navbar-right">
          <li>
              <form action="WatchForResults">
                  <button type="submit" class="btn" id="boii">WATCH RESULTS</button>      
              </form>
          </li>
      </ul>
    </div>
</nav>
<center><p><u><font size="40" color="green">Your Vote is precious for Us! Every Vote counts!</font></u></p></center>
<div class="container">
  <br>
      <div class="col-sm-5">
      <div class="row-sm-5">
      <div class="panel panel-primary">
          <div class="panel-body"><img src="us1.jpg" class="img-responsive" style="width:100%" alt="Image"></div>
          <center><div class="panel-footer"><strong>Name:-Jack Jones<br>Age:-22<br>Year:-3rd<br>E-mail:-jack.jones@gmail.com<br>Contact Number:-9898979695<br>Party Name:-CU,H.P.</strong>
                  <form method="post" action="newservet">
                      <input type="hidden" value="jack.jones@gmail.com" name="one">
                      <button type="submit" class="btn">VOTE</button>
                  </form>
              </div></center>
      </div>
      </div>
    </div>
      <div class="col-sm-5">
          <div class="row-sm-5">
          <div class="panel panel-primary">
        <div class="panel-body"><img src="us2.jpg" class="img-responsive" style="width:95%" alt="Image">
              <form method="post" action="newservet">
                      <input type="hidden" value="harry.potter@gmail.com" name="one">
                      <button type="submit" class="btn">VOTE</button>
                  </form>
        </div>
        <center><div class="panel-footer"><strong>Name:-Harry Potter<br>Age:-21<br>Year:-3rd<br>E-mail:-harry.potter@gmail.com<br>Contact Number:-9555947950<br>Party Name:-CU,P.B.</strong></div></center>
       </div>
      </div>
</div>
</div>
<br><br>
<div class="container">
      <div class="col-sm-5">
      <div class="row-sm-5">
      <div class="panel panel-primary">
        <div class="panel-body"><img src="us11.jpg" class="img-responsive" style="width:100%" alt="Image"></div>
        <center><div class="panel-footer"><strong>Name:-Shane Watson<br>Age:-22<br>Year:-3rd<br>E-mail:-shane.watson@gmail.com<br>Contact Number:-9833322218<br>Party Name:-SOI</strong>
           <form method="post" action="newservet">
                      <input type="hidden" value="shane.watson@gmail.com" name="one">
                      <button type="submit" class="btn">VOTE</button>
                  </form>
            </div></center>
      </div>
      </div>
    </div>
    <div class="col-sm-5">
        <div class="row-sm-5">
      <div class="panel panel-primary">
        <div class="panel-body"><img src="us10.jpg" class="img-responsive" style="width:90%" alt="Image"></div>
        <center><div class="panel-footer"><strong>Name:- Omar Borkan Al Gala<br>Age:-23<br>Year:-3rd<br>E-mail:-omar.gala@gmail.com<br>Contact Number:-7508477528<br>Party Name:-SOPU</strong>
         <form method="post" action="newservet">
                      <input type="hidden" value="omar.gala@gmail.com" name="one">
                      <button type="submit" class="btn">VOTE</button>
                  </form>
            </div></center>
      </div>
    </div>
  </div>
</div>
</body>
</html>
