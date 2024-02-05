package String.Practice;

public class CharWithOccurance {

	public static void main(String[] args) {
		String str="opentext";
		char chrplce='t';
        
        char ch[]=str.toCharArray();
        int c=1;
        for(int i=0;i<str.length();i++) {
        	if(ch[i]==chrplce) {
        		//ch[i]=String.valueOf(c).charAt(0);
        		str=str.replaceFirst(String.valueOf(chrplce),String.valueOf(c));
        		c++;
        	}
        }
        System.out.println(str);
	}

}
