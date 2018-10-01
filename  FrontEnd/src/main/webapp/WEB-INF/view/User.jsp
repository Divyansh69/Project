<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="spring" %>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
   
   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Customer</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
<h2 align="center">Add Customer</h2><hr>
<spring:form action="${pageContext.request.contextPath}/addCustomer" modelAttribute="cus" method="POST">
<div class="form-group">
<c:if test="${not empty cust.customerId}">
<label for="Cid">Customer ID:</label>
<spring:input type="text" path="customer_Id" class="form-control" id="cid"  readonly="true" disabled="true"/>
<spring:hidden path="customer_Id"/>
</c:if>
</div>
<div class="form-group">
<label for="CName">Customer Name:</label>
 <spring:input type="text" class="form-control" id="cname" path="customerName"/>
 </div>
 <div class="form-group">
 <label for="Cdescription">Customer Description:</label>
<spring:input type="text" class="form-control" id="pdesc" path="customerDescription"/>
</div>
 <div class="form-group">
 <label for="Cprice">Customer price:</label>
<spring:input type="number" class="form-control" id="cprice" path="customerPrice"/>
</div>
<div class="form-group">
 <label for="Cquantity">Customer quantity:</label>
<spring:input type="number" class="form-control" id="customer_quantity" path="customerQuantity"/>
</div>

<c:if test="${empty cus.customerName}"><input type="submit" value="Add"/></c:if>
<c:if test="${not empty cus.customerName}"><input type="submit" value="Update"/></c:if>


 
<spring:select path="categoryId">
<c:forEach items="${categoryList}" var="cat">
<option value="${cate.categoryId}" > ${cat.categoryName}</option>
</c:forEach>
</spring:select>

</spring:form>
</div>






<c:if test="${not empty customerList}">

<table class="table table-hover" >
 <thead>
<tr><th>Customer Id</th>
<th>Customer Name</th>
<th>Customer Description</th>
<th>Customer Price</th>
<th>Customer Quantity</th>
<th>Edit</th>
<th>delete</th>
</tr>
</thead>
<c:forEach items="${customerList}" var="cus">
<tbody>
<tr>
<td>${cus.customerId}</td>
<td>${cus.customerName}</td>
<td>${cus.customerDescription}</td>
<td>${cus.customerprice}</td>
<td>${cus.customerquantity}</td>

<td><a href="editCustomer/${cus.customer_Id}">Edit</a></td>

<td><a href="deleteCustomer/${cus.customer_Id}">delete</a></td>
</tr>
</tbody>
</c:forEach>
</table>

</c:if>

</body>
</html>


