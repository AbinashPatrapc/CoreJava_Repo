package String.Practice;

public class PrintDuplicateElementonly {
	public static void main(String[] args) {
   String str="stackappps";
   int count=0;
   char[] ch=str.toCharArray();
   for(int i=0;i<str.length();i++) {
	   count=1;
	   for(int j=i+1;j<str.length();j++) {
		   if(ch[i]==ch[j]) {
			   count++;
			   ch[j]='*';
		   }
	   }
	   if(count>1&&ch[i]!='*') {
		   System.out.println(ch[i]+" is repeated "+count+" times");
	   }
   }
	}
}
