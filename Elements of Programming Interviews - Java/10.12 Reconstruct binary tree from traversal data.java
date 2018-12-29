TreeNode<T> reConstruct(String inorder, String preorder){
    if (inorder.isEmpty()) return null;
    char root = preorder.charAt(0);
    preorder = preorder.substring(1,preorder.length());
    TreeNode<T> root = new TreeNode<>(root);
    String left = "";
    int i = 0;
    while(inorder.charAt(i) != root)
        left += inorder.charAt(i++);
    TreeNode<T> left = reConstruct(left, preorder);
    String right = "";
    i = inorder.indexOf(root);
    while(i != inorder.length())
        right += inorder.charAt(i++);
    TreeNode<T> right = reConstruct(right, preorder);
    root.left = left;
    root.right = right;
    return root;
}
