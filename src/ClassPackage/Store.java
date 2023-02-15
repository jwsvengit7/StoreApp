package ClassPackage;

import java.util.ArrayList;
import java.util.List;

public class Store {
        private List<Product> product;

        public List<Cashier> getCashiers() {
                return cashiers;
        }

        private List<Cashier> cashiers = new ArrayList<>();
        public Store(List<Product> product) {
                this.product = product;
        }
        public List<Product> getProduct() {
                return product;
        }

        public void setProduct(List<Product> product) {

                this.product = product;
        }


        @Override
        public String toString() {
                return "Store{" +
                        "product=" + product +
                        '}';
        }
}
