//menampilkan detail error, di file, method dan line keberapa
package review_java_oop.belajar.StackTraceElement_Class;

public class StackTraceApp {
    public static void main(String[] args) {
        try {
            String [] names={
                "Elisa","Septiani","Lubis"
            };
            System.out.println(names[50]);
        } catch (Exception e) {
               e.printStackTrace();
              //Bisa Pakai ini sama aja
//            StackTraceElement[] stackTraceElements=throwable.getStackTrace();
//            throwable.printStackTrace();
        }
    }
}
