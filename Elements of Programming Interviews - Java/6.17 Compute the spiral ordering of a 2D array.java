import java.util.*;

public class SpiralOrdering {
	
	public static void main(String[] args) {
		Integer[][] arr = {{7,3,5,9}, {1,2,5,10}, {3,7,7,4}, {5,6,2,20}};
		List<Integer> lst = (List<Integer>)spiralArray(arr);
		System.out.println(lst.toString());
	}
	
	static <T> List<T> spiralArray(T[][] arr){
	    int[] bounderies = {arr.length , arr.length , -1 ,-1};
	    List<T> spiralOrdering = new LinkedList<T>();
	    Pair curr = new Pair(0,0);
	    spiralOrdering.add(arr[0][0]);
	    while(true){
	        if(!moveRight(arr,bounderies,spiralOrdering,curr)) break;
	        if(!moveDown(arr,bounderies,spiralOrdering,curr)) break;
	        if(!moveLeft(arr,bounderies,spiralOrdering,curr)) break;
	        if(!moveUp(arr,bounderies,spiralOrdering,curr)) break;
	    }
	    return spiralOrdering;
	}

	static <T> boolean moveRight(T[][] arr, int[] bounderies, List<T> list, Pair p){
	    if(p.second >= bounderies[0] - 1) return false;
	    bounderies[3]++;
	    p.second++;
	    while(p.second < bounderies[0]){
	        list.add(arr[p.first][p.second]);
	        p.second++;
	    }
	    p.second--;
	    return true;
	}
	static <T> boolean moveDown(T[][] arr, int[] bounderies, List<T> list, Pair p){
	    if(p.first >= bounderies[1] - 1) return false;
	    bounderies[0]--;
	    p.first++;
	    while(p.first < bounderies[1]){
	        list.add(arr[p.first][p.second]);
	        p.first++;
	    }
	    p.first--;
	    return true;
	}
	static <T>  boolean moveLeft(T[][] arr, int[] bounderies, List<T> list, Pair p){
	    if(p.second <= bounderies[2]) return false;
	    bounderies[1]--;
	    p.second--;
	    while(p.second > bounderies[2]){
	        list.add(arr[p.first][p.second]);
	        p.second--;
	    }
	    p.second++;
	    return true;
	}
	static <T> boolean moveUp(T[][] arr, int[] bounderies, List<T> list, Pair p){
	    if(p.first <= bounderies[3]) return false;
	    bounderies[2]++;
	    p.first--;
	    while(p.first > bounderies[3]){
	        list.add(arr[p.first][p.second]);
	        p.first--;
	    }
	    p.first++;
	    return true;
	}
}
