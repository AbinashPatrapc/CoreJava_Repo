package practice.code;

public class StringReverse {

	public static void main(String[] args) {
		String str="madam";
		String rev="";
		
		for(int i=str.length()-1;i>0;i--) {
			System.out.println(str.charAt(i));
			 rev+=str.charAt(i);
		}
		if(str.equals(rev)) {
			System.out.println("Palindrome");
		}else
			System.out.println("Not a palindrome");
		
	}

}
