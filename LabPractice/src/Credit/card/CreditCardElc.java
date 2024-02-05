package Credit.card;

public class CreditCardElc {

	public static void main(String[] args) {
		Customer c1=new Customer("Rajesh", 1000);
		CardType card=CardsOnOffer.getOfferedCard(c1);
		System.out.println(card);
		
	}

}
