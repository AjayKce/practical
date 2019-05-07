<%@page import="java.util.*,com.example.app.model.*" %>
<html>
<head>
</head>
<%
List<Hotel> list = (List<Hotel>)request.getAttribute("list");
%>
<body>
	<table border="1">
		<thead>
			<th>Room Number</th>
			<th>Guest Details</th>
		</thead>
		<%for(Hotel temp:list){ %>
		<tr>
			<td><%=temp.getNumber() %></td>
			<td><%=temp.getDetail() %></td>
		</tr>
		<%} %>
	</table>
</body>
</html>