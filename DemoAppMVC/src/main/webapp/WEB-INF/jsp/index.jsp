<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="<c:url value="/resources/css/style.css" />" rel="stylesheet"/>
<title>index</title>
</head>
<body>
	<h1>Spring Centurion Hello World!</h1>
	<a href="hello">hello</a>
	<spring:message code="lable.firstName"/>

	<div>
		<img alt="test" src="<c:url value="/images/spqr-gold.jpg"/>">
	
	</div>
</body>
</html>