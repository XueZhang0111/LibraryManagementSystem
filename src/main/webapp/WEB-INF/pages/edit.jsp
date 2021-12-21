<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isErrorPage="true" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Edit Document Info</title>
</head>
<body>
<% pageContext.setAttribute("app_path", request.getContextPath());%>
<form:form action="${app_path}/doc/${doc.documentID}"
           method="post" modelAttribute="doc">
    <input type="hidden" name="_method" value="put">
    <input type="hidden" name="id" value="${doc.documentID}">
    copyAmount: <form:input path="copyAmount" /> <br>
    Title: <form:input path="title" /> <br>
    Type: <form:input path="type" /> <br>
    <input type="submit" value="update">

</form:form>

</body>
</html>
