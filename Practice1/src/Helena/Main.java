package Helena;

import java.util.*;

class Coffee {
	private String type;
	private String size;
	private int quantity;

	public Coffee(String type, String size, int quantity) {
		this.type = type;
		this.size = size;
		this.quantity = quantity;
	}

	public String getType() {
		return type;
	}

	public String getSize() {
		return size;
	}

	public int getQuantity() {
		return quantity;
	}
}

class Order {
	private String customerName;
	private List<Coffee> coffeeList;

	public Order(String customerName, List<Coffee> coffeeList) {
		this.customerName = customerName;
		this.coffeeList = coffeeList;
	}

	public String getCustomerName() {
		return customerName;
	}

	public List<Coffee> getCoffeeList() {
		return coffeeList;
	}
}

class CoffeeShop {
	private static final double[][] PRICES = { { 2.00, 2.50, 3.00 }, // Regular
			{ 3.00, 3.50, 4.00 }, // Latte
			{ 3.50, 4.00, 4.50 }, // Cappuccino
			{ 2.50, 3.00, 3.50 } // Espresso
	};

	public static double calculateTotalCost(Order order) {
		double totalCost = 0.0;
		List<Coffee> coffeeList = order.getCoffeeList();
		for (Coffee coffee : coffeeList) {
			int typeIndex = getTypeIndex(coffee.getType());
			int sizeIndex = getSizeIndex(coffee.getSize());
			double price = PRICES[typeIndex][sizeIndex];
			totalCost += price * coffee.getQuantity();
		}
		return totalCost;
	}

	private static int getTypeIndex(String type) {
		switch (type) {
		case "Regular":
			return 0;
		case "Latte":
			return 1;
		case "Cappuccino":
			return 2;
		case "Espresso":
			return 3;
		default:
			throw new IllegalArgumentException("Invalid coffee type: " + type);
		}
	}

	private static int getSizeIndex(String size) {
		switch (size) {
		case "Small":
			return 0;
		case "Medium":
			return 1;
		case "Large":
			return 2;
		default:
			throw new IllegalArgumentException("Invalid coffee size: " + size);
		}
	}
}

public class Main {
	public static void main(String[] args) {
		List<Coffee> coffee = new ArrayList<>();
		coffee.add(new Coffee("Regular", "Small", 27));
		coffee.add(new Coffee("Latte", "Medium", 5));
		coffee.add(new Coffee("Cappuccino", "Large", 3));

		List<Coffee> coffee1 = new ArrayList<>();
		coffee1.add(new Coffee("Espresso", "Small", 2));
		coffee1.add(new Coffee("Latte", "Large", 1));

		Order order = new Order("customer 1", coffee);
		Order order1 = new Order("Customer 2", coffee1);

		System.out.println(CoffeeShop.calculateTotalCost(order));
		System.out.println(CoffeeShop.calculateTotalCost(order1));
	}
}
