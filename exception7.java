package tugas_sesi_11;

public class exception7 {
    public static void main(String[] args) {
        try{
            throw  new Exception("here's my exception");
        }
        catch(Exception e){
            System.out.println("caugh exception");
            System.out.println("e.getMessage() : "+ e.getMessage());
            System.out.println("e.toString() : "+ e.toString());
            System.out.println("e.printStackTrace :");
            e.printStackTrace();
        }
    }    
}
