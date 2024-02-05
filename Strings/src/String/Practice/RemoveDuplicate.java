package String.Practice;

public class RemoveDuplicate {

	public static void main(String[] args) {
		// Approach-1
		String str = "Hello Buddy";
		StringBuilder sb = new StringBuilder();
		str.chars().distinct().forEach(c -> sb.append((char) c));
		System.out.println(sb.toString());

		// Approach-2
		char ch[] = str.toCharArray();
		StringBuffer sb1 = new StringBuffer();
		for (int i = 0; i < str.length(); i++) {
			int count = 1;
			for (int j = i + 1; j < str.length(); j++) {
				if (ch[i] == ch[j])
					count++;
			}
			if (count == 1)
				sb1.append(ch[i]);
		}
		System.out.println(sb1);
		
		//Approach-3
		StringBuilder sb2=new StringBuilder();
		for(int i=0;i<str.length();i++) {
			char ch1=str.charAt(i);
			int value=str.indexOf(ch1,i+1);
			if(value==-1)
				sb2.append(ch[i]);
		}
		System.out.println(sb2);
		
		
	}

}
