<%@page import="voting.ListingBean"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% ArrayList<ListingBean> ar = (ArrayList<ListingBean>)request.getAttribute("Lord"); %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>voting</title>
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <script>
      </script>
  <style>
    p {
    font-family: "Times New Roman", Times, serif;
    font-size: 30px;
}
  #lol {
    background-color: #E0F2F1;
}
.colorgraph {
  height: 5px;
  border-top: 0;
  background: #c4e17f;
  border-radius: 5px;
  background-image: -webkit-linear-gradient(left, #c4e17f, #c4e17f 12.5%, #f7fdca 12.5%, #f7fdca 25%, #fecf71 25%, #fecf71 37.5%, #f0776c 37.5%, #f0776c 50%, #db9dbe 50%, #db9dbe 62.5%, #c49cde 62.5%, #c49cde 75%, #669ae1 75%, #669ae1 87.5%, #62c2e4 87.5%, #62c2e4);
  background-image: -moz-linear-gradient(left, #c4e17f, #c4e17f 12.5%, #f7fdca 12.5%, #f7fdca 25%, #fecf71 25%, #fecf71 37.5%, #f0776c 37.5%, #f0776c 50%, #db9dbe 50%, #db9dbe 62.5%, #c49cde 62.5%, #c49cde 75%, #669ae1 75%, #669ae1 87.5%, #62c2e4 87.5%, #62c2e4);
  background-image: -o-linear-gradient(left, #c4e17f, #c4e17f 12.5%, #f7fdca 12.5%, #f7fdca 25%, #fecf71 25%, #fecf71 37.5%, #f0776c 37.5%, #f0776c 50%, #db9dbe 50%, #db9dbe 62.5%, #c49cde 62.5%, #c49cde 75%, #669ae1 75%, #669ae1 87.5%, #62c2e4 87.5%, #62c2e4);
  background-image: linear-gradient(to right, #c4e17f, #c4e17f 12.5%, #f7fdca 12.5%, #f7fdca 25%, #fecf71 25%, #fecf71 37.5%, #f0776c 37.5%, #f0776c 50%, #db9dbe 50%, #db9dbe 62.5%, #c49cde 62.5%, #c49cde 75%, #669ae1 75%, #669ae1 87.5%, #62c2e4 87.5%, #62c2e4);
}

   .rainbow {
  
   /* Font options */
  font-family: 'Pacifico', cursive;
  text-shadow: -1px 0 black, 0 1px black, 1px 0 black, 0 -1px black;
  
   /* Chrome, Safari, Opera */
  -webkit-animation: rainbow 3s infinite; 
  
  /* Internet Explorer */
  -ms-animation: rainbow 3s infinite;
  
  /* Standar Syntax */
  animation: rainbow 3s infinite; 
}

/* Chrome, Safari, Opera */
@-webkit-keyframes rainbow{
  0%{color: orange;}	
  10%{color: purple;}	
	20%{color: red;}
	40%{color: yellow;}
	60%{color: green;}
	100%{color: blue;}
	100%{color: orange;}	
}

/* Internet Explorer */
@-ms-keyframes rainbow{
  0%{color: orange;}	
  10%{color: purple;}	
	20%{color: red;}
	40%{color: yellow;}
	60%{color: green;}
	100%{color: blue;}
	100%{color: orange;}	
}

/* Standar Syntax */
@keyframes rainbow{
  0%{color: orange;}	
  10%{color: purple;}	
	20%{color: red;}
	40%{color: yellow;}
	60%{color: green;}
	100%{color: blue;}
	100%{color: orange;}
}
#boii {
    background-color:black;
    color: white;
    padding: 14px 20px;
    margin: 8px 0;
    border: none;
    cursor: pointer;
    width: 100%;
    float:right;
}
  </style>
    </head>
    <body>
        <nav class="navbar navbar-inverse">
  <div class="container-fluid" >
        <div class="navbar-right">
      <form action="LogoutServlet" method="POST"><button type="submit" class="btn" id="boii">Logout</button></form>
    </div>
  </div>
    <img src="bravo.jpg" width="1500" height="200">
</nav>
      <%  if(!ar.isEmpty()){
          for(int i=0;i<ar.size();i++)
      { %>
      <div style="height:250px;" id="lol">
      <p style="color:#9C27B0;">Name :<%= ar.get(i).getName()%></p>
      <p style="color:#9C27B0;">Email :<%= ar.get(i).getEmail()%></p>
      <p style="color:#9C27B0;">Partyname :<%= ar.get(i).getPartyname()%></p>
      <p style="color:#9C27B0;"> Votecount:<%= ar.get(i).getVotecount()%></p>
      </div>
      <hr class="colorgraph">
      <%}}%>
    
    </body>
</html>
