<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!-- Grey with black text -->
<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
  <ul class="navbar-nav">
    <li class="nav-item active">
      <a class="nav-link" href="#">Trang chu</a>
    </li>
    <c:forEach var="cat" items="${categories}">
    <li class="nav-item">
      <a class="nav-link" href="#">${cat.name}</a>
    </li>
    </c:forEach>
  </ul>
</nav>