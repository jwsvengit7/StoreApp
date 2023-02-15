package ClassPackage;

import java.util.ArrayList;
import java.util.List;

public class CasherList {
    private List<Cashier> cashier;

    public CasherList(List<Cashier> cashier) {

        this.cashier = cashier;
    }

    public List<Cashier> getCashier() {

        return cashier;
    }

    public void seCashier(List<Cashier> cashier) {

        this.cashier = cashier;
    }


    @Override
    public String toString() {
        return "CasherList{" +
                "cashier=" + cashier +
                '}';
    }
}
