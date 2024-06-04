package arraylist;

import java.util.Scanner;

class Product {
    private String name;
    private double price;
    private int quantity; // Added quantity field
    
    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    
    // Getters for name, price, and quantity
    public String getName() {
        return name;
    }
    
    public double getPrice() {
        return price;
    }
    
    public int getQuantity() {
        return quantity;
    }
    
    // Method to update quantity
    public void updateQuantity(int quantity) {
        this.quantity += quantity;
    }
}

class ShoppingCart {

	public String calculateTotal() {
		// TODO Auto-generated method stub
		return null;
	}
    // Same as before

	public void displayItems() {
		// TODO Auto-generated method stub
		
	}

	public void buyProduct(String productNameToBuy, int quantityToBuy, double priceToBuy) {
		// TODO Auto-generated method stub
		
	}
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ShoppingCart cart = new ShoppingCart();
        
        // Displaying the product names and prices available for buying
        System.out.println("Products available for buying:");
        System.out.println("1. Laptop - $999.99");
        System.out.println("2. Phone - $499.99");
        // Add more products as needed
        
        // Buying a product
        System.out.println("Enter the name of the product to buy:");
        String productNameToBuy = scanner.nextLine();
        System.out.println("Enter the quantity:");
        int quantityToBuy = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        
        double priceToBuy = 0;
        boolean validInput = false;
        while (!validInput) {
            try {
                System.out.println("Enter the price:");
                priceToBuy = Double.parseDouble(scanner.nextLine());
                validInput = true;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a valid price.");
            }
        }
        
        cart.buyProduct(productNameToBuy, quantityToBuy, priceToBuy);
        
        // Displaying the items in the cart
        cart.displayItems();
        
        // Calculating and displaying the total price
        System.out.println("Total Price: $" + cart.calculateTotal());
    }
}
