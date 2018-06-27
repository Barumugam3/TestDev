<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>
<!DOCTYPE html>
<html lang="en">

<head>
</head>


<body style="margin: 0; height: 100%; overflow: hidden ">
<h1>Welcome to Test Drive</h1>

<c:forEach items="${employees}" var="employee" varStatus="counter">
<p>${employee.firstName}</p>

</c:forEach>
<table><caption>Candidate List</caption>
<th>id</th><th>Name</th><th>Option</th>
<c:forEach items="${employees1}" var="employee1" varStatus="counter">

<tr><td>${employee1[0]}</td><td>${employee1[1]}</td><td>${employee1[2]}</td></tr>



</c:forEach>
</table>

</body></html>