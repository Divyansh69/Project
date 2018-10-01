
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="spring" %>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
   
   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Products</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
<h2 align="center">Add Product</h2><hr>
<spring:form action="${pageContext.request.contextPath}/addproduct" modelAttribute="pro" method="POST">
<div class="form-group">
<c:if test="${not empty prod.productId}">
<label for="pid">Product ID:</label>
<spring:input type="text" path="product_Id" class="form-control" id="pid"  readonly="true" disabled="true"/>
<spring:hidden path="product_Id"/>
</c:if>
</div>
<div class="form-group">
<label for="pName">Product Name:</label>
 <spring:input type="text" class="form-control" id="pname" path="productName"/>
 </div>
 <div class="form-group">
 <label for="pdesc">Product Description:</label>
<spring:input type="text" class="form-control" id="pdesc" path="productDescription"/>
</div>
 <div class="form-group">
 <label for="Pprice">Product price:</label>
<spring:input type="number" class="form-control" id="pprice" path="productPrice"/>
</div>
<div class="form-group">
 <label for="Pquantity">Product quantity:</label>
<spring:input type="number" class="form-control" id="product_quantity" path="productQuantity"/>
</div>

<c:if test="${empty pro.productName}"><input type="submit" value="Add"/></c:if>
<c:if test="${not empty pro.productName}"><input type="submit" value="Update"/></c:if>


 

</spring:form>
</div>






<c:if test="${not empty productList}">

<table class="table table-hover" >
 <thead>
<tr><th>ProductId</th>
<th>Product Name</th>
<th>Product Description</th>
<th>Product Price</th>
<th>Product Quantity</th>
<th>Edit</th>
<th>delete</th>
</tr>
</thead>
<c:forEach items="${productList}" var="pro">
<tbody>
<tr>
<td>${pro.productId}</td>
<td>${pro.productName}</td>
<td>${pro.productDescription}</td>
<td>${pro.productprice}</td>
<td>${pro.productquantity}</td>

<td><a href="editProduct/${pro.product_Id}">Edit</a></td>

<td><a href="deleteProduct/${pro.product_Id}">delete</a></td>
</tr>
</tbody>
</c:forEach>
</table>

</c:if>

</body>
</html>