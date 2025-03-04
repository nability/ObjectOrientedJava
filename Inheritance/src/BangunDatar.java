public class BangunDatar {
    String JenisBangunDatar;
    double sisi;
    double panjang;
    double lebar;

    public BangunDatar(String BujurSangkar, double sisi){
        JenisBangunDatar = BujurSangkar;
        this.sisi = sisi;
    }

    public BangunDatar(String PersegiPanjang, double panjang, double lebar){
        JenisBangunDatar = PersegiPanjang;
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public double LuasBujurSangkar(){
        double luas = sisi * sisi;
        return luas;
    }

    public double LuasPersegiPanjang(){
        double luas = panjang * lebar;
        return luas;
    }

    public void setBujurSangkar (double sisi){
        this.sisi = sisi;
    }

    public void setPersegiPanjang (double panjang, double lebar){
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public String getJenisBangunDatar(){
        return JenisBangunDatar;
    }
    public double getSisi(){
        return sisi;
    }

    public double getPanjang(){
        return panjang;
    }

    public double getLebar(){
        return lebar;
    }

    
}
