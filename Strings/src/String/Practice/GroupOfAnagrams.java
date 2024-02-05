package String.Practice;

public class GroupOfAnagrams {// Not Done Yet

	public static void main(String[] args) {
		int flag=0;	String[] str2=new String[10];
		String[] str = { "eat", "tea", "tan", "ate", "nat", "bat" };
		for (int i = 0; i < str.length; i++) {
			char[] c1 = str[i].toCharArray();//eat
			
			for (int j = i + 1; j < str.length; j++) {
				char[] c2 = str[j].toCharArray();//tea
				
				for(int k=0;k<c1.length;k++) {
					flag=0;
					for(int p=k+1;p<c2.length;p++) {
						if(c1[k]==c2[p]) {
							flag=1;
						}
					}
				}
				if(flag==1) {
					str2[i]=str[i];
					str2[i+1]=str[j];
				}else
					str2[i]=str[i];
			}

		}

		
		for(int i=0;i<str2.length;i++)
	           System.out.println(str2[i]);	
	}

}
