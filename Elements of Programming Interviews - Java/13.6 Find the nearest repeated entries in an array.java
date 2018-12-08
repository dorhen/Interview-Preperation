import java.util.*;
public class MinDistance {
	
	public static void main(String[] args) {
		String[] arr = {"All", "work", "and", "no", "play", "makes", "for", "no", "work", "no", "fun", "and", "no", "result"};
		System.out.println(distance(arr));
	}
	
	public static int distance(String[] arr){
	    Map<String,Integer> lastSeen = new HashMap<String,Integer>();
	    int minDistance = -1;
	    for(int i = 0; i < arr.length; i++){
	        Integer ind = lastSeen.get(arr[i]);
	        if(ind == null) lastSeen.put(arr[i],i);
	        else {
	            minDistance = minDistance == -1 ? i-ind : Math.min(minDistance,i-ind);
	            lastSeen.put(arr[i],i);
	        }
	    }
	    return minDistance;
	}
}
