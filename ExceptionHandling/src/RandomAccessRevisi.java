import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessRevisi {
    public static void main(String[] args) {
        String bookList[] = {"Satu", "Dua", "Tiga"};
        int yearList[] = {1920, 1230, 1940};

        try {
            // Membuka file books.txt dengan mode read-write
            RandomAccessFile books = new RandomAccessFile("books.txt", "rw");

            // Menulis data buku dan tahun ke dalam file
            for (int i = 0; i < 3; i++) {
                books.writeUTF(bookList[i]);
                books.writeInt(yearList[i]);
            }

            // Kembali ke posisi awal file untuk membaca data
            books.seek(0);

            // Membaca dan menampilkan dua data pertama
            System.out.println(books.readUTF() + " " + books.readInt());
            System.out.println(books.readUTF() + " " + books.readInt());

            books.close();
        } catch (IOException e) {
            System.out.println("Indeks melebihi batas");
        }

        System.out.println("test");
    }
}