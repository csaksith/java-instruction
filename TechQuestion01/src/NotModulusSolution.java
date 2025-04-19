
public class NotModulusSolution {

	public static void main(String[] args) {
	int [] testCases = {23, 128, 101, 36, 12, 456};
		
		for (int n : testCases) {
            System.out.println("isDivisible(" + n + ") = " + isDivisibleBy(n));
        }
	}
	
	public static Boolean isDivisibleBy(int num) {
		String numStr = Integer.toString(num);
		
		for (char digit : numStr.toCharArray()) {
			int digitInt = Character.getNumericValue(digit);
	System.out.println("digitInt: " + digitInt);
			if (digitInt == 0 || num % digitInt != 0) {
				return false;
			}
		}
		return true;	
		
	}
 