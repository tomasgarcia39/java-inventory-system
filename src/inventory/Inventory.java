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

public Product findProductById(int id) {

    for (Product p : products) {
        if (p.getId() == id) {
            return p;
        }
    }

    return null;
}

public void removeProduct(int id) {

    Product product = findProductById(id);

    if (product != null) {
        products.remove(product);
        System.out.println("Product removed.");
    } else {
        System.out.println("Product not found.");
    }
}
}
