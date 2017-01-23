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
public class MultiCatchExample {
    
    public static void main (String[] args){
        int [] numbers = {2,3,4,0};
        int result;
        try{
            for(int i=0; i<10; ++i){
               result =  numbers[i]/numbers[i+1];
            }
        }catch(ArithmeticException ex){
           // do something with exception
            
        }catch(IndexOutOfBoundsException ex){
            // do the same thing with exception
        }
    }
}
