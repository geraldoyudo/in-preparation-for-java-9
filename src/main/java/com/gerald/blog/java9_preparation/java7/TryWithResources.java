/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gerald.blog.java9_preparation.java7;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dev7
 */
public class TryWithResources {
    public static void main(String[] args){
        InputStream inputStream = null; 
        try{
            inputStream = new FileInputStream("myFile.txt"); 
            
        }catch(FileNotFoundException ex){
            // log error
        }finally{
            if(inputStream != null)
                try {
                    inputStream.close();
            } catch (IOException ex) {
                //log error again
            }
        }
        
        
    }
}
