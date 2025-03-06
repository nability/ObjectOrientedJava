public class Food extends Product{
    int expired;

    public Food(String name, double price, int expired) {
        super(name, price);
        this.expired = expired;
    }

    public int getExpired() {
        return expired;
    }

    public void setExpired(int expired) {
        this.expired = expired;
    }

    @Override
    public void infoProduct() {
        super.infoProduct();
        System.out.println("Expired: " + getExpired());
    }
}
