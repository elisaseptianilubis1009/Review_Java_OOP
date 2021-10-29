//Perbedaan isEmpty() dan isBlank()
//StringUtils.isEmpty(" ")       = false  // Membaca Spasi
//StringUtils.isBlank(" ")       = true // Tidak membaca spasi, hanya ada di Java 11
package review_java_oop.belajar.Exception;

/**
 *
 * @author admin
 */
public class ValidationUtil {
    
    public static void validate(LoginRequest loginRequest) throws ValidationException,NullPointerException,IllegalArgumentException{
        if(loginRequest.getUsername()== null){
            throw new NullPointerException("Usename is null");
        }else if(loginRequest.getUsername().isEmpty()){
            throw new ValidationException("Username is Empty");
        }else if(loginRequest.getPassword()== null){
            throw new NullPointerException("Password is null");
        }else if(loginRequest.getPassword().isEmpty()){
            throw new ValidationException("Password is Empty");
        }else if(loginRequest.getUmur()<10){
            throw new IllegalArgumentException("Masih dibawah umur");
        }
    }
    
}
