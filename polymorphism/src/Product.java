public class Product {
    String name;
    double price;
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public double getPrice(int disc){
        return getPrice() - getPrice() * (disc / 100);
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void infoProduct(){
        System.out.println("Name: " + getName());
        System.out.println("Price: " + getPrice());
    }

}