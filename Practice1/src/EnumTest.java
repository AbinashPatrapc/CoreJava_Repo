enum Currency

{
	RUPEE, DOLLAR, YEN, EURO
}

class EnumTest

{

	Currency curr;

	public EnumTest(Currency curr)

	{

		this.curr = curr;

	}

	public void represent()

	{

		switch (curr)

		{

		case RUPEE:

			System.out.println("Official currency of India.");

			break;

		case DOLLAR:

			System.out.println("Official currency of the US. ");

			break;

		case YEN:

			System.out.println("Official Currency of Japan.");

			break;

		case EURO:

			System.out.println("Official currency of the European Union.");

			break;

		default:

			System.out.println("Not listed! ");

			break;

		}

	}

	public static void main(String[] args) {

		EnumTest curr1 = new EnumTest(Currency.RUPEE);

		curr1.represent();

		EnumTest curr2 = new EnumTest(Currency.DOLLAR);

		curr2.represent();

		EnumTest curr3 = new EnumTest(Currency.YEN);

		curr3.represent();

		EnumTest curr4 = new EnumTest(Currency.EURO);

		curr4.represent();

	}

}