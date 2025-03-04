public class BangunDatar {
    String JenisBangunDatar;
    double sisi;

    public BangunDatar(String BujurSangkar, double sisi){
        JenisBangunDatar = BujurSangkar;
        this.sisi = sisi;
    }

    public double LuasBujurSangkar(){
        double luas = sisi * sisi;
        return luas;
    }

    public void setBujurSangkar (double sisi){
        this.sisi = sisi;
    }

    public String getJenisBangunDatar(){
        return JenisBangunDatar;
    }
    public double getSisi(){
        return sisi;
    }

    
}
