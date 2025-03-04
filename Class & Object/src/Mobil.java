public class Mobil {
    String merk;
    String warna;
    int kecepatan;
    boolean nyala = false;

    public void setDataMobil(String b, String warna, int k) {
        merk = b;
        kecepatan = k;
        this.warna = warna;
    }

    public String getMerk(){
        return merk;
    }

    public int getKecepatan(){
        return kecepatan;
    }
    
    public String getWarna(){
        return warna;
    }

    public void tambahKecepatan(int k){
        if (nyala = true)
            kecepatan += k;
        else (nyala = false)
            System.out.println("mati");
    }
    

    public void infoMobil(){
        System.out.println("Merk :" + getMerk());
        System.out.println("Warna :" + getWarna());
        System.out.println("Kecepatan :" + getKecepatan());
        System.out.println("===================");
    }

}
