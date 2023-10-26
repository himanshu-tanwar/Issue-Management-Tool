package hit.jiraapp;

import hit.jiraapp.Entity.Users;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AddProjectServlet extends HttpServlet {
    List<String> projects = new ArrayList<>();
    List<String> projectsList = new ArrayList<>();
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String projectName = req.getParameter("projectName");
//        List<String> projects = (List<String>) getServletContext().getAttribute("projects");
        projects.add(projectName);
        getServletContext().setAttribute("projects", projects);

        for (String item: projects) {
            projectsList.add(item);
        }

        req.setAttribute("projectsList", projectsList);
        getServletContext().setAttribute("projectsList", projectsList);
        req.getRequestDispatcher("ProjectList.jsp").forward(req, resp);
    }
}
