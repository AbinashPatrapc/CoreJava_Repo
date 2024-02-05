package Hacker.solution;

public class TimeConversion {
	    public static String timeConversion(String s) {
	   
	        int hh = (10 * (s.charAt(0) - '0')) + (s.charAt(1) - '0');
	        System.out.println(hh);
	        if(s.charAt(8) == 'P' && hh < 12){
	            hh += 12;
	        }
	        else if(s.charAt(8) == 'A' && hh == 12){
	            hh = 0;
	        }
	        return "" + (hh / 10) + (hh % 10) + s.substring(2, 8);
	    }
	   
	public static void main(String[] args) {
	System.out.println(timeConversion("08:05:45PM"));

	}

}
