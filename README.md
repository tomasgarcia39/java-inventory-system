import inventory.model.Product;
import inventory.dao.ProductDAO;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        ProductDAO dao = new ProductDAO();

        // Crear productos de ejemplo
        dao.addProduct(new Product(1, "TV 100 pulgadas", 350000, 10));
        dao.addProduct(new Product(2, "Parlante Bluetooth", 45000, 25));

        // Mostrar todos los productos
        List<Product> products = dao.getAllProducts();
        System.out.println("Productos en inventario:");
        for (Product p : products) {
            System.out.println(p);
        }

    }
}