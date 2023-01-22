package tugas_sesi_11;

public class exception6 {
    static void demo(){
        NullPointerException t;
        t = new NullPointerException("coba throw");
        throw t;

        //Baris ini tidak lagi dicetak
        // System.out.println("Ini tidak dikerjakan");
    }

    public static void main(String[] args) {
        try {
            demo();
            System.out.println("selesai");
        }
        catch(NullPointerException e){
            System.out.println("Ada pesan error " + e);
        }
    }
}
