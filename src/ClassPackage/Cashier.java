package ClassPackage;

import InterfacePackage.CashierInterface;

import java.util.List;

public class Cashier extends Staff implements CashierInterface {
    public Cashier(String name, int id) {
        super(name, id);
    }

    public Cashier(){
        super();
    }

    @Override
    public int Fire(List<Cashier> cashier) {
        return 0;
    }

    @Override
    public String saleProduct(Product seller) {
        float price = seller.getPrice();
        String name = seller.getName();
        int qty = seller.getQuatity();
        return "Product Sold\nPrice "+price+" \nProduct Name: "+name+" \nQuantity: "+qty;

    }

    @Override
    public String dispenseCash(Product seller) {

        float price = seller.getPrice();
        String name = seller.getName();
        int qty = seller.getQuatity();
        int total = (int) (price*qty);

        return "Product Reciept\nPrice "+price+" \nProduct Name: "+name+" \nQuantity: "+qty+"\nTotal Price: "+total;

    }




}
