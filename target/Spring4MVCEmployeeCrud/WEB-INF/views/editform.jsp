<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employee Updation</title>
</head>
<body>

	<h1>Employee Update Form</h1>
	<form:form method="POST" modelAttribute="employee" action="../editsave">
		<table>
			<tr>
				<td><form:hidden path="id" /></td>
			</tr>
			<tr>
				<td>First Name:</td>
				<td><form:input path="firstname" /></td>
				<td><form:errors path="firstname" cssClass="error" /></td>
			</tr>
			<tr>
				<td>Last Name:</td>
				<td><form:input path="lastname" /></td>
				<td><form:errors path="lastname" cssClass="error" /></td>
			</tr>
			<tr>
				<td>Email:</td>
				<td><form:input path="email" /></td>
				<td><form:errors path="email" cssClass="error" /></td>
			</tr>
			<tr>
				<td>Age:</td>
				<td><form:input path="age" /></td>
				<td><form:errors path="age" cssClass="error" /></td>
			</tr>
			<tr>
				<td>Birthday:</td>
				<td><form:input path="birthday" placeholder="MM/dd/yyyy" /></td>
				<td><form:errors path="birthday" cssClass="error" /></td>
			</tr>
			<tr>
				<td>Designation:</td>
				<td><form:select path="designation">
						<form:option value="" label="Select Designation" />
						<form:options items="${designations}" />
					</form:select></td>
				<td><form:errors path="designation" cssClass="error" /></td>
			</tr>
			<tr>
				<td>Department:</td>
				<td><form:select path="department">
						<form:option value="" label="Select Department" />
						<form:options items="${departments}" />
					</form:select></td>
				<td><form:errors path="department" cssClass="error" /></td>
			</tr>
			<tr>
				<td colspan="3"><input type="submit" value="Edit Save"></td>
			</tr>
		</table>
	</form:form>
	<a href="viewform">View Employees</a>
</body>
</html>