import java.util.Scanner;

public class tokped {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1.Electronic");
        System.out.println("2.Clothing");
        System.out.println("3.Food");
        System.out.println("Kode product");
        int Menu = sc.nextInt();

        if(Menu==1){
            Electronic el = new Electronic(null, 0, null);
            System.out.println("Merk :");
            String name = sc.next();
            el.setName(name);
            System.out.println("Enter price :");
            double price = sc.nextDouble();
            el.setPrice(price);
            System.out.println("Waranty :");
            String waranty = sc.next();
            el.setWaranty(waranty);
            el.infoProduct();
        }

        else if(Menu==2){
            Clothing cl = new Clothing(null, 0, 0, null);
            System.out.println("Merk :");
            String name = sc.next();
            cl.setName(name);
            System.out.println("Enter price :");
            double price = sc.nextDouble();
            cl.setPrice(price);
            System.out.println("Size :");
            int size = sc.nextInt();
            cl.setSize(size);
            cl.infoProduct();
        }

        if(Menu==3){
            Food fd = new Food(null, 0, 0);
            System.out.println("Merk :");
            String name = sc.next();
            fd.setName(name);
            System.out.println("Enter price :");
            double price = sc.nextDouble();
            fd.setPrice(price);
            System.out.println("Expired :");
            int expired = sc.nextInt();
            fd.setExpired(expired);
            fd.infoProduct();
        }
    }
}

