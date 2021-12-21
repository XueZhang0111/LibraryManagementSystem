<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add new Document</title>
</head>
<body>
<% pageContext.setAttribute("app_path", request.getContextPath());%>
 <form action="${app_path}/save" method="post">
    <label for="title"> Document title:</label>
    <input type="text" id="title" name="title" required="required" /> <br><br>

     <label for="type"> Document type:</label> <br>
     <select id="type" name="type">
         <option value="book">Book</option>
         <option value="article">Article</option>
         <option value="magazine">Magazine</option>
         <option value="report">Report</option>
         <option value="thesis">Thesis</option>
     </select> <br> <br>

    <label for="words"> keyword:</label>
    <input type="text" id="words" name="words" required="required" /> <br><br>

    <label for="phrase"> classification:</label>
    <input type="text" id="phrase" name="phrase" required="required" /> <br><br>

     <label for="aname"> Author:</label>
     <input type="text" id="aname" name="aname"><br><br>

     <label for="publisher_name"> Publisher:</label>
     <input type="text" id="publisher_name" name="publisher_name"><br><br>

     <label for="journal"> Journal:</label>
     <input type="text" id="journal" name="journal"><br><br>

     <label for="copyAmount"> Total Copy:</label>
     <input type="text" id="copyAmount" name="copyAmount"><br><br>

    <button type="submit" value="Save" >Save</button> <br>
</form>

</body>
</html>
