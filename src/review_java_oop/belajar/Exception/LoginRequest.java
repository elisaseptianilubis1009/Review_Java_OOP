/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package review_java_oop.belajar.Exception;

/**
 *
 * @author admin
 */
public class LoginRequest {

    private String username;
    private String password;
    private int umur;

    public LoginRequest(String username, String password, int umur) {
        this.username = username;
        this.password = password;
        this.umur = umur;
    }

    

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    
}
