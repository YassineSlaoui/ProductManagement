package com.yassineslaoui.servlets;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.*;

@WebServlet(name = "loginServlet", value = "/login")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        // You should validate the username and password here
        // For simplicity, we'll assume a hardcoded valid username and password
        if (username.equals("admin") && password.equals("admin")) {
            HttpSession session = request.getSession();
            session.setAttribute("username", username);
        }
        response.sendRedirect("/");

    }
}
