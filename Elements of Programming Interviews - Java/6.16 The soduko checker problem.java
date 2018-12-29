boolean foo(int[][] arr){
    for(int i = 0; i < arr.length; i++){
        if(!checkCol(arr,i) || !checkRow(arr,i)) return false;
    for(int i = 0; i < arr.length; i+3){
        for(int k = 0; k < arr.length; k+3)
            if(!checkBlock(arr,i,k)) return false;
    }
    return true;
}

boolean checkCol(int[][] arr, int i){
    Set<Integer> set = new HashSet<>();
    for(int k = 0; k < arr[i].length; k++){
        if(set.contains(arr[i][k])) return false;
        set.add(arr[i][k]);
    }
    return true;
}

boolean checkRow(int[][] arr, int i){
    Set<Integer> set = new HashSet<>();
    for(int k = 0; k < arr[i].length; k++){
        if(set.contains(arr[k][i])) return false;
        set.add(arr[k][i]);
    }
    return true;
}

boolean checkBlock(int[][] arr, int i, int k){
    Set<Integer> set = new HashSet<>();
    for(int j = i; j < 3; j++){
        for(int l = k; l < 3; l++){
            if(set.contains(arr[i][k])) return false;
            set.add(arr[i][k]);
        }
    }
    return true;

}
