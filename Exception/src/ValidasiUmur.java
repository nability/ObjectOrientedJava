import java.util.InputMismatchException;
import java.util.Scanner;

public class ValidasiUmur {
    
    public void cekUmur(int umur) throws ValidasiException{
        if(umur < 17){
            throw new ValidasiException("Belum cukup umur");
        }
    }

    public static void main(String[] args) throws ValidasiException {
        ValidasiUmur vu = new ValidasiUmur();
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("umur :");
            int umur = sc.nextInt();
            vu.cekUmur(umur);
        } catch (InputMismatchException e) {
            System.out.println("input anda salah");
        } finally {
            sc.close();
        }
    }


}
