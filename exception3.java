package tugas_sesi_11;

public class exception3 {
    public static void main(String[] args) {
        int bil=10;
        System.out.println(bil/0);
    }
}

class pembetulan3{
    public static void main(String[] args) {
        int bil=10;
       try{
        System.out.println(bil/0);
       }
       catch(Exception e){
        System.out.println("Ini menghendel error yang terjadi");
       }
    }
}

class pembetulan3App{
    public static void main(String[] args) {
        int bil=10;
       try{
        System.out.println(bil/0);
       }
       catch(ArithmeticException e){
        System.out.println("Terjadi artitmatika error");
       }
       catch(Exception e){
        System.out.println("Ini menghendel error yang terjadi");
       }
    }
}
