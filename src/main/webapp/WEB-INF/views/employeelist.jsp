<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>

<html>
<head>
    <title>Employee List</title>
</head>
<body>

    <h1>Employee List</h1>

    <table border="1">
        <tr>
            <th>Employee ID</th>
            <th>Employee Name</th>
            <th>Employee Salary</th>
        </tr>

        <c:forEach var="e" items="${employees}">
            <tr>
                <td>${e.eid}</td>
                <td>${e.ename}</td>
                <td>${e.sal}</td>
            </tr>
        </c:forEach>

    </table>

</body>
</html>