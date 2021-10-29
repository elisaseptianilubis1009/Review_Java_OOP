package review_java_oop.belajar.Exception;

public class ExceptionApp {

    public static void main(String[] args) {
        LoginRequest loginRequest = new LoginRequest("elisa", "rahasia", 8);

        //NullPointerException tambah catch
//        try {
//            ValidationUtil.validate(loginRequest);
//            System.out.println("Data Valid");
//        } catch (Exception e) {
//            System.out.println("Data tidak valid :"+e.getMessage());
//        }catch(NullPointerException n){
//            System.out.println("Data null :"+n.getMessage());
//        }
        //NullPointerException di gabung dengan Exception dnegan format dibawah biar lebih simple
        try {
            ValidationUtil.validate(loginRequest);
            System.out.println("Data Valid");
        } catch (ValidationException | NullPointerException | IllegalArgumentException e) {
            System.out.println("Data tidak valid : " + e.getMessage());
        }finally{
            System.out.println("Selalu di eksekusi baik itu sukses atau error");
        }

    }
}
