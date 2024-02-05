package String.Practice;

public class RevomeSpecialCharacter {

	public static void main(String[] args) {
	  String str="J@v@P^ro$gra*mingL@ang&uage";
	  str=str.replaceAll("[^a-zA-Z0-9]", "");
	  System.out.println(str);

	}

}
