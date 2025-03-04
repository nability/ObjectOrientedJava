public class KaryawanTetap extends Karyawan {
    int bonus;
    public KaryawanTetap(String nama, double gp, double tunjangan){
        super(nama, gp, tunjangan);
    }

    public double getGaji(){
        double total = super.getGajiPokok() + super.getTunjangan() + bonus;
        return total;
    }
    
    public void infoKaryawan(){
        System.out.println("Nama :" + super.getGajiPokok());
        System.out.println("Gaji Pokok :" + super.getGajiPokok());
        System.out.println("Tunjangan :" + super.getTunjangan());
        System.out.println("Total gaji :" + getGaji());
        System.out.println("=============================");
    }
}
