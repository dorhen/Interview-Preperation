public class BSTNode<T>{
    public T data;
    public BSTNode<T> left,right;
}
public class Pair{
    public int max;
    public boolean isBst;
    public Pair(int a, boolean b){
        max = a;
        isBst = b;
    }
}

import java.util.*;
import java.lang.*;
class isBst{
    static <T> boolean checkBst(BSTNode<T> root){
        Pair bst = isBstPair(root);
        return bst.isBst;
        
    }
    
    static <T> Pair isBstPair(BSTNode<T> node){
        if(node == null)return new Pair(Integer.MIN_VALUE, true);
        Pair leftBst = isBstPair(node.left);
        if(!leftBst.isBst) return leftBst;
        Pair rightBst = isBstPair(node.right);
        if(!rightBst.isBst) return rightBst;
        if(node.right == null) rightBst.max = Integer.MAX_VALUE;
        boolean b = (int)node.data <= rightBst.max && (int)node.data >= leftBst.max;
        int max = node.right == null ? Math.max(leftBst.max, (int)node.data) : Math.max(Math.max(leftBst.max, rightBst.max) , (int)node.data);
        return new Pair(max,b);
    }
}
