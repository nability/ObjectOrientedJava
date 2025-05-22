import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class RegisterRead {
    public static void main(String[] args) {
        BufferedReader rd = null;
        try {
            rd = new BufferedReader(new FileReader("register.txt"));
            String row = "";
            while((row = rd.readLine()) != null){
                System.out.println(row);
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
