<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Employee Registration</title>
<style>
.error {
	color: #ff0000;
	font-style: italic;
	font-weight: bold;
}
</style>
	
</head>
<body>
<h1>Employee Registration Form</h1>
<form:form method="POST" modelAttribute="employee" action="save">
		<table>
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
				<td><form:input path="birthday" placeholder="MM/dd/yyyy"/></td>
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
				<td colspan="3"><input type="submit" value="Save Employee"></td>
			</tr>
		</table>

	</form:form>
	 <a href="viewform">View Employees</a>  
</body>
</html>