public static ArrayList<Integer> kLargest(BstNode root, int k){
    ArrayList<Integer> toReturn = new ArrayList<Integer>();
    Integer c = k;
    findKLargest(root,toReturn,c);
    return toReturn;
}

public static void findKLargest(BstNode root, ArrayList<Integer> lst, Integer c){
    if(c == 0) return;
    if(root.right != null) findKLargest(root.right,toReturn,c);
    lst.add(root.data);
    c--;
    if(root.left != null) findKLargest(root.left,lst,c);
}
