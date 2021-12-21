<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Document list</title>
</head>
<body>
<% pageContext.setAttribute("app_path", request.getContextPath());%>
<h1>Document list</h1>
<table border="1" cellpadding="5" cellspacing="0">
    <tr>
        <th>ID</th>
        <th>Title</th>
        <th>CopyAmount</th>
        <th>Type</th>
        <th>EDIT</th>
        <th>DELETE</th>
    </tr>
        <c:forEach items="${docs}" var="doc">
            <tr>
                <td>${doc.documentID}</td>
                <td>${doc.title}</td>
                <td>${doc.copyAmount}</td>
                <td>${doc.type}</td>
                <td>
                    <a href="${app_path}/doc/${doc.documentID}">edit</a>
                </td>
                <td>
                    <form action="${app_path}/doc/${doc.documentID}" method="post">
                        <input type="hidden" name="_method" value="DELETE">
                        <input type="submit" value="delete">
                    </form>
            </tr>
        </c:forEach>
    </tr>
</table>
<a href="${pageContext.request.contextPath}/toadd">Add Doc</a>
</body>
</html>
