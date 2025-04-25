
public class Solution {

	public static void main(String[] args) {
		int [] testCases = {23, 128, 101, 36, 12, 456};
		
		for (int n : testCases) {
            System.out.println("isDivisible(" + n + ") = " + isDivisible(n));
        }
		
		
		
	}
	
	// method to check if number is divisible by themselves
		public static boolean isDivisible (int num) {
			int org = num;
			while (num>0) {
				// get last digit
				int digit = num % 10;
				
				// check if digit is 0 or isn't divisible by original 
				if (digit == 0 || org % digit != 0) {
					return false;
				}
				
				// remove last digit until 0
				num = num / 10;
			}
			
			return true;
		}

}
