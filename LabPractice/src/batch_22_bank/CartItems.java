package batch_22_bank;

public class CartItems {
     private String name;
     private double price;
     private int quantity;
	public CartItems(String name, double price, int quantity) {
		super();
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
     
     double getTotalPrice() {
    	 return quantity*price;
     }

	@Override
	public String toString() {
		return "CartItems [name=" + name + ", price=" + price + ", quantity=" + quantity + "]";
	}
     
     
     
}
