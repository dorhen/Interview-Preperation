import java.util.*;
public class Klargest {
	
	public static void main(String[] args) {
		int[] arr = {3,2,5,4,7,8,9,15,14,11};
		System.out.println(dSelect(arr,6));
	}
	
	public static int dSelect(int[] arr, int k){
	    int rand = (int)(Math.random() * arr.length);
	    int i = partition(arr,rand,0,arr.length-1);
	    while(i != k - 1){
	        if(i < k - 1) {
	            rand = (int)(i+1+Math.random()*(arr.length-i-1));
	            i = partition(arr,rand,i+1,arr.length-1);
	        }
	        else if(i > k - 1){
	            rand = (int)(Math.random() * i);
	            i = partition(arr,rand,0,i-1);
	        }
	    }
	    return arr[i];
	}
	public static int partition (int[] arr, int pivot, int start, int end){
		int low = start;
		int high = end-1;
		swap(arr, pivot, end);
		while(low < high){
			if(arr[low] < arr[end]){
				low++;
			}
			else if(arr[low] > arr[end]){
				swap(arr,low,high);
				high--;
			}
		}
		if(arr[low] < arr[end])low++;
		swap(arr,end,low);
		return low;
	}
	public static void swap(int[] arr, int i1, int i2) {
		int temp = arr[i1];
		arr[i1] = arr[i2];
		arr[i2] = temp;
	}

}
