public static int minAbove(BstNode root, int k){
    int min = Integer.MAX_VALUE;
    BstNode t = root;
    while(t != null){
        min = t.data >= k ? t.data : min;
        t = t.data >= k ? t.left : t.right;
    }
    return min;
}
