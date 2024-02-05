package batch_22_bank;

public class ShoppingCart {
    private CartItems items;

	public ShoppingCart(CartItems items) {
		super();
		this.items = items;
	}

	public CartItems getItems() {
		return items;
	}

	public void setItems(CartItems items) {
		this.items = items;
	}

	@Override
	public String toString() {
		return "ShoppingCart [items=" + items + "]";
	}
    
     
}
