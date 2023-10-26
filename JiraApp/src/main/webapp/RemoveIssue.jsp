<%@ page import="hit.jiraapp.Entity.Issues" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: himanshutanwar
  Date: 26/10/23
  Time: 8:26 pm
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Remove Issues - JIRA</title>
  <link rel="stylesheet" type="text/css" href="CSS/RemoveIssue.css">
</head>
<body>
<header>
  <h1>Remove Issues - JIRA</h1>
</header>
<main>
  <div class="issue-list">
    <h2>Select Issues to Remove</h2>
    <form action="RemoveProjectServlet" method="post">
      <table>
        <tr>
          <th>ProjectName</th>
          <th>Issue Title</th>
          <th>Select</th>
        </tr>
        <% try {
          List<Issues> issues = (List<Issues>) request.getAttribute("returningList");
          if (issues != null) {
            for (Issues issue : issues) {
        %>
        <tr>
          <td><%= issue.getProjectName() %></td>
          <td><%= issue.getIssueTitle() %></td>
          <td><input type="checkbox" name="selectedIssues" value="checked"></td>
        </tr>
        <%
              }
            }
          } catch (Exception e) {
            System.out.println("Exception Details : " + e);
          }
        %>
      </table>
      <button type="submit">Remove Selected Issues</button>
    </form>
  </div>
</main>
<footer>
  &copy; HIT JIRA
</footer>
</body>
</html>
