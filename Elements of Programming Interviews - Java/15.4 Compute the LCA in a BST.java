TreeNode<Integer> LCAinBST(TreeNode<Integer> root, TreeNode<Integer> first, TreeNode<Integer> second)
{
    int min = Math.min(first.data,second.data);
    int max = Math.max(first.data, second.data);
    return lca(root,min,max);
}

TreeNode<Integer> lca(TreeNode<Integer> root, int min, int max){
     int i = Satisfies(min,max,root.data);
     if(i == 0) return root;
     else if(i == 1) return lca(root.left,min,max);
     else return lca(root.right,min,max);
}


int Satisfies(int min, int max, int curr){
    if(min <= curr && max >= curr) return 0;
    if(min <= curr && max <= curr) return 1;
    else return -1;
}
