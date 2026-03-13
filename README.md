# Java Inventory System

A professional **Java Inventory System** project demonstrating **CRUD functionality, database integration with MySQL, and interactive console menu**.  

This project is perfect for showcasing Java skills, Object-Oriented Programming (OOP), JDBC, and database management on GitHub or LinkedIn.

---

## Project Structure


java-inventory-system/
├── src/
│ └── inventory/
│ ├── dao/ # ProductDAO.java – database operations
│ ├── database/ # DatabaseConnection.java – MySQL connection
│ ├── main/ # Main.java – interactive console menu
│ └── model/ # Product.java – product model
├── .gitignore
└── README.md


---

## Setup & Installation

1. **Clone the repository:**

```bash
git clone https://github.com/tomasgarcia39/java-inventory-system.git
---

2. **Open in Eclipse or your preferred Java IDE.**

3. **Add MySQL Connector/J to your project libraries.**

4. **Create MySQL database and table:**

CREATE DATABASE inventory_db;
USE inventory_db;

CREATE TABLE products (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    price DOUBLE NOT NULL,
    stock INT NOT NULL
);

Configure DatabaseConnection.java with your MySQL credentials.

Run Main.java to start the interactive console menu.

Usage

Console Menu Options:

1. **Add Product – Enter product name, price, and stock**

2. **View Products – List all products in inventory**

3. **Search Product – Find a product by name**

4. **Delete Product – Remove a product by ID**

5. **Exit – Close the program**

Example Screenshots
=== Inventory System ===
1. Add product
2. View products
3. Search product by name
4. Delete product by ID
5. Exit
Choose an option: 2

Products in inventory:
1 | TV 100 inches | 350000.0 | 10
2 | Bluetooth Speaker | 45000.0 | 25
Future Improvements

GUI interface using JavaFX or Swing

Advanced search and filtering

Export inventory to CSV or Excel

User authentication and role management

 
Author: Tomas Garcia-Java Developer & Game Development Enthusiast

GitHub

LinkedIn