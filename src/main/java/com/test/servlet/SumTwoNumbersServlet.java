package com.test.servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

public class SumTwoNumbersServlet extends HttpServlet {
    protected float numbersSum=0;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        System.out.println("SumTwoNumbersServlet doGet method called");
        doPost(request,response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        float number1, number2;
        String numberStr;

        PrintWriter out = response.getWriter();

        try {
            number1 = Float.parseFloat(request.getParameter("number1"));
            number2 = Float.parseFloat(request.getParameter("number2"));
        } catch (NumberFormatException e) {
            out.write("<html><body><h4>Wrong parameters!</h4></body></html>");
            return;
        }
        numbersSum = number1 + number2;

        out.write("<html><body><h4>Summ of two numbers</h4></body></html>");
        out.write("<html><body><h1> Result: " + number1 + " + " + number2 +" = " + numbersSum+"</h1></body></html>");
    }

}
