import java.util.*;


class Partition{
    public static void main(String[] args){
        int[] arr = {0,6,7,2,5,7,1,2,5,6,5,10};
        System.out.println(Arrays.toString(arr));
        partition(arr,4);
        System.out.println(Arrays.toString(arr));
    }
    
    public static void swap(int[] A, int a, int b){
        int temp = A[a];
        A[a] = A[b];
        A[b] = temp;
    }
    
    public static void partition(int[] A, int index){
        int val = A[index];
        int low = 0;
        int high = A.length - 2;
        swap(A,index,A.length-1);
        while(low < high){
            if(A[low] < val) low++;
            else{
                swap(A,high,low);
                high--;
            }
        }
        if(A[low] < val){
            low++;
            swap(A,low,A.length-1);
        }
        else
            swap(A,low,A.length-1);
        low++;
        high = A.length-1;
        while(low < high){
            if(A[low] == val) low++;
            else{
                swap(A,high,low);
                high--;
            }
        }
    }
}
