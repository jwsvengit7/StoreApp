package ClassPackage;

import InterfacePackage.CustomerInferface;

public class Customer implements CustomerInferface {
    private String name;
    private Store Store;
    private CasherList StorePrice;
    public long wallet = 100;
    private String email;

    public Customer(String name, long wallet, String email) {
        this.name = name;
        this.wallet = wallet;
        this.email = email;
    }

    public Customer(){
        super();
    }

    public String getName() {
        return name;
    }

    public  void setName(String name) {
        this.name = name;
    }

    public ClassPackage.Store getStore() {
        return Store;
    }

    public void setStore(ClassPackage.Store store) {
        Store = store;
    }

    public CasherList getStorePrice() {
        return StorePrice;
    }

    public void setStorePrice(CasherList storePrice) {
        StorePrice = storePrice;
    }

    public long getWallet() {
        return wallet;
    }

    public void setWallet(long wallet) {
        this.wallet = wallet;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String CustomerBuy(Product seller) {
        float price = seller.getPrice();
        String name = seller.getName();
        int qty = seller.getQuatity();
        float total = price*qty;

        return "Customer \n" +

                "Price "+price+" \n" +
                "Product Name: "+ name +" \n" +
                "Quantity: "+qty+
                "Total "+total;
    }


    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", Store=" + Store +
                ", StorePrice=" + StorePrice +
                ", wallet=" + wallet +
                ", email='" + email + '\'' +
                '}';
    }
}


