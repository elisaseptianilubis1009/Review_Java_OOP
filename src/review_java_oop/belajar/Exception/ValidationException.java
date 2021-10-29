//Error di java di representasikan dengan istilah Exception
//kita bisa menggunakan class exception sendiri atau yang sudah di sediakan oleh java sendiri
package review_java_oop.belajar.Exception;


public class ValidationException extends Throwable{
    
    public ValidationException (String message){
        super(message);
    }
}
