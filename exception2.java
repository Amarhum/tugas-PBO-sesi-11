package tugas_sesi_11;

public class exception2 {
    public static void main(String[] args) {
        int i = 0;
        String greeting[] = {
            "hello world!",
            "no, i mean it!",
            "hello world"
        };
        while (i<4){
            System.out.println(greeting[i]);
            i++;
        }
    }
}

class pembetulan2{
    public static void main(String[] args) {
        int i = 0;
        String greeting[] = {
            "hello world!",
            "no, i mean it!",
            "hello world"
        };
        while (i<4){
            try{
                System.out.println(greeting[i]);
                 i++;
            }
            catch(Exception e) {
                System.out.println("Resetting index value");
                i = 0;
            }
            break;
        }
       
}
}
