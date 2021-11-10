
package review_java_oop.belajar.Polymorphism;

public class Manager extends Employee{
    
    private String company;

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public Manager(String name) {
        super(name);
    }
    
   
//     public void sayHello(String name){
//        System.out.println("Hi, My name is Manager "+name);
//    }
    
}
