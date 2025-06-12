
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentDB {
    String  url =  "jdbc:mysql://localhost:3306/Campus";
    Connection koneksi;

    public Connection getConnection(String user, String pass) throws SQLException {
        return DriverManager.getConnection(url, user, pass);
    }

    //proses membaca data students
    public void readStudents(){
        String sql = "select * from student";
        try {
            koneksi = getConnection("root","");
            Statement st = koneksi.createStatement();
            ResultSet rs = st.executeQuery(sql);
            System.out.println("NIM\tName\tADDRESS\tGENDER");
            while(rs.next()){
                String nim = rs.getString(1);
                String name = rs.getString(2);
                String address = rs.getString(3);
                String gender = rs.getString(4);
                System.out.println(nim+"\t"+name+"\t"+address+"\t"+gender+"\t");
            }
        } catch (SQLException e) {  
            e.printStackTrace();
        }
        finally {
            try {
                if (koneksi != null){
                    koneksi.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public void insertStudents(String nim, String name, String address, String gender){
        String sql = "insert into student (nim,name,address,gender) values(?,?,?,?)";
        try {
            koneksi = getConnection("root","");
            boolean valid = true;
            String error = "";
            if(nim.length() < 11){
                valid = false;
                error += "NIM harus 11 digit\n";
            }

            if(gender != "L" && gender != "P"){
                valid = false;
                error += "Gender harus L/P";
            }
            System.out.println(error);
            if(valid){
            PreparedStatement ps = koneksi.prepareStatement(sql);
            ps.setString(1, nim);
            ps.setString(2, name);
            ps.setString(3, address);
            ps.setString(4, gender);

            int result = ps.executeUpdate();
            if (result > 0){
                System.out.println("data berhasil ditambahkan       ");
            }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public boolean PrimaryCheck(String nim){
        String sql = "select * from student where nim" + nim;
        try {
            koneksi = getConnection("root","");
            Statement st = koneksi.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if(rs.next()){
                return true;
            }
            return false;
        } catch (SQLException e) {
            e.printStackTrace();
            return true;
        }
    }
}
