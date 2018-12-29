int minInCycle(int[] arr){
    int high = arr.length-1;
    int low = 0;
    while(high != low){
        int mid = low + (high-low)/2;
        if(arr[mid] > arr[high]) low = mid+1;
        else if(arr[mid] < arr[low]) high = mid;
        else high = mid;
    }
    return arr[low];
}
