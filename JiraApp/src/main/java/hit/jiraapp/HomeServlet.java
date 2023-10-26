package hit.jiraapp;

import hit.jiraapp.Entity.Users;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

@WebServlet(name = "HomeServlet", value = "/HIT-JIRA")
public class HomeServlet extends HttpServlet {

    public boolean isLoginSuccessful(String username, String password){
        boolean success = false;
        List<Users> usersList = (List<Users>) getServletContext().getAttribute("userlist");
        for (Users user: usersList) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)){
                success = true;
                break;
            }
        }
        return success;
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        if (isLoginSuccessful(username, password)){
            req.setAttribute("username", username);
            req.getRequestDispatcher("/Home.jsp").forward(req, resp);
        }
        else {
            resp.sendRedirect("LoginPage.jsp");
        }

    }
}
