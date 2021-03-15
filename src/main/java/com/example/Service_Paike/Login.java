package com.example.Service_Paike;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "login")
public class login extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String n=request.getParameter("userName");
        String p=request.getParameter("Pass");

        if(p.equals("servletchek") ){
            RequestDispatcher rd = request.getRequestDispatcher("login");
            rd.forward(request, response);
        }
    else
            ((PrintWriter) out).print("Sorry UserName or Password Error!");
            RequestDispatcher rd = request.getRequestDispatcher("/form2.html");
            rd.include(request, response);

        }








    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
