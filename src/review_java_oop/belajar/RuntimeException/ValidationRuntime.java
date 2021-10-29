/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package review_java_oop.belajar.RuntimeException;

import review_java_oop.belajar.Exception.LoginRequest;

/**
 *
 * @author admin
 */
public class ValidationRuntime {
    
    public static void validateRuntime(LoginRequest loginRequest){
        if(loginRequest.getUsername()== null){
            throw new NullPointerException("Usename is null");
        }else if(loginRequest.getUsername().isEmpty()){
            throw new BlankException("Username is Empty");
        }else if(loginRequest.getPassword()== null){
            throw new NullPointerException("Password is null");
        }else if(loginRequest.getPassword().isEmpty()){
            throw new BlankException("Password is Empty");
        }else if(loginRequest.getUmur()<10){
            throw new IllegalArgumentException("Masih dibawah umur");
        }
    }
    
}
