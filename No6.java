package Exam;
import java.util.Scanner;
import java.util.Arrays;

public class No6 {
	public int[] deleteElement(int[] arr, int indexToDelete ) {
		int[] newArr = new int[arr.length - 1];
		
		for (int i = 0, k = 0; i < arr.length; i++) {
			if (i != indexToDelete) {
				newArr[k++] = arr[i];}
		}
		return newArr;
		
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the size of the array: ");
	    int size = scanner.nextInt();

	    int[] arr = new int[size];

	    for (int i = 0; i < size; i++) {
	    	System.out.print("Enter " +(i+1)+" elements of the array:");
	        arr[i] = scanner.nextInt();
        }
	    System.out.println();
	    
	    System.out.print("Enter index to oDelete: ");
	    int indexToDelete = scanner.nextInt();
	    if(true) {
	    	while(indexToDelete < 0 && indexToDelete >= size ) {
	    		No6 CC = new No6();
	    		int newArr[] = CC.deleteElement(arr, indexToDelete);
			
	    		System.out.println(Arrays.toString(newArr));
	    	}
	    	System.out.println("Invalid index");
	    }
	}

}
