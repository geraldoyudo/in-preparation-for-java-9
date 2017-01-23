/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gerald.blog.java9_preparation.java7;

/**
 *
 * @author Dev7
 */
public class ImprovedTypeCaching {
    class BrakeException extends Exception{
        
    }
    class FuelException extends Exception{
        
    }
    
    public void rethrowException(String exceptionName) throws Exception {
    try {
      if (exceptionName.equals("Brake")) {
        throw new BrakeException();
      } else {
        throw new FuelException();
      }
    } catch (Exception e) {
      throw e;
    }
  }
    
     public void rethrowExceptionUnique(String exceptionName) throws BrakeException, FuelException {
    try {
      if (exceptionName.equals("Brake")) {
        throw new BrakeException();
      } else {
        throw new FuelException();
      }
    } catch (Exception e) {
      throw e;
    }
  }
}
