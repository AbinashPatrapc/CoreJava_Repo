package String.Practice;

public class Anagram {

	public static void main(String[] args) {
		String s1="care";
		String s2="race";
		char[] c1=s1.toCharArray();
		char[] c2=s2.toCharArray();
		if(s1.length()==s2.length()) {
		int flag=0;
		for(int i=0;i<c1.length;i++) {
			flag=0;
			for(int j=0;j<c2.length;j++) {
				if(c1[i]==c2[j]) {
					flag=1;
				}
			}
			if(flag!=1) {
				break;
				}
		}
		if(flag==1) {
			System.out.println("Strings are Anagram");
		}else
			System.out.println("Strings are not Anagram");

	}else
		System.out.println("String must be of same length to check Anagram or not");
	}
}
