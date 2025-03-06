public class BujurSangkar extends BangunDatar{
    
    public BujurSangkar(double sisi){
        super("Bujur Sangkar",sisi);
    }

    public void setBujurSangkar(String BujurSangkar, double sisi){
        JenisBangunDatar = BujurSangkar;
        this.sisi = sisi;
    }

    public double getLuasBujurSangkar(){
        double luas = sisi * sisi;
        return luas;
    }

    public double getKelilingBujurSangkar(){
        double keliling = 4 * sisi;
        return keliling;
    }

    public void infoBujurSangkar(){
        System.out.println("Luas bujur sangkar :" + getLuasBujurSangkar());
        System.out.println("Keliling bujur sangkar :" + getKelilingBujurSangkar());
        System.out.println("==================");
    }

}
