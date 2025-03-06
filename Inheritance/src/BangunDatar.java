public class BangunDatar {
    String JenisBangunDatar;
    double sisi;
    double alas;
    double tinggi;
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

    // public BangunDatar(String Segitiga, double alas, double tinggi){
    //     JenisBangunDatar = Segitiga;
    //     this.alas = alas;
    //     this.tinggi = tinggi;
    // }

    public double LuasSegiTiga(){
        double luas = 0.5 * alas * tinggi;
        return luas;
    }

    public double KelilingSegiTiga(){
        double keliling = 1/2 * alas * tinggi;
        return keliling;
    }

    public double LuasBujurSangkar(){
        double luas = sisi * sisi;
        return luas;
    }

    public double KelilingBujurSangkar(){
        double keliling = 4 * sisi;
        return keliling;
    }

    public double LuasPersegiPanjang(){
        double luas = panjang * lebar;
        return luas;
    }

    public double KelilingPersegiPanjang(){
        double keliling = 2 * panjang + lebar;
        return keliling;
    }

    public void setBujurSangkar (double sisi){
        this.sisi = sisi;
    }

    public void setPersegiPanjang (double panjang, double lebar){
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public void setSegitiga (double alas, double tinggi){
        this.alas = alas;
        this.tinggi = tinggi;
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

    public double getAlas(){
        return alas;
    }

    public double getTinggi(){
        return tinggi;
    }
}
