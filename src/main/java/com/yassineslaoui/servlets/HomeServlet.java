package com.yassineslaoui.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "homeServlet", value = "")
public class HomeServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        if (session != null && session.getAttribute("username") != null &&
                session.getAttribute("username").equals("admin")) {
//            resp.sendRedirect("home.html");
            resp.getWriter().println("<!DOCTYPE html>\n" +
                    "<html lang=\"en\">\n" +
                    "<head>\n" +
                    "    <meta charset=\"UTF-8\">\n" +
                    "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                    "    <title>Home Page</title>\n" +
                    "    <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css\"\n" +
                    "          integrity=\"sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65\" crossorigin=\"anonymous\">\n" +
                    "</head>\n" +
                    "<body>\n" +
                    "<div class=\"container mt-5\">\n" +
                    "    <h1 class=\"display-4 text-center\">Welcome to the Home Page</h1>\n" +
                    "\n" +
                    "    <form action=\"logout\" method=\"post\" class=\"mt-3\">\n" +
                    "        <button type=\"submit\" class=\"btn btn-danger\">Logout</button>\n" +
                    "    </form>\n" +
                    "</div>\n" +
                    "\n" +
                    "<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js\"\n" +
                    "        integrity=\"sha384-kenU1KFdBIe1m+QmWQ41w7j7h2SX4gQEXmuwTGlR+MtnxwQ6ORu2BOoLCYvZW3t\"\n" +
                    "        crossorigin=\"anonymous\"></script>\n" +
                    "</body>\n" +
                    "</html>");
        } else {
            resp.getWriter().println("<!doctype html>\n" +
                    "<html lang=\"en\">\n" +
                    "  <head>\n" +
                    "  \t<title>Login</title>\n" +
                    "    <meta charset=\"utf-8\">\n" +
                    "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n" +
                    "\n" +
                    "\t<link href=\"https://fonts.googleapis.com/css?family=Lato:300,400,700&display=swap\" rel=\"stylesheet\">\n" +
                    "\n" +
                    "\t<link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\">\n" +
                    "\n" +
                    "\t<link rel=\"stylesheet\" href=\"css/style.css\">\n" +
                    "\n" +
                    "\t</head>\n" +
                    "\t<body class=\"img js-fullheight\" style=\"background-image: url(images/bg.jpg);\">\n" +
                    "\t<section class=\"ftco-section\">\n" +
                    "\t\t<div class=\"container\">\n" +
                    "\t\t\t<div class=\"row justify-content-center\">\n" +
                    "\t\t\t\t<div class=\"col-md-6 text-center mb-5\">\n" +
                    "\t\t\t\t\t<h2 class=\"heading-section\">Login</h2>\n" +
                    "\t\t\t\t</div>\n" +
                    "\t\t\t</div>\n" +
                    "\t\t\t<div class=\"row justify-content-center\">\n" +
                    "\t\t\t\t<div class=\"col-md-6 col-lg-4\">\n" +
                    "\t\t\t\t\t<div class=\"login-wrap p-0\">\n" +
                    "\t\t      \t<h3 class=\"mb-4 text-center\">Have an account?</h3>\n" +
                    "\t\t      \t<form action=\"login\" method=\"post\" class=\"signin-form\">\n" +
                    "\t\t      \t\t<div class=\"form-group\">\n" +
                    "\t\t      \t\t\t<input type=\"text\" name=\"username\" class=\"form-control\" placeholder=\"Username\" required>\n" +
                    "\t\t      \t\t</div>\n" +
                    "\t            <div class=\"form-group\">\n" +
                    "\t              <input id=\"password-field\" type=\"password\" name=\"password\" class=\"form-control\" placeholder=\"Password\" required>\n" +
                    "\t              <span toggle=\"#password-field\" class=\"fa fa-fw fa-eye field-icon toggle-password\"></span>\n" +
                    "\t            </div>\n" +
                    "\t            <div class=\"form-group\">\n" +
                    "\t            \t<button type=\"submit\" class=\"form-control btn btn-primary submit px-3\">Sign In</button>\n" +
                    "\t            </div>\n" +
                    "\t            <div class=\"form-group d-md-flex\">\n" +
                    "\t            \t<div class=\"w-50\">\n" +
                    "\t\t            \t<label class=\"checkbox-wrap checkbox-primary\">Remember Me\n" +
                    "\t\t\t\t\t\t\t\t\t  <input type=\"checkbox\" checked>\n" +
                    "\t\t\t\t\t\t\t\t\t  <span class=\"checkmark\"></span>\n" +
                    "\t\t\t\t\t\t\t\t\t</label>\n" +
                    "\t\t\t\t\t\t\t\t</div>\n" +
                    "\t\t\t\t\t\t\t\t<div class=\"w-50 text-md-right\">\n" +
                    "\t\t\t\t\t\t\t\t\t<a href=\"#\" style=\"color: #fff\">Forgot Password</a>\n" +
                    "\t\t\t\t\t\t\t\t</div>\n" +
                    "\t            </div>\n" +
                    "\t          </form>\n" +
                    "<!--\t          <p class=\"w-100 text-center\">&mdash; Or Sign In With &mdash;</p>-->\n" +
                    "<!--\t          <div class=\"social d-flex text-center\">-->\n" +
                    "<!--\t          \t<a href=\"#\" class=\"px-2 py-2 mr-md-1 rounded\"><span class=\"ion-logo-facebook mr-2\"></span> Facebook</a>-->\n" +
                    "<!--\t          \t<a href=\"#\" class=\"px-2 py-2 ml-md-1 rounded\"><span class=\"ion-logo-twitter mr-2\"></span> Twitter</a>-->\n" +
                    "<!--\t          </div>-->\n" +
                    "\t\t      </div>\n" +
                    "\t\t\t\t</div>\n" +
                    "\t\t\t</div>\n" +
                    "\t\t</div>\n" +
                    "\t</section>\n" +
                    "\n" +
                    "\t<script src=\"js/jquery.min.js\"></script>\n" +
                    "  <script src=\"js/popper.js\"></script>\n" +
                    "  <script src=\"js/bootstrap.min.js\"></script>\n" +
                    "  <script src=\"js/main.js\"></script>\n" +
                    "\n" +
                    "\t</body>\n" +
                    "</html>");
        }
    }
}
