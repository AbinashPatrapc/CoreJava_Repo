package Helena;

/*You are given an array of prices where prices [i] is the price of a given stock on the i thday
You want to maximize your profit by choosing a single day to buy one stock and choosing a 
different day in the future to sell that stock
Return the maximum profit you can achieve from this transaction
 if you cannot achieve any profit, return 0.
 
 Example:1
 input price=[7,1,5,3,6,4]
 output: profit =5
 Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.

Note that buying on day2 and selling on day is not allowed because you must buy before you sell
Example:2
Input: prices = [7.6.4.3.1]

Output: 0

Explanation: In this case, no transactions are done and the max profit = 0.
*/
public class BestTimeToBuyStock {

	public static void main(String[] args) {
		int arr[]=new int[] {7,1,5,3,6,4};
		int sp=arr[0];
		int sellP=0;
		
		for(int i=0;i<arr.length;i++) {
			if(sp>arr[i]) {
				sp=arr[i];
				sellP=i;
			}
		}
		int buy=sp;
		for(int i=sellP;i<arr.length;i++) {
			if(sp<arr[i]) {
				sp=arr[i];
			}
		}
		System.out.println("Profit is: "+(sp-buy));
	}

}
