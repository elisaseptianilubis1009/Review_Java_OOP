
package review_java_oop.belajar.Anonymous;

import com.sun.xml.internal.ws.api.pipe.Engine;


public class AppAnonymous {
    
    public static void main(String[] args) {
        
        Anonymous english = new Anonymous() {
            @Override
            public void sayHello() {
                System.out.println("Hello");
            }

            @Override
            public void sayHello(String name) {
                System.out.println("Hello "+name);
            }
        };
        
        Anonymous indonesia = new Anonymous() {
            @Override
            public void sayHello() {
                System.out.println("Halo");
            }

            @Override
            public void sayHello(String name) {
                System.out.println("Halo "+name);
            }
        };
        
        english.sayHello();
        english.sayHello("Elisa");
        
        indonesia.sayHello();
        indonesia.sayHello("Julia");
    }
    
   
    
}
