import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CSVWriter {
    public static void main(String[] args) {
        String csvFile = "students.csv";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(csvFile))) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Masukkan jumlah data mahasiswa:");
            int jumlah = Integer.parseInt(scanner.nextLine());

            // Menulis header
            bw.write("NIM,NAMA,UMUR,PRODI");
            bw.newLine();

            for (int i = 0; i < jumlah; i++) {
                System.out.println("Data ke-" + (i + 1));
                System.out.print("NIM: ");
                String nim = scanner.nextLine();
                System.out.print("Nama: ");
                String nama = scanner.nextLine();
                System.out.print("Umur: ");
                String umur = scanner.nextLine();
                System.out.print("Prodi: ");
                String prodi = scanner.nextLine();

                String line = nim + "," + nama + "," + umur + "," + prodi;
                bw.write(line);
                bw.newLine();
            }

            System.out.println("Data berhasil ditulis ke " + csvFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}