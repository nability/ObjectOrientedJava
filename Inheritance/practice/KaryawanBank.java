import java.util.Scanner;
public class KaryawanBank {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("============");
        System.out.println("1.Karyawan Tetap");
        System.out.println("2.Karyawan Kontrak");

        System.out.println("Isikan Pilihan :");
        int pilihan = sc.nextInt();
        System.out.println("Nama :");
        String nama = sc.next();
        System.out.println("Tunjangan :");
        double tunjangan = sc.nextDouble();
        if(pilihan==1){
            System.out.println("Gaji Pokok :");
            double gapok = sc.nextDouble();
            KaryawanTetap k1 = new KaryawanTetap(nama, gapok, tunjangan);
            k1.infoKaryawan();
        }
        else{
            System.out.println("Gaji Harian");
            double gaji_perhari = sc.nextDouble();
            System.out.println("Jumlah Masuk :");
            int masuk_hari = sc.nextInt();
            KaryawanKontrak k2 = new KaryawanKontrak(nama, tunjangan);
            k2.setDataKaryawanKontrak(gaji_perhari, masuk_hari);
            k2.infoKaryawan();
        }
    }
}
