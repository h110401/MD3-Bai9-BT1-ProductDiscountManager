<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<meta charset="UTF-8">

<head>
    <title> Product-Discount-Calculator</title>
</head>
<body>
<h2> Product-Discount-Calculator</h2><br />
<form method="post" action="/CalServlet">
    <label>Product Description: </label><br/>
    <input type="text" name="ProductDescription" size="30" placeholder=" Mô tả của sản phẩm " /></br>
    <label>List Price: </label><br/>
    <input type="text" name="ListPrice" size="30" placeholder="List Price" value="0" /></br>
    <label>Discount Percent: </label><br/>
    <input type="text" name=" DiscountPercent" size="30" placeholder="Discount Percent" value="0" /><br>
    <input type="submit" id="submid" value="Calculator" />

</form>
</body>
</html>