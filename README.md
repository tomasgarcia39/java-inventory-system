# Java Inventory System

A **Java Inventory Management System** built with **Java, JDBC, and MySQL** that demonstrates full **CRUD operations** in a console-based application.

This project was created to showcase backend fundamentals such as:

* Object-Oriented Programming (OOP)
* Database connectivity with JDBC
* MySQL database management
* DAO architecture
* Console-based user interaction

It allows users to manage products in an inventory through a simple menu-driven interface.

---

## Features

* Add new products to the inventory
* View all products stored in the database
* Search products by name
* Delete products by ID
* Persistent storage using MySQL

---

## Technologies Used

* Java
* JDBC
* MySQL
* Eclipse IDE

---

## Project Structure

```
java-inventory-system/
│
├── src/
│   └── inventory/
│       ├── dao/
│       │   └── ProductDAO.java
│       │
│       ├── database/
│       │   └── DatabaseConnection.java
│       │
│       ├── main/
│       │   └── Main.java
│       │
│       └── model/
│           └── Product.java
│
├── screenshots/
│   ├── Menu.png
│   ├── AddProduct.png
│   ├── ViewProducts.png
│   ├── SearchProduct.png
│   └── DeleteProduct.png
│
├── .gitignore
└── README.md
```

---

## Setup & Installation

### 1 Clone the repository

```bash
git clone https://github.com/tomasgarcia39/java-inventory-system.git
```

### 2 Open the project

Open the project in **Eclipse IDE** or your preferred Java IDE.

### 3 Add MySQL Connector/J

Download the MySQL JDBC driver and add it to the project's build path.

### 4 Create the database

Run the following SQL in MySQL:

```sql
CREATE DATABASE inventory_db;

USE inventory_db;

CREATE TABLE products (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    price DOUBLE NOT NULL,
    stock INT NOT NULL
);
```

### 5 Configure database credentials

Edit `DatabaseConnection.java` with your MySQL credentials:

```java
String url = "jdbc:mysql://localhost:3306/inventory_db";
String user = "root";
String password = "your_password";
```

### 6 Run the application

Run:

```
Main.java
```

---

## Usage

When running the application, the following menu will appear:

```
=== Inventory System ===
1. Add Product
2. View Products
3. Search Product
4. Delete Product
5. Exit
```

Example output:

```
Products in inventory:

1 | TV 100 inches | 350000.0 | 10
2 | Bluetooth Speaker | 45000.0 | 25
```

---


## Future Improvements

* GUI version using JavaFX or Swing
* Export inventory to CSV or Excel
* Product categories
* REST API version of the system

---

## Author

Tomas Garcia

Java Developer & Game Development Enthusiast

GitHub
https://github.com/tomasgarcia39
