import java.util.*;
public class Pair{
    public TreeNode first;
    public int second;
    public Pair(TreeNode t, int i){
        first = t;
        second = i;
    }
}

class TreeBfs{   
	
	public static void main(String[] args) {
		TreeNode t1 = new TreeNode(50);
		TreeNode t2 = new TreeNode(6);
		TreeNode t3 = new TreeNode(7);
		TreeNode t4 = new TreeNode(5);
		TreeNode t5 = new TreeNode(4);
		TreeNode t6 = new TreeNode(10);
		TreeNode t7 = new TreeNode(3);
		TreeNode t8 = new TreeNode(8);
		t1.left = t2;
		t1.right = t3;
		t2.right = t4;
		t4.left = t5;
		t5.right = t6;
		t3.left = t7;
		t3.right = t8;
		
		ArrayList<ArrayList<Integer>> arr = treeBfs(t1);
		System.out.println(arr);
	}
	
    static ArrayList<ArrayList<Integer>> treeBfs(TreeNode root){

        Queue<Pair> q = new LinkedList<Pair>();
        ArrayList<ArrayList<Integer>> toReturn = new ArrayList<ArrayList<Integer>>();
        q.add(new Pair(root,0));
        ArrayList<Integer> lvl = new ArrayList<Integer>();
        while(!q.isEmpty()){
            Pair p = q.poll();
            TreeNode t = p.first;
            if(t.left!=null) q.add(new Pair(t.left, p.second+1));  
            if(t.right!=null) q.add(new Pair(t.right, p.second+1));
            lvl.add(t.data);
            if(q.isEmpty() || p.second != q.peek().second){
              toReturn.add(lvl);
              lvl = new ArrayList<Integer>();
            } 
        }
        return toReturn;
    }
    
}
