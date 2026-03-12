package inventory;

public class Main {

    public static void main(String[] args) {

        Inventory inventory = new Inventory();

        Product p1 = new Product(1, "Laptop", 1200, 5);
        Product p2 = new Product(2, "Mouse", 25, 20);

        inventory.addProduct(p1);
        inventory.addProduct(p2);

        inventory.listProducts();
    }
}