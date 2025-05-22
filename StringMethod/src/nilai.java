package StringMethod.src;

class DataNilai {
    String nama;
    double nilai;

    public DataNilai(String nama, double nilai) {
        this.nama = nama.trim();
        this.nilai = nilai;
    }

    public boolean isValid() {
        return !nama.isEmpty() && nilai >= 0 && nilai <= 100;
    }

    public void tampil() {
        if (isValid()) {
            System.out.println("Nama: " + nama);
            System.out.println("Nilai: " + nilai);
        } else {
            System.out.println("Data tidak valid!");
        }
        System.out.println("----------------");
    }
}

public class nilai {
    public static void main(String[] args) {
        DataNilai d1 = new DataNilai("  ", 90);
        DataNilai d2 = new DataNilai("Bayu", -10);
        DataNilai d3 = new DataNilai("Sinta", 85);

        d1.tampil();
        d2.tampil();
        d3.tampil();
    }
}
