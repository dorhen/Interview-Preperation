/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner reader = new Scanner(System.in);
		int num = reader.nextInt();
		String s;
		for(int i = 0; i < num; i++){
		    s = reader.nextLine();
		    String[] arr = s.split(" ");
		    int sum = Integer.parseInt(arr[2]);
		    s = reader.nextLine();
		    arr = s.split(" ");
		    int[] arr1 = new int[arr.length];
		    for(int j = 0; j < arr1.length; j++)
		        arr1[j] = Integer.parseInt(arr[j]);
		    s = reader.nextLine();
		    arr = s.split(" ");
		    int[] arr2 = new int[arr.length];
		    for(int j = 0; j < arr2.length; j++)
		        arr2[j] = Integer.parseInt(arr[j]);
		    System.out.println(Pairs(arr1,arr2,num));
		}
	}
	
	public static String Pairs(int[] arr, int[] arr2, int k){
	    Set<Integer> exs1 = new HashSet<>();
	    String ans = "";
	    int i = 0;
	    for(i = 0; i < arr.length && i < arr2.length; i++){
	        if(exs1.contains(k - arr[i]))
	           ans += arr[i] + " " + (k-arr[i]) + ", ";
	       if(exs1.contains(k - arr2[i]))
	           ans += arr2[i] + " " + (k-arr2[i]) + ", ";
	        exs1.add(arr[i]);
	        exs1.add(arr2[i]);
	    }
	    for(i = i; i < arr.length; i++){
	        if(exs1.contains(k - arr[i]))
	           ans += arr[i] + " " + (k-arr[i]) + ", ";
	        exs1.add(arr[i]);
	    }
	    for(i = i; i < arr2.length; i++){
	        if(exs1.contains(k - arr2[i]))
	           ans += arr2[i] + " " + (k-arr2[i]) + ", ";
	        exs1.add(arr2[i]);
	    }
	    if(ans != ""){
	        ans = ans.substring(0,ans.length()-2);
	        return ans;
	    }
	    return "-1";
	}
}
