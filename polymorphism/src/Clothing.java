public class Clothing extends Product{
    int size;
    String material;

    public Clothing(String name, double price, int size, String material) {
        super(name, price);
        this.size = size;
        this.material = material;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }



    
}
