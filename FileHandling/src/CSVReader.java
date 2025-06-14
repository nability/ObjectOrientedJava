import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CSVReader {
    public static void main(String[] args) {
        String csvFile = "students.csv";
        String line;
        String csvSplitBy = ",";
        int indeks = 0;

        System.out.println("NIM, NAMA, UMUR, PRODI");

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null) {
                indeks++;

                if (indeks == 1) continue; // lewati header

                String[] student = line.split(csvSplitBy);
                System.out.println(student[0] + ", " + student[1] + ", " + student[2] + ", " + student[3]);
            }

            System.out.println("Jumlah baris data (tanpa header): " + (indeks - 1));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}