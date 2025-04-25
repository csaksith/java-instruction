
public class Solution {

	public static void main(String[] args) {

		int[] nums = {3,3};
		int[] result = TwoSum(nums,6);
		System.out.println("Indices: ["+result[0]+","+result[1]+"]");
	}
	public static int[] TwoSum(int nums[],int target) {
		int indices[] = new int[2];
		// loop through each number in nums array
			// for each number, check all the next numbers to see if their sum meets the target
			// if a valid pair is found, store the indices in the indices array and return it
		for (int i = 0; i<nums.length;i++) {
			for (int j = i+1; j<nums.length;j++) {
				if(nums[i]+nums[j]==target) {
					indices[0]=i;
					indices[1]=j;
				}
			}
		}
		return indices;
	}
}
