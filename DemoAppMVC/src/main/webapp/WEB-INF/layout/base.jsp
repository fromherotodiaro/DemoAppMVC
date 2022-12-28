<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title><tiles:insertAttribute name="title" /></title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css" />
<script type="text/javascript"
	src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.min.js"></script>
<link href="<c:url value="/resources/css/style.css" />" rel="stylesheet" />
</head>
<body>
	<div class="container">
		<!-- HEADER -->
		<tiles:insertAttribute name="header" />
		<!-- CONTENT -->
		<tiles:insertAttribute name="content" />
		<!-- FOOTER -->
		<tiles:insertAttribute name="footer" />
	</div>


</body>
</html>