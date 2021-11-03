
package review_java_oop.belajar.Try_With_Resource;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadApp {
    public static void main(String[] args) {
        BufferedReader reader =null;
        
        try {
            reader = new BufferedReader(
                    new FileReader("README.html")
            );
            
            while (true) {                
                String line = reader.readLine();
                if(line == null){
                    break;
                }
                System.out.println(line);
            }
            
        } catch (Exception e) {
            System.out.println("Error Membaca File "+e.getMessage());
        }finally{
            if(reader != null){
                try {
                    reader.close();
                } catch (IOException e) {
                    System.out.println("Error menutup resource "+e.getMessage());
                }
            }
        }
        
    }
}
