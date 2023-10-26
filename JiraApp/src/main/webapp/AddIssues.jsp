<%--
  Created by IntelliJ IDEA.
  User: himanshutanwar
  Date: 26/10/23
  Time: 5:32 pm
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Add Issue - JIRA</title>
  <link rel="stylesheet" type="text/css" href="CSS/AddIssues.css">
</head>
<body>
<header>
  <h1>JIRA - Add Issue</h1>
</header>
<main>
  <div class="issue-form">
    <h2>Add Issue</h2>
    <form action="AddIssueServlet" method="post">
      <label for="projectName">Project Name : </label>
      <input type="text" id="projectName" name="projectName" required>
      <label for="issueTitle">Title:</label>
      <input type="text" id="issueTitle" name="issueTitle" required>
      <label for="issueDescription">Description:</label>
      <textarea id="issueDescription" name="issueDescription" rows="4" required></textarea>
      <button type="submit">Submit Issue</button>
    </form>
  </div>
</main>
<footer>
  &copy; HIT JIRA
</footer>
</body>
</html>
