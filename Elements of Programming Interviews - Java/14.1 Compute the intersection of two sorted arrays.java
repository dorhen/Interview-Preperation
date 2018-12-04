import java.util.*;

public class ArraysIntersection{
    public static void main (String[] args){
        int[] arr1 = {1,3,7,7,9,20};
        int[] arr2 = {7,7,7,9,10,11,12,20};
        System.out.println(intersection(arr1,arr2));
    }
    
    
    static ArrayList<Integer> intersection(int[] A, int[] B){
        int aInd = 0;
        int bInd = 0;
        ArrayList<Integer> toReturn = new ArrayList<Integer>();
        while(aInd < A.length && bInd < B.length){
            if(A[aInd] == B[bInd]){
                if(toReturn.isEmpty() || toReturn.get(toReturn.size()-1) != A[aInd]) toReturn.add(A[aInd]);
                aInd++;
                bInd++;
            }
            else if(A[aInd] < B[bInd]) aInd++;
            else {
                bInd++;
            }
        }
        return toReturn;
    }
}
