public class gudangApp {
    public static void main(String[] args) {
        Gudang<String> gudang = new Gudang<>();
        Item<String> item1 = new Item<>("001", "Buku", 10);

        gudang.addItem(item1);

        gudang.addItem(new Item<String>("002", "Laptop", 20));

        gudang.addItem(new Item<String>("003", "Pensil", 30));

        gudang.printItem();

        gudang.addStock("003", 5);

        gudang.printItem();
    }
}
