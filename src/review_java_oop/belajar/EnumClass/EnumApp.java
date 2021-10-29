
package review_java_oop.belajar.EnumClass;

public class EnumApp {
    
    public static void main(String[] args) {
        Exercise exercise= new Exercise();
        exercise.setName("Elisa Septiani Lubis");
        exercise.setLevel(Level.HIGH);
        exercise.setJenisKelamin(JenisKelamin.WOMEN);
        
        System.out.println("Nama :"+exercise.getName());
        System.out.println("Level :"+exercise.getLevel()+" Descriprion :"+exercise.getLevel().getDescription());
        System.out.println("Jenis Kelamin :"+exercise.getJenisKelamin());
    }
    
}
