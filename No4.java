package Exam;

public class No4 {
	static int[] No4(int[] nums) {
		for(int i = nums.length - 1; i >= 0; i--) {
			for(int j = 0; j < i; j++) {
				if(nums[j] > nums[j + 1]) {
					int temp = nums[j];
					nums[j] = nums[j + 1];
					nums[j + 1] = temp;}
			 }
		}
		return nums ; 
	}
			
	public static void main(String[] args) {
		int[] nums = {55,6,32,78,2,1};
		No4(nums);
			
		for (int k=0; k < nums.length; k++) {
			System.out.print(nums[k] + ", ");
		}
	}
}


