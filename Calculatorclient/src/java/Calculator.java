/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.unique.Calculator_Service;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.WebServiceRef;

/**
 *
 * @author dell1
 */
public class Calculator extends HttpServlet {
    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/Calculatorservice/Calculator.wsdl")
    private Calculator_Service service;

    

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            if(request.getParameter("btnsubmit").equals("+"))
            {
              int num1 = Integer.parseInt(request.getParameter("txtnum1"));
              int num2 = Integer.parseInt(request.getParameter("txtnum2"));
              
               response.sendRedirect("index.jsp?q3="+getNumber(num1,num2)+":q1="+num1+":q2="+num2);
               
            }
            else if(request.getParameter("btnsubmit").equals("-"))
            {
               
               int num1 = Integer.parseInt(request.getParameter("txtnum1"));
               int num2 = Integer.parseInt(request.getParameter("txtnum2"));
               
               response.sendRedirect("index.jsp?q3="+getSubtraction(num1,num2)+":q1="+num1+":q2="+num2);
               
            }
            else if(request.getParameter("btnsubmit").equals("*"))
            {
               
               float num3 = Float.parseFloat(request.getParameter("txtnum1"));
               float num4 = Float.parseFloat(request.getParameter("txtnum2"));
               
               response.sendRedirect("index.jsp?q3="+getMultiplication(num3,num4)+":q1="+num3+":q2="+num4);
               
            }
            else if(request.getParameter("btnsubmit").equals("/"))
            {
               
               float num3 = Float.parseFloat(request.getParameter("txtnum1"));
               float num4 = Float.parseFloat(request.getParameter("txtnum2"));
               
               response.sendRedirect("index.jsp?q3="+getDivision(num3,num4)+":q1="+num3+":q2="+num4);
               
            }
            
          
         
        }
    }
    private float getDivision(float num1, float num2) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        com.unique.Calculator port = service.getCalculatorPort();
        return port.getDivision(num1, num2);
    }

    private float getMultiplication(float num1, float num2) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        com.unique.Calculator port = service.getCalculatorPort();
        return port.getMultiplication(num1, num2);
    }

    private int getNumber(int num1, int num2) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        com.unique.Calculator port = service.getCalculatorPort();
        return port.getNumber(num1, num2);
    }

    private float getSubtraction(float num1, float num2) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        com.unique.Calculator port = service.getCalculatorPort();
        return port.getSubtraction(num1, num2);
    }

}
