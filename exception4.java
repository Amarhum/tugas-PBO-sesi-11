package tugas_sesi_11;

public class exception4 {
    public static void main(String[] args) {
        int bil=10;
        String b[] ={"a","b","c"};
       try{
        System.out.println(b[3]);
        System.out.println(bil/0);
        
       }
       catch(ArithmeticException e){
        System.out.println("Terjadi artitmatika error");
       }
       catch(ArrayIndexOutOfBoundsException e){
        System.out.println("Melebihi Jumlah Arra");
       }
       catch(Exception e){
        System.out.println("Ini menghendel error yang terjadi");
       }
    }
}

class pembetulan4{
    public static void main(String[] args) {
        int bil=10;
        String b[] ={"a","b","c"};
       try{

        System.out.println(bil/0);
        System.out.println(b[3]);
        
       }
       catch(ArithmeticException e){
        System.out.println("Terjadi artitmatika error");
       }
       catch(ArrayIndexOutOfBoundsException e){
        System.out.println("Melebihi Jumlah Arra");
       }
       catch(Exception e){
        System.out.println("Ini menghendel error yang terjadi");
       }
    }
}
