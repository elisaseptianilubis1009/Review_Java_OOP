//Bisa tanpa menggunakan try catch, tapi aplikasi akan berhenti
//Biasanya Runtime Exception ini digunakan implementasi projek yang besar jadi try catch nya di ekseskui di satu tempat aja
package review_java_oop.belajar.RuntimeException;

import review_java_oop.belajar.Exception.LoginRequest;


public class BlankExceptionApp {
 
    public static void main(String[] args) {
        LoginRequest loginRequest=new LoginRequest(null, "rhs", 11);
        try {
            ValidationRuntime.validateRuntime(loginRequest);
            System.out.println("Data valid");
        } catch (BlankException e) {
            System.out.println("Data tidak valid :"+e.getMessage());
        }
        
    }
}
