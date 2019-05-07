<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<body>
<form:form method="post" action="processCreateHotel" modelAttribute="hotel">
	<form:hidden path="id"/>
	Room Number : <form:input path="number" required="required"/><br>
	Guest Details : <form:input path="detail" required="required"/><br>
	<input type="submit" value="submit">
</form:form>

</body>
</html>