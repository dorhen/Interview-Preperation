import java.util.*;

class Hanoi{
    
    public static void main(String[] args){
        ArrayList<Integer> toMove = new ArrayList<Integer>();
        ArrayList<Integer> target = new ArrayList<Integer>();
        ArrayList<Integer> helper = new ArrayList<Integer>();
        toMove.add(5); toMove.add(4); toMove.add(3); toMove.add(2); toMove.add(1);
        HTO(3, "toMove", "target", "helper");
        HTO(toMove.size(), toMove, target, helper);
        System.out.println(target);
    }
    
    static void HTO(int n, String s1, String s2, String s3){
        if(n>0){
            HTO(n-1, s1, s3, s2);
            System.out.format("Move disk from %s to %s."+'\n',s1,s2);
            HTO(n-1, s3, s2, s1);
        }
    }
    
    static void HTO(int n, ArrayList<Integer> s1, ArrayList<Integer> s2, ArrayList<Integer> s3){
        if(n>0){
            HTO(n-1, s1, s3, s2);
            s2.add(s1.remove(s1.size()-1));
            HTO(n-1, s3, s2, s1);
        }
    }
}
