public class Segitiga extends BangunDatar {

    public Segitiga (double alas, double tinggi) {
        super("Segitiga", alas, tinggi);
    }

    public void setSegitiga (double alas, double tinggi){
        this.alas= alas;
        this.tinggi = tinggi;
    }

    public double getLuasSegitiga(){
        double luas = 0.5 * alas * tinggi;
        return luas;
    }
    public double getKelilingSegitiga(){
        double keliling = 1/2 * alas * tinggi;
        return keliling;
    }

    public void infoSegitiga(){
        System.out.println("Luas Segitiga : " + getLuasSegitiga());
        System.out.println("Keliling Segitiga : " + getKelilingSegitiga());
        System.out.println("==================");
    }
} 