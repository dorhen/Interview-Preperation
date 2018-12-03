class BinaryTwist{
    
    static int firstOcc(int[] A, int k){
        int occ = -1;
        int low = 0, high = A.length-1;
        while(high >= low){
            int mid = low + (high-low)/2;
            if(A[mid] < k) low = mid + 1;
            else if(A[mid] > k)high = mid - 1;
            else{
                occ = mid;
                high = mid;
            }
        }
        return occ;
    }
}
