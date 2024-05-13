package Exam;
import java.util.Scanner;
public class No1 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
			
		System.out.print("Enter the size of the array: ");
	    int size = scanner.nextInt();

	    int[] nums = new int[size];

	    
	    for (int i = 0; i < size; i++) {
	    	System.out.print("Enter " +(i+1)+" elements of the array:");
	        nums[i] = scanner.nextInt();
        }

        System.out.print("Enter the number to be searched: ");
    	int SN = scanner.nextInt();
		        

        int count = 0;
        for (int i : nums) {
            if (i == SN) {
                count++;
            }
        }

        if (count > 0) {
	            System.out.println(SN + " is present in the array " + count + " time(s).");
        } else {
	            System.out.println(SN + " is not present in the array.");
        }
    }
}


	
