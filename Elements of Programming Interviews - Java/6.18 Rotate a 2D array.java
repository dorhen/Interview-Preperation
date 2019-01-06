public static void rotateAC(int[][] arr){
 	   int temp1 = 0;
 	   int temp2 = 0;
 	   for(int i = 0; i < arr.length/2 ; i++){
 	       for(int j = i; j < arr.length-1-i; j++){
 	           temp1 = arr[i][j];
 	           arr[i][j] = arr[arr.length-j-1][i];
 	           temp2 = arr[j][arr.length-i-1];
 	           arr[j][arr.length-i-1] = temp1;
 	           temp1 = arr[arr.length-i-1][arr.length-j-1];
 	           arr[arr.length-i-1][arr.length-j-1] = temp2;
 	           arr[arr.length-j-1][i] = temp1;
 	       }   
 	   }
 	}
