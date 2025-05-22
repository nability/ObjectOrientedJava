import java.util.InputMismatchException;
import java.util.Scanner;

public class Aritmatika {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hasil = 0;

        try{
            System.out.println("Angka1 : ");
            int num1 = sc.nextInt();
            System.out.println("Angka2 : ");
            int num2 = sc.nextInt();
            hasil = num1 / num2;
        }catch(InputMismatchException a){
            System.out.println("error input kocak");
        }
        catch(ArithmeticException n){
            System.out.println(n.getMessage());
        }
        finally{
            System.out.println("Finally selalu dijalankan");
        }
    }
}
