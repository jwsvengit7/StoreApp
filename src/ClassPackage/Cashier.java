package ClassPackage;

import InterfacePackage.CashierInterface;

public class Cashier extends Staff implements CashierInterface {
    public Cashier(String name, int id, String email, String adresss, Staffs position) {
        super(name, id, email, adresss, position);
    }
    public Cashier() {
        super();
    }
    @Override
        public String saleProduct() {
            return "Product have been sold";
        }

        @Override
        public String depenseReciept(Product seller) {
        String nameOfProduct = seller.getProductName();
        int totalQuatity = seller.getTotalPrice();

        return "Reciept\nProduct Name: "+nameOfProduct+"\nQuantity: "+totalQuatity;
        }
    }

