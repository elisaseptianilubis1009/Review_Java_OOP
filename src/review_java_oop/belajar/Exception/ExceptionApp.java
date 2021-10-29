
package review_java_oop.belajar.Exception;

public class ExceptionApp {
    public static void main(String[] args) {
        LoginRequest loginRequest= new LoginRequest("elisa"," ");
        
        try {
            ValidationUtil.validate(loginRequest);
            System.out.println("Data Valid");
        } catch (Exception e) {
            System.out.println("Data tidak valid : "+e.getMessage());
        }
        
    }
}
