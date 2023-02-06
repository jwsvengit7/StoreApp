package ClassPackage;

public class Product {
    private String productName;

    private float price;
    private int quantity;
    private int totalPrice;

    public Product(String productName, float price, int quantity, int totalPrice) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.totalPrice = totalPrice;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice,int quantity) {
        this.totalPrice = totalPrice * quantity;
    }
}
