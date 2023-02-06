package ClassPackage;

import InterfacePackage.MnagerInterface;

public class Manager extends Staff implements MnagerInterface {
    public Manager(String name, int id, String email, String adresss, Staffs position) {
        super(name, id, email, adresss, position);
    }
    public Manager() {
        super();
    }
    @Override
    public String Fire(Cashier cashier) {
        String sack = cashier.getName();
        return sack+ " You are fired";
    }

    @Override
    public String Hire(Cashier cashier) {
        String sack = cashier.getName();
        return  "we just appointed "+sack;
    }


}
