//Jenis data yang nilainya terbatas
//misal : jenis kelamin(laki-laki dan perempuan)
//        type karyawan(standart, premium dan vip)
//        type kesuliatan soal(low, medium dan high) dll
package review_java_oop.belajar.EnumClass;

public enum Level {
    
    LOW,
    MEDIUM,
    HIGH;
    
    private String description;
    
    public String getDescription() {
        return description;
    }
    
    
    
}
