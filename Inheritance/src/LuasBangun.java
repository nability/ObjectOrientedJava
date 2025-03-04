import java.util.Scanner;
public class LuasBangun {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("============");
        System.out.println("1.BujurSangkar");
        System.out.println("2.PersegiPanjang");
        System.out.println("3.Segitiga");
        System.out.println("Jenis BangunDatar : ");
        int JenisBangunDatar = sc.nextInt();

        if (JenisBangunDatar==1){
            System.out.println("Sisi :");
            double sisi = sc.nextDouble();
            BujurSangkar b1 = new BujurSangkar(sisi);
            b1.luasTotal();
        }
        else {
            
        }
    }
}
