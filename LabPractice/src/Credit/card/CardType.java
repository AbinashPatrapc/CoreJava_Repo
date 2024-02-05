package Credit.card;

public class CardType {
	private Customer customer;
	private String cardType;
	public CardType(Customer customer, String cardType) {
		super();
		this.customer = customer;
		this.cardType = cardType;
	}
	@Override
	public String toString() {
		return "The Customer "+customer+" is Eligible for "+cardType+" card";
	}
}
