package hit.jiraapp;

import hit.jiraapp.Entity.Issues;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AddIssuesServlet extends HttpServlet {

    List<Issues> issues = new ArrayList<>();
    List<Issues> issuesList = new ArrayList<>();
    List<Issues> getIssuesList = new ArrayList<>();
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String projectName = req.getParameter("projectName");
        String issueTitle = req.getParameter("issueTitle");
        String issueDescription = req.getParameter("issueDescription");

        Issues issue = new Issues(projectName,issueTitle,issueDescription);
        issues.add(issue);
        getServletContext().setAttribute("issues", issues);

        issuesList.addAll(issues);
        getIssuesList.addAll(issues);
        req.setAttribute("issueList", issuesList);
        req.setAttribute("returningList", getIssuesList);
        req.getRequestDispatcher("IssueList.jsp").forward(req,resp);
    }
}
