<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<h1 class="text-center text-danger">DANH MUC SAN PHAM</h1>
<form action="">
	<div class="row">
		<div class="col-md-11">
			<input class="form-control" type="text" name="kw" placeholder="Nhap tu khoa de tim"/>
		</div>
		<div class="col-md-1">
			<input type="submit" value="Search" class="btn-success">
		</div>
	</div>
</form>
<div class="row" >
	<c:forEach var="p" items="${products}">
		<div class="card col-md-3">
			<div class="card-body">
				<img class="img-fluid" src="<c:url value="images/spqr-gold.jpg"/>" alt="${p.name}" />
			</div>
			<div class="card-footer bg-info">
				<h3>${p.name}</h3>
				<p>${p.price} VND</p>
			</div>
		</div>
	</c:forEach>
</div>