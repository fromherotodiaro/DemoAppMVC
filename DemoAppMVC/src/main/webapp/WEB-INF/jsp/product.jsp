<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<h1 class="text-center">QUAN LY SAN PHAM</h1>

<c:url value="/admin/products" var= "action"/>

<form:form method="post" action="${action}" modelAttribute="product"
	enctype="multipart/form-data">
	
	<form:errors path="*" cssClass="alert alert-danger" element="div"/>
	<div class="form-group"> 
		<label for ="name">Ten</label>
		<form:input type="text" id="name" cssClass="form-control" path="name"/>
		<form:errors path="name" cssClass="alert alert-danger" element="div"/>
	</div>
	
	<div class="form-group"> 
		<label for ="description">Mo ta</label>
		<form:textarea type="text" id="description" cssClass="form-control" path="description"/>
		<form:errors path="description" cssClass="alert alert-danger" element="div"/>
	</div>
	
	<div class="form-group"> 
		<label for ="price">Gia</label>
		<form:input type="text" id="price" cssClass="form-control" path="price"/>
		<form:errors path="price" cssClass="alert alert-danger" element="div"/>
	</div>
	
	
	<div class="form-group">
		<label for ="file">Anh san pham</label>
		<form:input type="file" id="file" cssClass="form-control" path="file"/>
	</div>
	
	<div class="form-group">
		<input type="submit" value="Them san pham" />
	</div>



</form:form>
