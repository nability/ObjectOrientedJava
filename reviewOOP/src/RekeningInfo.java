import java.util.Scanner;
public class RekeningInfo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("============");
        System.out.println("1.Cek Saldo");
        System.out.println("2.Tarik Saldo");
        System.out.println("3.Setor Saldo");
        System.out.println("pilihan :");
        int pilihan = sc.nextInt();

        if (pilihan == 1) {
            System.out.println("Nama Pemilik :");
            String namaPemilik = sc.next();
            System.out.println("No Rekening :");
            String noRekening = sc.next();
            System.out.println("Saldo :");
            Double saldo = sc.nextDouble();
            Rekening r1 = new Rekening(namaPemilik, noRekening, saldo);
            r1.infoRekening();
        } else if (pilihan == 2) {
            System.out.println("Nama Pemilik :");
            String namaPemilik = sc.next();
            System.out.println("No Rekening :");
            String noRekening = sc.next();
            System.out.println("Saldo :");
            Double saldo = sc.nextDouble();
            System.out.println("Jumlah :");
            Double jumlah = sc.nextDouble();
            TarikSaldo r2 = new TarikSaldo(namaPemilik, noRekening, saldo, jumlah);
            r2.infoTarik();
        }
    }
}
