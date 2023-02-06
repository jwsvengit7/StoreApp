import ClassPackage.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Manager manager =new Manager();

        Cashier cashier= new Cashier("Joy",434,"442","4343",Staffs.Cashier);
        Cashier b =new Cashier();
        Product seller = new Product("IphoneXr",600000,3,9);

        System.out.println(b.saleProduct());
        System.out.println(b.depenseReciept(seller));
        System.out.println(manager.Fire(cashier));
        System.out.println(manager.Hire(cashier));
    }
}