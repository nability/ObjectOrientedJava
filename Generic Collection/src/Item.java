public class Item <T> { //generic class
    T code;
    String name;
    int stock;

    public Item(T code, String name, int stock) {
        this.code = code;
        this.name = name;
        this.stock = stock;
    }

    public void setCode(T code) {
        this.code = code;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setStock(int stock) {
        this.stock = stock;
    }

    public T getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public int getStock() {
        return stock;
    }

    public void addStock (int stock){
        this.stock += stock;
        System.out.println(getName() + "berhasil menambah stock" + "sebanyak" + stock + "unit");
    }

    public void removeStock (int jumlah){
        if(jumlah <= this.stock){
            this.stock -= jumlah;
            System.out.println(getName() + "berhasil mengurangi stock" + "sebanyak" + jumlah + "unit");
        }
        else{
            System.out.println("Stock tidak mencukupi");
        }
    }
    public void infoItem() {
        System.out.println("Code: " + getCode() + "Name: " + getName() + "Stock: " + getStock());
    }
}
