package hit.jiraapp;

import hit.jiraapp.Entity.Users;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "SignedUpServlet", value = "/SignedUpServlet")
public class SignedUpServlet extends HttpServlet {

    List<Users> usersList = new ArrayList<>();
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String email = req.getParameter("email");

        Users user = new Users(username, password, email);
        usersList.add(user);
        getServletContext().setAttribute("userlist", usersList);

//        for (Users users: usersList) {
//            System.out.println(users.getUsername());
//            System.out.println(users.getPassword());
//            System.out.println(users.getEmail());
//        }

        resp.setContentType("text/html");
        req.getRequestDispatcher("/SuccessSignUp.jsp").forward(req, resp);

    }
}
