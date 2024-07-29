
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
<h1 style="display: flex;justify-content: center">danh sach khach hang</h1>
<table class="table table-bordered table-striped">
    <tr>
        <th class="text-success text-center initialism">tên</th>
        <th class="text-success text-center initialism">ngày sinh</th>
        <th class="text-success text-center initialism">địa chỉ</th>
        <th class="text-success text-center initialism">ảnh</th>
    </tr>
    <jsp:useBean id="list" scope="request" type="java.util.List"/>
    <c:forEach var="customer" items="${list}">
        <tr>
            <td class="text-center initialism"><c:out value="${customer.name}" /></td>
            <td class="text-center initialism"><c:out value="${customer.date}" /></td>
            <td class="text-center initialism"><c:out value="${customer.address}" /></td>
            <td class="p-5 text-center initialism">
                <img class="rounded-circle img-thumbnail"
                     style="width: 100px;height:100px"
                     src="<c:out value='${customer.getImage()}' />" alt="">
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
