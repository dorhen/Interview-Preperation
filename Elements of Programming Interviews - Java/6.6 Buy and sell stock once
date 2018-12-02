import java.util.*;

class StockOnce{
    public static void main(String[] args){
        int[] arr = {310,315,275,295,260,270,290,230,255,265};
        System.out.println(maxStock(arr));
    }
    
    public static int maxStock(int[] A){
        int currMin = 0;
        int maxProfit = A[1] - A[0];
        int currProfit = 0;
        for(int i = 1; i < A.length; i++){
            currProfit = A[i] - A[currMin];
            if(currProfit > maxProfit)maxProfit = currProfit;
            if(A[i] < A[currMin]) currMin = i;
        }
        return maxProfit;
    }
}
