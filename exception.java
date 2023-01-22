package tugas_sesi_11;

public class exception {

    //jika menjalankan program ini akan error runtime karena kita menginputkan index yang salah atau
    public static void main(String[] args) {
        int a [] = new int[5];
        a[5] = 100;
    }
}

class pembetulan {
    public static void main(String[] args) {
        int a[] = new int [5];
        try {
            a[5] = 100;
        }
        catch(Exception e){
            System.err.println("terjadi pelanggran memory");
        }
    }
}
