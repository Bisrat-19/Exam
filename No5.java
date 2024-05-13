package Exam;

import java.util.Arrays;

public class No5 {

	static void mergeSort(int[] NUMs) {
		int inputLength = NUMs.length;
		if(inputLength <= 1) {
			return;
		}
		int midIndex = inputLength / 2;
		int[] leftHalf = new int[midIndex];
		int[] rightHalf = new int[inputLength - midIndex];
		
		for(int i = 0, j=0; i < inputLength; i++) {
			if(i < midIndex ) {
				leftHalf[i] = NUMs[i];
			}else {
				rightHalf[j++] = NUMs[i];
			}
		}
		mergeSort(leftHalf);
		mergeSort(rightHalf);
		merge(NUMs, leftHalf, rightHalf);
	}
    static void merge(int[] NUMs, int[] leftHalf, int[] rightHalf) {
		int leftSize = NUMs.length / 2;
		int rightSize = NUMs.length - leftSize;
		int i = 0,j = 0,k = 0;
		while(i < leftSize && j < rightSize) {
			if(leftHalf[i] <= rightHalf[j]) {
				NUMs[k++] = leftHalf[i++];
			}else {
				NUMs[k++] = rightHalf[j++];
			}
		}
		while(i < leftSize) {
			NUMs[k++] = leftHalf[i++];
		}
		while(j < rightSize) {
			NUMs[k++] = rightHalf[j++];
		}
	}

	public static void main(String[] args) {
		
		int[] NUMs = {1,2,4,5,6,32,2};
		mergeSort(NUMs);
        System.out.println(Arrays.toString(NUMs));


	}

}

	
