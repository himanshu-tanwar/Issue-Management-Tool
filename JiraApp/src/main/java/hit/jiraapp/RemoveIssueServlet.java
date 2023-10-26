package hit.jiraapp;

import hit.jiraapp.Entity.Issues;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RemoveIssueServlet extends HttpServlet {

    public static Issues findIssueByChecked(List<Issues> issues, String issueTitle) {
        for (Issues issue : issues) {
            if (issueTitle.equals("checked")) {
                return issue;
            }
        }
        return null;
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<String> selectedIssues = Collections.singletonList(req.getParameter("selectedIssues"));

        if (selectedIssues != null){
            List<Issues> issues = (List<Issues>) getServletContext().getContext("issues");
            List<Issues> removedIssues = new ArrayList<>();
            for (String issueTitle: selectedIssues) {
                Issues issueToRemove = findIssueByChecked(issues, issueTitle);
                if (issueToRemove != null){
                    removedIssues.add(issueToRemove);
                    issues.remove(issueToRemove);
                }
            }
        }

        req.getRequestDispatcher("IssueList.jsp").forward(req,resp);
    }
}
