<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>User Register</title>
</head>
<body>

<form action="register" method="post">
    <label for="firstname"> First Name:</label>
    <input type="text" id="firstname" name="firstName" placeholder="firstname" required="required" /> <br><br>

    <label for="lastname"> Last Name:</label>
    <input type="text" id="lastname" name="lastName" placeholder="lastname" required="required" /> <br><br>

    <label for="password"> password:</label>
    <input type="password" id="password" name="password" placeholder="Password" required="required" /> <br><br>

    <label for="email"> email:</label>
    <input type="text" id="email" name="email" placeholder="email" required="required" /> <br><br>

    <label for="role"> Role:</label><br>
    <select id="role" name="role">
        <option value="member">member</option>
        <option value="librarian">librarian</option>
    </select> <br> <br>

    <button type="submit" value="Register" >Register</button> <br>
</form>

</body>
</html>
