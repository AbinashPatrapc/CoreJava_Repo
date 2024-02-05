package Helena;
/*
Longest Common Subsequence
===============================
Given two strings X and Y. find the longest common subsequence (LCS).
The LCS of two strings is a subsequence that is common to both strings.
For example, the LCS of the strings "AGGTAB" and GXTXAYB is "GTAB" 
which is a subsequence of both strings. 
 */
public class LongestCommonSubSequence {

	public static void main(String[] args) {
		String s1="AGGTAB";
		String s2="GXTXAYB";
		StringBuffer sb=new StringBuffer();
		
		for(int i=0;i<s1.length();i++ ) {
			for(int j=0;j<s2.length();j++) {
				if(s1.charAt(i)==s2.charAt(j)) {
					sb.append(s1.charAt(i));
				}
			}
		}
		System.out.println(sb.toString());
	}

}
