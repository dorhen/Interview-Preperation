public class ClosestSQ {
	public static void main(String[] arg) {
		System.out.println(closestSR(97));
	}
	public static int closestSR(int a){
	    int low = 0;
	    int high = a;
	    int mid;
	    while(low!= high){
	        mid = (high+low)/2;
	        if(mid*mid > a) high = mid - 1;
	        else if(low == high-1)high = high*high > a ? high-1 : high;
	        else if(mid*mid <= a)low = mid + 1;
	        
	    }
	    return low;
	    
	}
}
