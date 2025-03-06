public class PersegiPanjang extends BangunDatar {

    public PersegiPanjang(double panjang, double lebar){
        super("Persegi Panjang", panjang, lebar);
    }

    public void setPersegiPanjang(String PersegiPanjang, double panjang, double lebar){
        JenisBangunDatar = PersegiPanjang;
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public double getLuasPersegiPanjang(){
        double luas = panjang * lebar;
        return luas;
    }
    public double getKelilingPersegiPanjang(){
        double keliling = 2 * panjang + lebar;
        return keliling;
    }

    public void infoPersegiPanjang(){
        System.out.println("Luas Persegi Panjang : " + getLuasPersegiPanjang());
        System.out.println("Keliling Persegi Panjang : " + getKelilingPersegiPanjang());
        System.out.println("==================");
    }

}
