/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unique;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author dell1
 */
@WebService(serviceName = "Calculator")
public class Calculator {

    /**
     * This is a sample web service operation
     */
    
    /**
     * Web service operation
     */
    @WebMethod(operationName = "getNumber")
    public int getNumber(@WebParam(name = "num1") int num1, @WebParam(name = "num2") int num2) {
        //TODO write your implementation code here:
         int sum=num1+num2;
        return sum;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "getDivision")
    public float getDivision(@WebParam(name = "num1") float num1, @WebParam(name = "num2") float num2) {
        if(num2==0.0)
            return -1;
        float div=num1/num2;
        return div;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "getMultiplication")
    public float getMultiplication(@WebParam(name = "num1") float num1, @WebParam(name = "num2") float num2) {
        float mul=num1*num2;
        return mul;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "getSubtraction")
    public float getSubtraction(@WebParam(name = "num1") float num1, @WebParam(name = "num2") float num2) {
           float diff=num1-num2;
        return diff;
    }
}
