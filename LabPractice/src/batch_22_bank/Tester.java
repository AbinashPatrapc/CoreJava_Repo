package batch_22_bank;

public class Tester implements Consumer {

	public static void main(String[] args) {

		CartItems prod1 = new CartItems("Mobile", 55000, 2);
		System.out.println("Total Price: " + prod1.getTotalPrice());
		ShoppingCart cart = new ShoppingCart(prod1);
		Tester t = new Tester();
		t.accept(cart);
		byte b=10;
		b+=12;
		System.out.println(b);
	

	}

	@Override
	public void accept(ShoppingCart sc) {
		CartItems c = sc.getItems();
		double price = c.getTotalPrice();

		if (price > 10000) {
			double discount = price * 10.0 / 100;
			price = price - discount;
			System.out.println("After Discount of 10%: " + price);
		}

	}

}