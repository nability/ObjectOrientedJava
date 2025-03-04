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

    public void luasTotal(){
        System.out.println("Luas bujur sangkar :" + getLuasBujurSangkar());
    }
}
