public class Triplet{
    public int x;
    public int y;
    public int z;
    public Triplet(int x, int y, int z){
        this.x = x; this.y = y; this.z = z;
    }
}

import java.util.*;
import java.lang.*;

public static Triplet[] kStars(ArrayList<Triplet> stars, int k){
    PriorityQueue<Triplet> kstars = new PriorityQueue<Triple>(new Comparator<Triplet>(){
        public int compare(Triplet t1, Triplet t2){
            return Long.compare(computeDistance(t1), computeDistance(t2));
        }
    });
    long distance;
    for(int i = 0; i < k; i++){
        kstars.add(stars(i));
    }
    for(int i = k; i < stars.size(); i++){
        distance = computeDistance(starts.get(i));
        if(computeDistance(kstars.peek()) > distance){
            kstars.poll;
            kstars.add(stars.get(i));
        } 
    }
    
    return kstars.toArray();
}

public static long computeDistance(Triplet t){
    return Math.sqrt(t.x*t.x + t.y*t.y + t.z*t.z);
}

