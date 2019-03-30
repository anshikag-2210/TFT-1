<%-- 
    Document   : C
    Created on : 28 Mar, 2019, 7:03:41 PM
    Author     : Aman Deep
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title></title>
</head>
<body>
	<center>
		<h1>Computer Science Notes</h1><br/><br/>
		<table style="width:100%;" border="1">
			<tr>
				<th>File</th>
                                <th>Title</th>
				<th>Description</th>
				<th>Download</th>
			</tr>
                        <%
                            Class.forName("com.mysql.jdbc.Driver");
                            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/tftdb","root","");
                            PreparedStatement ps=con.prepareStatement("select filename,title,description from notes where subject='C'");
                            ResultSet rs=ps.executeQuery();
                            while(rs.next())
                            {
                        %>
                        <tr>
                            <td><embed src="<%=request.getContextPath() + "/notes/" + rs.getString(1)%>" height="300" width="100%"></embed></td>
                            <td><%=rs.getString(2)%></td>
                            <td><%=rs.getString(3)%></td>
                            <td><a target="_blank" href="<%=request.getContextPath() + "/notes/" + rs.getString(1)%>">Download</a></td>
                        </tr>
                        <%
                            }
                        %>
		</table>
	</center>
</body>
</html>