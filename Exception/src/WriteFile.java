
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class WriteFile {
    public static void main(String[] args) {
        BufferedWriter bw = null;
        try{
            bw = new BufferedWriter(new FileWriter("data.txt", true));
            bw.write("Halo\n");
            bw.write("Apa kabar?\n");
            bw.write("Apakah kamu baik baik saja?\n");
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
