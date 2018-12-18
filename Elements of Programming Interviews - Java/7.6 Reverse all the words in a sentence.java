public static void reverse(char[] arr){
		reverseWithRange(arr,0,arr.length-1);
	    int low = 0;
	    for(int i = 0; i < arr.length ; i++){
	        if(arr[i] == ' '){
	        	reverseWithRange(arr,low,i-1);
	            low = i+1;
	        }
	    }
	  
	}

	public static void reverseWithRange(char[] arr, int low, int high){
	    while(low < high){
	        char temp = arr[low];
	        arr[low++] = arr[high];
	        arr[high--] = temp;
	    }
	}
