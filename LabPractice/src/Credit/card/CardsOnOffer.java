package Credit.card;

public class CardsOnOffer {
	public static CardType getOfferedCard(Customer c1) {
		if (c1.getCreditPoints() >= 100 && c1.getCreditPoints() <= 500)
			return new CardType(c1, "Silver");
		else if (c1.getCreditPoints() >= 501 && c1.getCreditPoints() <= 1000)
			return new CardType(c1, "Gold");
		else if (c1.getCreditPoints() >= 1001)
			return new CardType(c1, "Platinum");
		else if (c1.getCreditPoints() < 100)
			return new CardType(c1, "Emi");
		return null;

	}
}
