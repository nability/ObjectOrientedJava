
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class Register {
    public static void main(String[] args) {
        BufferedWriter bw = null;
        try{
            bw = new BufferedWriter(new FileWriter("register.txt", true));
            bw.write("Nabiel\n");
            bw.write("20230040222\n");
            bw.write("Cikidang\n");
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
        finally {
            try {
                if(bw != null){
                bw.close();
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }    
}
