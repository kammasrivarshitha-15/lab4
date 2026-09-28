package org.example;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/insert")
public class InsertStudent extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

        String name = request.getParameter("name");
        String rollNo = request.getParameter("rollNo");
        String branch = request.getParameter("branch");

        response.setContentType("text/html");

        response.getWriter().println(
                "<h2>Student Data Inserted Successfully!</h2>" +
                        "<p>Name: " + name + "</p>" +
                        "<p>Roll No: " + rollNo + "</p>" +
                        "<p>Branch: " + branch + "</p>"
        );
    }
}