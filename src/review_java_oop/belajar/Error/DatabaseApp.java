package review_java_oop.belajar.Error;

public class DatabaseApp {

    public static void main(String[] args) {
        connectDatabase("elisa", null);
        System.out.println("sukses");

// Bisa juga pakai Try Catch tetapi tidak disarankan
//        try {
//            connectDatabase("elisa", null);
//            System.out.println("sukses");
//        } catch (DatabaseError error) {
//            System.out.println("Error :"+error.getMessage());
//        }
    }

    public static void connectDatabase(String username, String password) {
        if (username == null || password == null) {
            throw new DatabaseError("Gagal konek ke Database");
        }
    }
}
