public class Electronic extends Product {
    String waranty;

    public Electronic(String name, double price, String waranty) {
        super(name, price);
        this.waranty = waranty;
    }

    public String getWaranty() {
        return waranty;
    }

    public void setWaranty(String waranty) {
        this.waranty = waranty;
    }

    // Overriding
    @Override
    public void infoProduct() {
        super.infoProduct();
        System.out.println("Waranty :" + getWaranty());
    }

}
