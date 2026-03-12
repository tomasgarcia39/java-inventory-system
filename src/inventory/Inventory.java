package inventory;

import java.util.ArrayList;

public class Inventory {

    private ArrayList<Product> products;

    public Inventory() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void listProducts() {
        for (Product p : products) {
            p.showProduct();
        }
    }
}