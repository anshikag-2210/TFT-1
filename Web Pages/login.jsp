<%-- 
    Document   : login
    Created on : 27 Mar, 2019, 7:47:28 PM
    Author     : Aman Deep
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
 <head>
     <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
     <title>Login Page</title>
  <style>
    body{ background: url("image/back.png"); background-size: 100% 100vh;}  
    #ttt
    {
        width: 320px;
        height: 400px;
        margin: 0 auto;
        background: white;//black;
        color: black;//white;
        font-family: sans-serif;
        box-shadow:2px 4px 7px gray , -2px 4px 7px gray;
    }
    #ttt:hover
    {
        box-shadow:4.5px 5px 20px rgba(128,128,128,0.5) , -4.5px 5px 20px rgba(128,128,128,0.5) , 3px 4px 25px gray , -3px 4px 25px gray;
    }
    #ttt td
    {
        padding-top: 0px;
        padding-bottom: 5px;
        padding-left: 30px;
        padding-right: 30px;
        font-weight: bold;
        font-size: 17.5px;
    }
    #ttt input
    {
        height: 40px;
        font-size: 16px;
        width: 100%;
        outline: none;
        margin-bottom: 20px;
    }
    .logini
    {
        background: transparent;
        border-left: none;
        border-top: none;
        border-right: none;
        border-bottom: 2px solid black;//white;
        color: #1DA1F2;
    }
    .logini:focus
    {
        border-left: none;
        border-top: none;
        border-right: none;
        //border-bottom: 2px solid white;
        border-bottom-color: red;
        transition: border-bottom-color 2s;
        //transition-timing-function: ease-in-out;
    }
    .avatar
    {   
        width: 100px;
        height: 100px;
        border-radius: 50%;
        margin: auto; //position: absolute;
        margin-top: -55px;//top: -40px;//-50px;
        margin-left: 73px;//left:100px;
    }
    #ttt input[type="submit"]
    {
        border: none;
        color:white;//black;
        background: red;
        border-radius: 20px;
        font-size: 18px;
    }
    #ttt input[type="submit"]:hover
    {
        cursor: pointer;
        color: red;
        background: lightblue;
    }        
  </style>
 </head>
    <body>
    <center><h1>Only For Admin</h1></center><br/><br/><br/>
     <form action="codes/logincode.jsp" method="post">
      <table border="0" id="ttt" style="border: 1px solid silver;">
        <tr><td><img src="image/avatar.png" class="avatar"/></td></tr>
        <tr>
            <td style="text-align: center;font-size: 22px;padding-top: 6px;padding-bottom: 20px;">LOGIN HERE</td>
        </tr>
        <tr>
            <td>Admin ID</td>
        </tr>
        <tr>
            <td><input class="logini" type="text" name="id" required="" placeholder="Enter ID"/></td>
        </tr>
        <tr>
            <td>Password</td>
        </tr>
        <tr>
            <td><input class="logini" type="password" name="password" required="" placeholder="Enter Password"/></td>
        </tr>
        <tr>
            <td style="padding-bottom: 30px;padding-top: 20px;"><input type="submit" value="Login"/></td>
        </tr>
      </table> 
     </form>
    </body>
</html>
