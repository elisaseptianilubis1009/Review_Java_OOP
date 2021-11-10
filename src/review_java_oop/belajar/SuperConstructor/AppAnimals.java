package review_java_oop.belajar.SuperConstructor;

public class AppAnimals {
    public static void main(String[] args) {
        
        Butterfly butterfly=new Butterfly();
        butterfly.setName("Kupu-kupu");
        butterfly.setAge(20);
        butterfly.setSimbiosis("Simbiosis Mutualisme");
        
        System.out.println("Name :"+butterfly.getName());
        System.out.println("Age :"+butterfly.getName());
        System.out.println("Simbiosis :"+butterfly.getSimbiosis());
    }
}
