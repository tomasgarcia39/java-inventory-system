
package inventory;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Inventory inventory = new Inventory();
        Scanner scanner = new Scanner(System.in);

        int option = 0;

        while(option != 3) {

            System.out.println("\nInventory System");
            System.out.println("1. Add product");
            System.out.println("2. Show products");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");

            option = scanner.nextInt();

            if(option == 1) {

                System.out.print("Product id: ");
                int id = scanner.nextInt();

                scanner.nextLine(); 
                System.out.print("Product name: ");
                String name = scanner.nextLine();

                System.out.print("Price: ");
                double price = scanner.nextDouble();

                System.out.print("Stock: ");
                int stock = scanner.nextInt();

                Product product = new Product(id, name, price, stock);

                inventory.addProduct(product);

                System.out.println("Product added!");

            }

            if(option == 2) {

                inventory.listProducts();

            }

        }

        scanner.close();
    }
}