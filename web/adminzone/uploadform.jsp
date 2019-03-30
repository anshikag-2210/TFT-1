<%-- 
    Document   : uploadform
    Created on : 28 Mar, 2019, 1:11:54 AM
    Author     : Aman Deep
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Upload Notes</title>
        <style>
            body{background: url("../image/2.jpg"); background-size: 100% 100vh;}
            table
            {
                margin-top: 10vh;
                height: 55vh;
                width: 40%;
                text-align: center;
                border:1px solid grey;
                font-size: 25px;
                font-weight: bold;
                color:white;
                text-shadow: 0px 10px 15px rgba(0,0,0,1) , 1px -1px 0 black , 1px 1px 0 black , -1px -1px 0 black , -1px 1px 0 black;
            }
            h1
            {
                color: white;
                text-shadow: 0px 5px 10px rgba(0,0,0,1) , 1px -1px 0 black , 1px 1px 0 black , -1px -1px 0 black , -1px 1px 0 black; 
            }
            input[type="submit"]
            {
                font-size: 20px;
                background-color: white;
                color: white;
                cursor: pointer;
                letter-spacing: 2.5px;
                width:20%;
                font-family: serif;
                text-shadow: 0px 5px 10px rgba(0,0,0,1) , 1px -1px 0 black , 1px 1px 0 black , -1px -1px 0 black , -1px 1px 0 black;
            }
        </style>
    </head>
    <body>
    <center>
        <h1>Upload Notes</h1>
        <form action="../upload" method="post" enctype="multipart/form-data">
            <table>
                <tr>
                    <td style="width:50%;">Subject</td>
                    <td>
                        <select name="subject" required="">
                            <option value="">Select subject</option>
                            <option value="C">C</option>
                            <option value="Maths">Maths</option>
                            <option value="ABC">ABC</option>
                        </select>
                    </td>
                </tr>
                <tr>
                    <td>Title</td>
                    <td><input type="text" name="title" required=""/></td>
                </tr>
                <tr>
                    <td>Description</td>
                    <td><textarea name="description" required=""></textarea></td>
                </tr>
                <tr>
                    <td>Select File</td>
                    <td><input style="border: 1px solid black;width:70%;" name="myfile" type="file" required=""/></td>
                </tr>
                <tr>
                    <td colspan="2"><input type="submit" value="Upload"/></td>
                </tr>
            </table>
        </form>
    </center>
    </body>
</html>
