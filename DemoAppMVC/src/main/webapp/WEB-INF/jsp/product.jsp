<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<h1 class="text-center">QUAN LY SAN PHAM</h1>

<c:url value="/admin/products" var= "action"/>

<form:form method="post" action="${action}" modelAttribute="product"
	enctype="multipart/form-data">
	<div class="form-group">
		<label for ="file">Anh san pham</label>
		<form:input type="file" id="file" cssClass="form-control" path="file"/>
	</div>
	
	<div class="form-group">
		<input type="submit" value="Them san pham" />
	</div>



</form:form>
