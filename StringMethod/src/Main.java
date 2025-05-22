package StringMethod.src;

class Product {
    String nama;
    String kategori;
    double harga;

    public Product(String nama, String kategori, double harga) {
        this.nama = nama.trim();
        this.kategori = kategori.trim();
        this.harga = harga;
    }

    // Getter dan Setter
    public String getnama() {
        return nama;
    }

    public void setnama(String nama) {
        this.nama = nama.trim();
    }

    public String getkategori() {
        return kategori;
    }

    public void setkategori(String kategori) {
        this.kategori = kategori.trim();
    }

    public double getharga() {
        return harga;
    }

    public void setharga(double harga) {
        this.harga = harga;
    }

    // Menghitung harga setelah diskon
    public double getFinalharga() {
        String kat = kategori.toLowerCase();
        double diskon = 0;

        if (kat.equals("elektronik") && harga > 1000000) {
            diskon = 0.20;
        } else if (kat.equals("makanan") && harga > 100000) {
            diskon = 0.15;
        }

        return harga - (harga * diskon);
    }

    public void Info() {
        System.out.println("Produk: " + nama.toUpperCase());
        System.out.println("Kategori: " + kategori);
        System.out.println("Harga Awal: Rp" + harga);
        System.out.println("Harga Setelah Diskon: Rp" + getFinalharga());
        System.out.println("------------------------------");
    }
}

public class Main {
    public static void main(String[] args) {
        Product p1 = new Product("Laptop", "Elektronik", 1500000);
        Product p2 = new Product("Kue", "Makanan", 40000);
        Product p3 = new Product("Baju", "Pakaian", 100000);

        p1.Info();
        p2.Info();
        p3.Info();
    }
}
