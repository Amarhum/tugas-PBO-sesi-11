package tugas_sesi_11;

public class exception5 {
    public static void main(String[] args) {
        int bil = 10;
        try{
            System.out.println(bil/0);
        }
        catch(ArithmeticException e){
            System.out.println("---pesan error---");
            System.out.println(e.getMessage());
            System.out.println("---info stack eraser---");
            e.printStackTrace();
            e.printStackTrace(System.out);
        }
        catch(Exception e){
            System.out.println("---Ini menghandle error yang terjadi---");
        }
        
    }
}

/* ANALISA PENGGUNAAN TRY DAN CATCH
 * di program System.out.println(bil/0); sudah jelas terjadi error runtime
 * karena kesalahan menginput aritmatika. untuk mengrtahui dimana error atau bug nya
 * kita harus menggunakan keyword try untuk mencoba program dan keyword catch untuk menangkap error
 * dan keyword catch(Exception e) berfungsi untu mengantisipasi jika program catch(ArithmeticException e) tidak jalan
 * fungsi dari catch(ArithmeticException e) untuk mengetahui dimana error nya
 */
