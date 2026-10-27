<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Result</title>
</head>
<body>
    <h2>Result</h2>
    <% if (request.getAttribute("error") != null) { %>
        <p><%= request.getAttribute("error") %></p>
    <% } else { %>
        <p>Total: <%= request.getAttribute("total") %>/300</p>
        <p>Average: <%= request.getAttribute("average") %></p>
        <p>Grade: <%= request.getAttribute("grade") %></p>
    <% } %>
    <a href="marks.jsp">Calculate again</a>
</body>
</html>
