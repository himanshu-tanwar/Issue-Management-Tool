<%@ page import="java.util.List" %>
<%@ page import="hit.jiraapp.Entity.Issues" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>JIRA - Issues</title>
  <link rel="stylesheet" type="text/css" href="CSS/Issues.css">
</head>
<body>
<header>
  <h1>JIRA - Issues</h1>
</header>
<main>
  <div class="issue-list">
    <h2>Issues</h2>
    <ul>
      <li><a href="AddIssues.jsp">Add Issue</a></li>
      <li><a href="RemoveIssue.jsp">Remove Issue</a></li>
    </ul>
  </div>
  <div>
      <table>
        <tr>
          <th>Project Name</th>
          <th>Issue Title</th>
          <th>Description</th>
        </tr>
      <% try {
        List<Issues> issues = (List<Issues>) request.getAttribute("issueList");
        if (issues != null) {
          for (Issues issue : issues) {
      %>
        <tr>
          <td><%= issue.getProjectName() %></td>
          <td><%= issue.getIssueTitle() %></td>
          <td><%= issue.getIssueDescription() %></td>
        </tr>
      <%
            }
          }
        } catch (Exception e) {
          System.out.println("Exception Details : " + e);
        }
      %>
      </table>
  </div>
</main>
<footer>
  &copy; HIT JIRA
</footer>
</body>
</html>
