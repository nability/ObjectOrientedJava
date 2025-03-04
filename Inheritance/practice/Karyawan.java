public class Karyawan {
    String nama;
    double gaji_pokok;
    double tunjangan;
    
//super class
    public Karyawan(String nama, double gapok, double tunjangan) {
        this.nama = nama;
        gaji_pokok = gapok;
        this.tunjangan = tunjangan;
    }

    public Karyawan(String nama, double tunjangan){
        this.nama = nama;
        this.tunjangan = tunjangan;
    }

    public void setDataKaryawan(String nm, double gp, double tj) {
        nama = nm;
        gaji_pokok = gp;
        tunjangan = tj;
    }

    public String getNama(){
        return nama;
    }

    public double getGajiPokok(){
        return gaji_pokok;
    }

    public double getTunjangan(){
        return tunjangan;
    }
    
}
