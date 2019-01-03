ArrayList<Integer> trapedPair(int[] arr){
        ArrayList<Integer> toreturn = new ArrayList<>();
        int high = arr.length - 1;
        int low = 0;
        int max = 0, curr = 0;
        while(low < high){
            curr = (high - low)*Math.min(arr[low],arr[high]);
            if(curr > max){
                toreturn.clear();
                toreturn.add(low);
                toreturn.add(high);
                max = curr;
            }
            if(arr[low] > arr[high]) high--;
            else if(arr[low] < arr[high]) low++;
            else{
                high--; low++;
            }
        }
        return toreturn;
}
