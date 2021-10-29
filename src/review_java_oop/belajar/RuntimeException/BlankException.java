//Ketika kita extends ke RuntimeExcepton udah sekaligus extends Throwable
package review_java_oop.belajar.RuntimeException;


public class BlankException extends RuntimeException {

    public BlankException(String message) {
        super(message);
    }

}
