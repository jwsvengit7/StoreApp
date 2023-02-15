package ClassPackage;


public class Product {
    private String name;
    private float price;
    private int quatity;

    public Product(String name, float price, int quatity) {
        this.name = name;
        this.price = price;
        this.quatity = quatity;
    }
    public Product(){}
    public String getName() {
        return name;
    }

    public String setName(String name) {
        this.name = name;
        return name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getQuatity() {
        return quatity;
    }

    public void setQuatity(int quatity) {
        this.quatity = quatity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quatity=" + quatity +
                '}';
    }




}
