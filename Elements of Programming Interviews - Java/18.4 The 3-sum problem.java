
import java.util.*;
class Triplet{
    public static void main(String[] args){
        int[] arr = {-5,2};
        System.out.println(tripletSum2(arr,-7));
    }
    //O(nlogn) runtime, O(n) memory. (Assuming Arrays.sort has O(nlogn) runtime complexity)
    static boolean tripletSum(int[] arr, int sum){
        Arrays.sort(arr);
        HashSet<Integer> lowerSum = new HashSet<Integer>();
        for(int i = 0; i < arr.length; i++){
            lowerSum.add(sum-arr[i]);
        }
        int high = arr.length - 1;
        int low = 0;
        while(low <= high){
            if(lowerSum.contains(arr[low] + arr[high])) return true;
            else if(2*arr[low] + arr[high] < sum) low++;
            else{
                high--;
            }
        }
        return false;
    }
    
    //O(n^2) runtime, O(1) memory.
    static boolean tripletSum2(int[] arr, int sum){
        Arrays.sort(arr);
        int curr = 0;
        while(curr < arr.length){
            int low = curr;
            int high = arr.length-1;
            while(low <= high){
                if(arr[curr] + arr[low] + arr[high] == sum) return true;
                else if(arr[curr] + arr[low] + arr[high] < sum) low++;
                else{
                    high--;
                }
            }
            curr++;
        }
        return false;
    }
}
