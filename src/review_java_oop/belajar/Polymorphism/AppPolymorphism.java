
package review_java_oop.belajar.Polymorphism;


public class AppPolymorphism {
    public static void main(String[] args) {
        Employee employee = new Employee("Elisa");
        employee.sayHello(new Employee("Elisa"));
        
        employee=new Manager("Julia");
        employee.sayHello(new Manager("Julia"));
        
        employee=new VicePresident("Ridwan");
        employee.sayHello(new VicePresident("Ridwa"));
    }
    
}
