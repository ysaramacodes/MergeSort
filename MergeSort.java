package heapSort;

import java.util.Arrays;

public class MergeSort {

	public static void sort(int[] data) {
		// TODO Auto-generated method stub
		//@SuppressWarnings("unchecked")
		int [] temp = new int[data.length];
		
		 mergeSort(data,temp, 0, data.length-1);
	}

	
	private static void mergeSort(int[] arr, int[] arrCopy, int low, int high) {
		if(low  < high) {
		int mid = (low + high)/2;
		mergeSort(arr,arrCopy,low,mid);
		mergeSort(arr,arrCopy,mid +1,high);
		
		// Recursively divide array to halves until 1 element
		
		
		
		merge(arr,arrCopy,low,mid,high);
		}
	}
	
	private static void merge(int[] arr, int[] arrCopy, int low, int mid, int high) {
		
		
		int left = low;
		int lastIndexLeftSubArray = mid;
		
		int right = mid +1;
		int lastIndexRightSubArray = high;
		int index = low;
		
		while(left <= lastIndexLeftSubArray && right<=lastIndexRightSubArray) {
			if(arr[left] <arr[right]) {
				arrCopy[index]=arr[left];
				left++;
			}else {
				arrCopy[index]=arr[right];
					right++;
			}
			index++;
		}
		
		
		//works when right array is empty
		while(left <= mid) {
			arrCopy[index] = arr[left];
			index++;
			left++;
				 
				
		}
		
		while(right <=high ) {
			arrCopy[index] = arr[right];
			index++;
			right++;
		}
		
		for(int i= 0; i <= high;i++) {
			arr[i]= arrCopy[i];
		}
		
		
		
	}
	public static void main(String[] args) {
        int [] data = {10, 7, 8, 9, 1, 5};
        System.out.println("Unsorted Array: " + Arrays.toString(data));
        
        sort(data);
        
        System.out.println("Sorted Array: " + Arrays.toString(data));
    }
}
