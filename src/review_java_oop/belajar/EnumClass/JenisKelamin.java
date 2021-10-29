
package review_java_oop.belajar.EnumClass;

public enum JenisKelamin {
    
    MAN ("Jenis Kelamin Laki-laki"),
    WOMEN ("Jenis Kelamin Perempuan");
    
    private String desc;

    private JenisKelamin(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
    
    
}
