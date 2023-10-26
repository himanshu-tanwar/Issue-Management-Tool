
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Remove Project - JIRA</title>
  <link rel="stylesheet" type="text/css" href="CSS/RemoveProject.css">
</head>
<body>
<header>
  <h1>Remove Project</h1>
</header>
<main>
  <div class="project-details">
    <h2>Project Information</h2>
  </div>
  <div class="remove-button">
    <form action="RemoveProjectServlet" method="get">
      <input type="text" name="projectName" placeholder="Name of project">
      <button type="submit">Remove Project</button>
    </form>
  </div>
</main>
<footer>
  &copy; HIT JIRA
</footer>
</body>
</html>
