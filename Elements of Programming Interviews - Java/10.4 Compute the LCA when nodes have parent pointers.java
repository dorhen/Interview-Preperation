public static BinaryNode<T> lca(BinaryNode<T> a, BinaryNode<T> b){
    int h1 = 0;
    int h2 = 0;
    BinaryNode<T> temp = a;
    while(temp.parent != null){
        h1++;
        temp = temp.parent;
    }
    temp = b;
    while(temp.parent != null){
        h2++;
        temp = temp.parent;
    }
    int diff = Math.abs(h1-h2);
    while(diff-- > 0){
        if(h1 > h2) a = a.parent;
        if(h2 > h1) b = b.parent;
    }
    while(a != null && b != null){
        if(a == b)return a;
        a = a.parent; b = b.parent;
    }
}
