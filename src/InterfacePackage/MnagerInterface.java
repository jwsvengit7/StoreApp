package InterfacePackage;

import ClassPackage.Cashier;

import java.util.List;

public  interface MnagerInterface {
    public int Hire(List<Cashier> cashier);
    public int Fire(List<Cashier> cashier);

    public void addCashier(Cashier cashier);
}
