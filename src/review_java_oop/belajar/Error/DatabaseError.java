//Sangat tidak di rekomendasikan pakai try catch
//biasanya Exception jenis Error ini digunakan untuk error yang fatal seperti tidak bisa concet Database
//kalo semisal untuk validasi mending gunakan runtimeException
package review_java_oop.belajar.Error;

public class DatabaseError extends Error {

    public DatabaseError(String message) {
        super(message);
    }
}
