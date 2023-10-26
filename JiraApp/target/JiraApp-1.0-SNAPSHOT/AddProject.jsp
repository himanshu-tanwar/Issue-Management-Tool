<%--
  Created by IntelliJ IDEA.
  User: himanshutanwar
  Date: 23/10/23
  Time: 4:37 pm
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Add Projects - JIRA</title>
  <link rel="stylesheet" type="text/css" href="CSS/AddProject.css">
</head>
<body>
<header>
  <h1>Add Projects</h1>
</header>
<main>
  <div class="project-form">
    <form action="AddProjectServlet" method="post">
      <label for="projectName">Project Name:</label>
      <input type="text" id="projectName" name="projectName" required>
      <button type="submit">Create Project</button>
    </form>
  </div>
</main>
<footer>
  &copy; HIT JIRA
</footer>
</body>
</html>
