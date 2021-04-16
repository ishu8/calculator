<%-- 
    Document   : index
    Created on : Apr 6, 2021, 9:33:33 PM
    Author     : dell1
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
   
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
    </head>
    <body bgcolor="#ffffff">
        <form action="Calculator" method="post">
<center style="padding-top: 250px;">
            <table  style="border:1px solid black;margin-left:auto;margin-right:auto;" bgcolor = "#cae59c" ">
                <tr>
                    <th>Enter number 1:</th>
                <th colspan="4"><input type="text" name="txtnum1" value="<% if(request.getParameter("q3")!=null){ 
               String arr1=request.getParameter("q3");
               String[] a = arr1.split(":");
               String[] a2 = a[1].split("=");
               out.print(a2[1]);}
                %>" /></th></tr>
                <tr>
                    <th>Enter number 2:</th>
                <th colspan="4"><input type="text" name="txtnum2" value="<% if(request.getParameter("q3")!=null){ 
               String arr1=request.getParameter("q3");
               String[] a = arr1.split(":");
               String[] a2 = a[2].split("=");
               out.print(a2[1]);}
                %>" /></th></tr>
                <tr>
                    <th></th>
                    <th><input type="submit" name="btnsubmit" value="+" style="background-color: black;color: white;width: 105%;font-size: 20px;font-weight: bold;"/></th>
                    <th><input type="submit" name="btnsubmit" value="-" style="background-color: black;color: white;width: 105%;font-size: 20px;font-weight: bold;"/></th>
                    <th><input type="submit" name="btnsubmit" value="*" style="background-color: black;color: white;width: 105%;font-size: 20px;font-weight: bold;" /></th>
                    <th><input type="submit" name="btnsubmit" value="/" style="background-color: black;color: white;width: 105%;font-size: 20px;font-weight: bold;"/></th>
                </tr>
                <tr>
                   
                    <th>Result:</th>
                    <th colspan="4"><input type="text" name="res" value="<% if(request.getParameter("q3")!=null){
            String arr1=request.getParameter("q3");
            String[] a = arr1.split(":");
            out.print(a[0]);}%>" /></th></tr>
            </table>
            </center>
        </form>
    </body>
</html>
