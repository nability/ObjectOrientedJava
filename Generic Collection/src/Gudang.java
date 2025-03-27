import java.util.HashMap;
import java.util.Map;
public class Gudang <T> {
    private Map<T, Item<T>> barang;

    public Gudang(){
        barang = new HashMap<>();
    }

    public void addItem(Item<T> item){
        barang.put(item.getCode(), item);
        System.out.println(item.getName() + "Berhasil ditambahkan");
    }

    public void removeItem(T code){
        if(barang.containsKey(code)){
            System.out.println(barang.get(code).getName() + "Berhasil dihapus");
            barang.remove(code);
        }

        else{
            System.out.println("kode tidak ditemukan");
        }
    }

    public void addStock(T code, int stock){
        if(barang.containsKey(code)){
            barang.get(code).addStock(stock);
            System.out.println("jumlah" + barang.get(code).getName() + "berhasil ditambahkan" + "sebanyak :" + stock + "unit");
        }
        else{
            System.out.println("barang tidak ditemukan");
        }
    }

    public void removeStock(T code, int jumlah){
        if(barang.containsKey(code)){
            barang.get(code).removeStock(jumlah);
            System.out.println("stok" + barang.get(code).getName() + "berhasil dikurangi");
        }
        else{
            System.out.println("barang tidak ditemukan");
        }
    }

    public void printItem(){
        for(Item<T> item : barang.values()){
            item.infoItem();
        }
    }
}
