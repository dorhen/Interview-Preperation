import java.util.Arrays;

public class CharacterSwap {

	public static void main (String[] args) {
		Character[] arr = {'a' ,'c', 'a', 'a', 'b', 'l', 'm', 'a', 'b', 'a', null, null, null};
		cSwap(arr, 10);
		printArray(arr);
	}
	
	static void cSwap(Character[] arr, int size){
	    int j = arr.length-1;
	    for (int i = 0; i < size; i++){
	        if(arr[i]=='b') arr[i] = null;
	    }
	    for (int i = size-1; i >= 0; i--){
	        if(arr[i] == null)continue;
	        arr[j--] = arr[i];
	        arr[i] = j+1 == i ? arr[i] : null;
	    }
	    j++;
	    int i = 0;
	    for(int k = j; k < arr.length; k++){
	        if(arr[k] == 'a'){
	            arr[i++] = 'd';
	            arr[i++] = 'd';
	        }
	        else {
	            arr[i++] = arr[k];
	        }
	    }
	}
	
	static void printArray(Object[] arr) {
		for(int i = 0; i < arr.length ; i++) {
			System.out.print(arr[i].toString() + " ");
		}
	}
}
