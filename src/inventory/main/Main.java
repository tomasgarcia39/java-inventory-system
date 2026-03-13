package inventory.main;

import inventory.model.Product;
import inventory.dao.ProductDAO;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ProductDAO dao = new ProductDAO();
        Scanner sc = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n=== Sistema de Inventario ===");
            System.out.println("1. Agregar producto");
            System.out.println("2. Ver productos");
            System.out.println("3. Buscar producto por nombre");
            System.out.println("4. Eliminar producto por id");
            System.out.println("5. Salir");
            System.out.print("Elegí una opción: ");

            int option = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            switch (option) {
                case 1:
                    System.out.print("Nombre del producto: ");
                    String name = sc.nextLine();
                    System.out.print("Precio: ");
                    double price = sc.nextDouble();
                    System.out.print("Stock: ");
                    int stock = sc.nextInt();
                    sc.nextLine(); // limpiar buffer

                    dao.addProduct(new Product(0, name, price, stock));
                    System.out.println("Producto agregado correctamente.");
                    break;

                case 2:
                    List<Product> products = dao.getAllProducts();
                    System.out.println("\nProductos en inventario:");
                    for (Product p : products) {
                        System.out.println(p);
                    }
                    break;

                case 3:
                    System.out.print("Nombre del producto a buscar: ");
                    String searchName = sc.nextLine();
                    Product found = dao.getProductByName(searchName);
                    if (found != null) {
                        System.out.println("Producto encontrado: " + found);
                    } else {
                        System.out.println("Producto no encontrado.");
                    }
                    break;

                case 4:
                    System.out.print("ID del producto a eliminar: ");
                    int deleteId = sc.nextInt();
                    sc.nextLine(); // limpiar buffer
                    boolean deleted = dao.deleteProductById(deleteId);
                    if (deleted) {
                        System.out.println("Producto eliminado correctamente.");
                    } else {
                        System.out.println("No se encontró producto con ese ID.");
                    }
                    break;

                case 5:
                    running = false;
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opción inválida, intentá de nuevo.");
            }
        }

        sc.close();
    }
}