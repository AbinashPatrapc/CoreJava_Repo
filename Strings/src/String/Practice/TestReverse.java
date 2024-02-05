package String.Practice;

public class TestReverse {

	public static void main(String[] args) {
		String s1="Hello Everyone";
		char ch[]=s1.toCharArray();
		StringBuilder sb=new StringBuilder();
		for(int i=s1.length()-1,j=0;i>=0;i--,j++) {
			sb.append(ch[i]);
		  }
		  System.out.println(sb.toString());
	}

}
