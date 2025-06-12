public class Students {
    public static void main(String[] args) {
        StudentDB student = new StudentDB();
        boolean check = student.PrimaryCheck("20230040223");
        if(!check){
            student.insertStudents("20230040222", "Nabiel", "Cikidang", "L");
        } else {
            System.out.println("NIM sudah ada, tidak bisa ditambahkan lagi");
        }
        student.insertStudents("20230040222", "biel","ceg", "P");
        student.readStudents();
    }
}
