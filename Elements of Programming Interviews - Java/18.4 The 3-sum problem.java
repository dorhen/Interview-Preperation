import java.util.*;
class Triplet{
    static boolean tripletSum(int[] arr, int sum){
        Arrays.sort(arr);
        HashSet<Integer> lowerSum = new HashSet<Integer>();
        for(int i = 0; i < arr.length; i++){
            lowerSum.add(sum-arr[i]);
        }
        int high = arr.length;
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
}
