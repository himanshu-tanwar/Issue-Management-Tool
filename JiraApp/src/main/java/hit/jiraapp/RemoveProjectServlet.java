package hit.jiraapp;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

public class RemoveProjectServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<String> projects = (List<String>) getServletContext().getAttribute("projects");
        List<String> projectsList = (List<String>) getServletContext().getAttribute("projectsList");
        String projectName = req.getParameter("projectName");

        for (int i = 0; i < projects.size(); i++){
            if (projects.get(i).equals(projectName)){
                projects.remove(i);
                projectsList.remove(i);
            }
        }

        req.getRequestDispatcher("/ProjectList.jsp").forward(req, resp);
    }
}
