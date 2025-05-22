//Validasi Format Email
//Email harus mengandung @ dan .com
package StringMethod.src;

public class case2 {
    public static void main(String[] args) {
        String email = "Nabiel fauzan@.com";
        String password = "12345678";
        if (email.contains(".com")){
            System.out.println("Email valid");
        }
        else {
            System.out.println("Email tidak valid");
        }

        if (password.length() >= 12){
            System.out.println("Password valid");
        }
        else {
            System.out.println("Password tidak valid");
        }
    }
}
