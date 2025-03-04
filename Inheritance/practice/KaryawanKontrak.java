public class KaryawanKontrak extends Karyawan {
    double gaji_perhari;
    int masuk_hari;
    public KaryawanKontrak(String nama, double tunjangan){
        super(nama, tunjangan);
        gaji_perhari = 200000;
    }

    public void setDataKaryawanKontrak (double gph, int masuk_hari){
        gaji_perhari = gph;
        this.masuk_hari = masuk_hari;
    }

    public double getGaji(){
        double total = 
        (gaji_perhari * masuk_hari) + super.getTunjangan();
        return total;
    }

    public void infoKaryawan(){
        System.out.println("Nama :" + super.getNama());
        System.out.println("Gaji/hari :" + gaji_perhari);
        System.out.println("Jumlah Masuk :" + masuk_hari);
        System.out.println("Total Gaji :" + getGaji());
        System.out.println();
    }
}
