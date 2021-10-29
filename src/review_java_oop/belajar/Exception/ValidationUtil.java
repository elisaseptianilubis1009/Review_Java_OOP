//Perbedaan isEmpty() dan isBlank()
//StringUtils.isEmpty(" ")       = false  // Membaca Spasi
//StringUtils.isBlank(" ")       = true // Tidak membaca spasi, hanya ada di Java 11
package review_java_oop.belajar.Exception;

/**
 *
 * @author admin
 */
public class ValidationUtil {
    
    public static void validate(LoginRequest loginRequest) throws Exception{
        if(loginRequest.getUsername()== null){
            throw new Exception("Usename is null");
        }else if(loginRequest.getUsername().isEmpty()){
            throw new Exception("Username is Empty");
        }else if(loginRequest.getPassword()== null){
            throw new Exception("Password is null");
        }else if(loginRequest.getPassword().isEmpty()){
            throw new Exception("Password is Empty");
        }
    }
    
}
