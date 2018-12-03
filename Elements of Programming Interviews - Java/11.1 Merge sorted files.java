public class Pair{
    public Integer sourceSet;
    public Integer val;
    public Pair(int a, int b){
        sourceSet = a;
        val = b;
    }
}

import java.util.*;

class FileMerge{
    
    
    static ArrayList<Integer> merge(Queue<Integer>[] arr){
        ArrayList<Integer> toReturn = new ArrayList<>();
        PriorityQueue<Pair> merger = new PriorityQueue<>(arr.length, new Comparator<Pair>() {
            public int compare(Pair p1, Pair p2){
                return Integer.compare(p1.val,p2.val);
            }
        });
        
        for(int i = 1; i < arr.length; i++){
            Integer k = arr[i].poll();
            if(k != null) merger.add(new Pair(i,k));
        }
        while(!merger.isEmpty()){
            Pair p = merger.poll();
            toReturn.add(p.val);
            if(!arr[p.sourceSet].isEmpty()) merger.add(new Pair(arr[p.sourceSet].poll(), p.sourceSet));
        }
        
        return toReturn;
    }
}
