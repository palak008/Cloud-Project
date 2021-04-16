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
 * @author HP
 */
@WebService(serviceName = "profitlosscalc")
public class profitlosscalc {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "ProfitLoss")
    public String ProfitLoss(@WebParam(name = "sp") int sp, @WebParam(name = "cp") int cp) {
        int res = sp-cp;
        
        if (res<0)
        {
            res = cp-sp;
            return "There is a loss of " + res;
        }
        else
        { 
            return "There is a profit of " + res;
        }
    }

    /**
     * This is a sample web service operation
     */
    
}
