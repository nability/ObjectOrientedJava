import java.util.Scanner;
public class GudangSimulasi {
    public static void main(String[] args) {
        Gudang<String> gudang = new Gudang<>();

        Scanner sc = new Scanner(System.in);
        System.out.println("============");
        System.out.println("1.Menambah Item");
        System.out.println("2.hapus Item");
        System.out.println("3.Barang Masuk");
        System.out.println("4.Barang Keluar");
        System.out.println("5.info Barang");
        String answer = "Y";
        while (answer.equals("Y")){
            System.out.println("pilihan :");
            int pilihan = sc.nextInt();
    
            switch(pilihan) {
                case 1:
                    System.out.println("Kode Barang :");
                    String kode = sc.next();
                    System.out.println("Nama Barang :");
                    String nama = sc.next();
                    System.out.println("Stok Barang :");
                    int stock = sc.nextInt();
                    gudang.addItem(new Item<String>(kode, nama, stock));
                    break;
                case 5:
                    gudang.printItem();
                    break;
                default:
                    break;
            }
        }

    }
}
