
package review_java_oop.belajar.Polymorphism;

import java.util.Objects;

public class Employee {
    
    private String name;
    
    private String alamat;
    
    private Integer umur;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public Integer getUmur() {
        return umur;
    }

    public void setUmur(Integer umur) {
        this.umur = umur;
    }

    public Employee(String name) {
        this.name = name;
    }
    
     void sayHello(Employee employee){
        System.out.println("Hi, My name is Employee "+employee.getName());
    }

    @Override
    public String toString() {
        return "Employee{" + "name=" + name + ", alamat=" + alamat + ", umur=" + umur + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 13 * hash + Objects.hashCode(this.name);
        hash = 13 * hash + Objects.hashCode(this.alamat);
        hash = 13 * hash + Objects.hashCode(this.umur);
        return hash;
    }

    

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Employee other = (Employee) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.alamat, other.alamat)) {
            return false;
        }
        if (!Objects.equals(this.umur, other.umur)) {
            return false;
        }
        return true;
    }

    
    
     
    
}
