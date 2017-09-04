<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employee Registration</title>
</head>
<body>
	<form:form method="POST" modelAttribute="employee">
		<table>
			<tr>
				<td>Id:</td>
				<td><form:input path="id" readonly /></td>
			</tr>
			<tr>
				<td>First Name:</td>
				<td><form:input path="firstname" readonly /></td>
			</tr>
			<tr>
				<td>Last Name:</td>
				<td><form:input path="lastname" readonly /></td>
			</tr>
			<tr>
				<td>Email:</td>
				<td><form:input path="email" readonly /></td>
			</tr>
			<tr>
				<td>Age:</td>
				<td><form:input path="age" readonly /></td>
			</tr>
			<tr>
				<td>Birthday:</td>
				<td><form:input path="birthday" readonly /></td>

			</tr>
			<tr>
				<td>Designation:</td>
				<td><form:input path="designation" readonly /></td>
			</tr>
			<tr>
				<td>Department:</td>
				<td><form:input path="department" readonly /></td>
			</tr>
		</table>
	</form:form>
	<a href="empform">Add Employee</a>
	<a href="viewform">View Employees</a>
</body>
</html>