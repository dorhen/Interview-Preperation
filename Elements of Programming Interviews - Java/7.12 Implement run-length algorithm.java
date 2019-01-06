public static String runLengthEncode(String s) {
    	String ans = "";
    	int counter = 1;
    	for(int i = 1; i < s.length(); i++){
    		if(s.charAt(i) == s.charAt(i-1))counter++;
    		else {
    			ans = ans + counter + s.charAt(i-1);
    			counter = 1;
    		}
    	}
    	ans = ans + counter + s.charAt(s.length()-1);
    	return ans;
}
public static void deleteDuplicates(Integer[] arr) {
    	for(int i = 0; i < arr.length-2; i++) {
    		if(arr[i] == arr[i+1]) arr[i+1] = arr[i+2];
    		if(arr[i] == null) swap(arr, i, i+1);
    	}
}
