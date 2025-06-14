public class Exception2 {
    public static void main(String[] args) {
        int i=0;
        String greetings[] = {
            "Hello World!",
            "No, i mean it!",
            "Hello World!"
        };
        while(i<4)
        {
            try {
                System.out.println(greetings[i]);
                i++;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Ressetting index value");
                i=0;
            }
        }
    }
}