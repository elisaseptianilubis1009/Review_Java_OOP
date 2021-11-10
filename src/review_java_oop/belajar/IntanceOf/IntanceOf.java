
package review_java_oop.belajar.IntanceOf;

import review_java_oop.belajar.Polymorphism.Employee;
import review_java_oop.belajar.Polymorphism.Manager;
import review_java_oop.belajar.Polymorphism.VicePresident;

public class IntanceOf {
    public static void main(String[] args) {
        
        sayHello(new Employee("Elisa"));
        sayHello(new Manager("Julia"));
        sayHello(new VicePresident("Ridwan"));
        
        
        
    }
    
    static void sayHello(Employee employee){
        if(employee instanceof VicePresident){
            VicePresident vicePresident= (VicePresident) employee;
            System.out.println("Hi, My name is VP "+vicePresident.getName());
        }else if(employee instanceof Manager){
            Manager manager= (Manager) employee;
            System.out.println("Hi, My name is Manager "+manager.getName());
        }else{
            System.out.println("Hi, I am Parent Class "+employee.getName());
        }
    }
}
