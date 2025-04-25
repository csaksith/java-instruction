
public class Solution {
	public static boolean isPalindrome(int x) {
		if (x < 0) // palindromes cannot be negative
			return false;
		int org = x;
		int reverse = 0;
		while (x > 0) {
			int lastDigit = x % 10;
			reverse = reverse * 10 + lastDigit;
			x = x / 10;
		}
		return org == reverse;
	}
	public static void main(String[] args) {
		int x = 1215;
		System.out.println("is "+x+" a palindrome? "+isPalindrome(x));
	}
}
