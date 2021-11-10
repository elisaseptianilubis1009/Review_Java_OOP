
package review_java_oop.belajar.Polymorphism;

public class Employee {
    
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee(String name) {
        this.name = name;
    }
    
     void sayHello(Employee employee){
        System.out.println("Hi, My name is Employee "+employee.getName());
    }
    
    
}
