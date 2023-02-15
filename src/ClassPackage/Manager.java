package ClassPackage;

import InterfacePackage.MnagerInterface;

import java.util.List;

public class Manager extends Staff implements MnagerInterface  {
    public Manager(String name, int id) {
        super(name, id);
    }
    public Manager(){
        super();
    }

    @Override
    public int Fire(List<Cashier> cashier) {
        int id=cashier.get(0).getId();
        String name = cashier.get(0).getName();
        Cashier c = cashier.remove(0);
        int length = cashier.size();
        return length;
    }


    @Override
    public int Hire(List<Cashier> cashier) {

        //boolean name = cashier.add(cashier.get(0));
        cashier.add(0, new Cashier("Francis",8));
        int length = cashier.size();
        return length;
    }

    @Override
    public void addCashier(Cashier cashier) {

    }


}
