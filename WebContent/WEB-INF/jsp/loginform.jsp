<!DOCTYPE html>
<html >
  <head>
    <meta charset="UTF-8">
    <title>DAAS Online Banking</title>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  

                 <style>
                 @import url(http://fonts.googleapis.com/css?family=Source+Sans+Pro:200,300);
* {
  box-sizing: border-box;
  margin: 0;
  padding: 0;
  font-weight: 400;
}
body {
  font-family: 'Source Sans Pro', sans-serif;
  color: white;
  font-weight: 300;
}

.wrapper {
  background: #50a3a2;
  background: -webkit-linear-gradient(top left, #50a3a2 0%, #53e3a6 100%);
  background: linear-gradient(to bottom right, #50a3a2 0%, #53e3a6 100%);
  position: relative;
  top: 50%;
  left: 0;
  width: 100%;
  height: 500px;
  
}
.container {
  max-width: 600px;
  margin: 0 auto;
  padding: 80px 0;
  height: 400px;
  text-align: center;
}
.container h1 {
  font-size: 40px;
  -webkit-transition-duration: 1s;
          transition-duration: 1s;
  -webkit-transition-timing-function: ease-in-put;
          transition-timing-function: ease-in-put;
  font-weight: 200;
}
form {
  padding: 20px 0;
  position: relative;
  z-index: 2;
}

.daas {
    position: absolute;
    right: 0px;
    width: 500px;
    margin-right:30px;
}

.logincred {
	align:left;
    position: absolute;
    left: 0px;
    width: 600px;
    margin-left:350px;
}
.indexfooter {
	position:relative;
	height:200px;
	width:100%;
	background-color:#06425C;
    
}
.indexheader {
	position:relative;
	height:100px;
	width:100%;
	background-color:#06425C;
    
}

.bg-bubbles {
  position: absolute;
  top: 0;
  left: 0;
  width: 100%;
  height: 100%;
  z-index: 1;
}
.bg-bubbles li {
  position: absolute;
  list-style: none;
  display: block;
  width: 40px;
  height: 40px;
  background-color: rgba(255, 255, 255, 0.15);
  bottom: -160px;
  -webkit-animation: square 25s infinite;
  animation: square 25s infinite;
  -webkit-transition-timing-function: linear;
  transition-timing-function: linear;
}
.bg-bubbles li:nth-child(1) {
  left: 10%;
}
.bg-bubbles li:nth-child(2) {
  left: 20%;
  width: 80px;
  height: 80px;
  -webkit-animation-delay: 2s;
          animation-delay: 2s;
  -webkit-animation-duration: 17s;
          animation-duration: 17s;
}
.bg-bubbles li:nth-child(3) {
  left: 25%;
  -webkit-animation-delay: 4s;
          animation-delay: 4s;
}
.bg-bubbles li:nth-child(4) {
  left: 40%;
  width: 60px;
  height: 60px;
  -webkit-animation-duration: 22s;
          animation-duration: 22s;
  background-color: rgba(255, 255, 255, 0.25);
}
.bg-bubbles li:nth-child(5) {
  left: 70%;
}
.bg-bubbles li:nth-child(6) {
  left: 80%;
  width: 120px;
  height: 120px;
  -webkit-animation-delay: 3s;
          animation-delay: 3s;
  background-color: rgba(255, 255, 255, 0.2);
}
.bg-bubbles li:nth-child(7) {
  left: 32%;
  width: 160px;
  height: 160px;
  -webkit-animation-delay: 7s;
          animation-delay: 7s;
}
.bg-bubbles li:nth-child(8) {
  left: 55%;
  width: 20px;
  height: 20px;
  -webkit-animation-delay: 15s;
          animation-delay: 15s;
  -webkit-animation-duration: 40s;
          animation-duration: 40s;
}
.bg-bubbles li:nth-child(9) {
  left: 25%;
  width: 10px;
  height: 10px;
  -webkit-animation-delay: 2s;
          animation-delay: 2s;
  -webkit-animation-duration: 40s;
          animation-duration: 40s;
  background-color: rgba(255, 255, 255, 0.3);
}
.bg-bubbles li:nth-child(10) {
  left: 90%;
  width: 160px;
  height: 160px;
  -webkit-animation-delay: 11s;
          animation-delay: 11s;
}
@-webkit-keyframes square {
  0% {
    -webkit-transform: translateY(0);
            transform: translateY(0);
  }
  100% {
    -webkit-transform: translateY(-700px) rotate(600deg);
            transform: translateY(-700px) rotate(600deg);
  }
}
@keyframes square {
  0% {
    -webkit-transform: translateY(0);
            transform: translateY(0);
  }
  100% {
    -webkit-transform: translateY(-700px) rotate(600deg);
            transform: translateY(-700px) rotate(600deg);
  }
}
                 
                 form input {
  -webkit-appearance: none;
     -moz-appearance: none;
          appearance: none;
  outline: 0;
  border: 1px solid rgba(255, 255, 255, 0.4);
  background-color: rgba(255, 255, 255, 0.2);
  width: 250px;
  border-radius: 3px;
  padding: 10px 15px;
  margin: 0 auto 10px auto;
  display: block;
  text-align: center;
  font-size: 18px;
  color: white;
  -webkit-transition-duration: 0.25s;
          transition-duration: 0.25s;
  font-weight: 300;
}
form input:hover {
  background-color: rgba(255, 255, 255, 0.4);
}
form input:focus {
  background-color: white;
  width: 300px;
  color: #53e3a6;
}
form button {
  -webkit-appearance: none;
     -moz-appearance: none;
          appearance: none;
  outline: 0;
  background-color: white;
  border: 0;
  padding: 10px 15px;
  color: #53e3a6;
  border-radius: 3px;
  width: 250px;
  cursor: pointer;
  font-size: 18px;
  margin-top:5px;
  -webkit-transition-duration: 0.25s;
          transition-duration: 0.25s;
}
form button:hover {
  background-color: #f5f7f9;
}
            
                 </style>
          </head>

  <body>
  
<div class="indexheader">
    <p >&nbsp </p>
	<h1 style="padding-left:50px;color:#CCFF33;">DAAS Bank  <a href="newuser" style="text-decoration:none; color:white; margin-left:800px;"><b>New User</b></a> </h1>
	<h3 style="padding-left:50px;color:#CCFF33;"> Manage your Money Online!</h3>
	
  </div>
  
 <div class="moving">
	<h2 style="font-weight:bold; color:#330033;background-color:#FFD700;" ><center>ONLINE BANK</center>
	<marquee style="font-weight:bold; color:#003366;background-color:	#FFD700"> 
  &#8226 &nbsp Keep Transaction of your Money in blink of eye &nbsp
  &#8226 &nbsp Take Bank in your Pocket,where ever you go! &nbsp
  &#8226 &nbsp Deposit and Withdraw money anywhere&nbsp
    &#8226 &nbsp Open account Online!&nbsp
 </marquee></h2>
  </div>
  
<div class="wrapper">
	<div class="container">
	<div class="logincred">
	<h1 style="font-weight:bold; color:#003366;" >Welcome Employee</h1>
       <form:form method="POST" action="login">  
      	<table style="margin-left:100px;">  
      	  <tr>  
          <td style="color:white; font-size:24px;">Username  </td> 
          <td><form:input path="username" style="margin-left:10px;"/></td>
         </tr>  
         <tr>  
          <td style="color:white; font-size:24px;">Password</td>  
          <td><form:input path="password" style="margin-left:10px;colspan=2;" type="password" /></td>
         </tr> 
                </table>       
         <button type="submit" value="Login" >Login</button><br>
         <button type="reset">Reset</button>
         
         
       </form:form>  
       	</div>
	</div>
	
	<ul class="bg-bubbles">
		<li></li>
		<li></li>
		<li></li>
		<li></li>
		<li></li>
		<li></li>
		<li></li>
		<li></li>
		<li></li>
		<li></li>
	</ul>
</div>
<div class="indexfooter">
    <p >&nbsp </p>
  </div>
  

  
    <script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>

        <script src="js/index.js"></script>

    
    
    
  </body>
</html>