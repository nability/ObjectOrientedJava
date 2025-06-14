import java.io.*;

public class FileMerge {
    public static void main(String[] args) {
        String file1 = "file1.txt";
        String file2 = "file2.txt";
        String mergedFile = "merged_file.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(mergedFile))) {
            mergeFile(file1, bw);
            mergeFile(file2, bw);

            System.out.println("File berhasil digabung ke " + mergedFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void mergeFile(String fileName, BufferedWriter bw) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                bw.write(line);
                bw.newLine();
            }
        }
    }
}