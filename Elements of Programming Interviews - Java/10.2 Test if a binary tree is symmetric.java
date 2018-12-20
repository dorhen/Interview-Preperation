public static boolean SymmetricBST(TreeNode t){
		TreeNode l = t.left;
		TreeNode r = t.right;
	    return Symmetric(l,r);
	}

	public static boolean Symmetric(TreeNode l, TreeNode r){
		if(l == null && r == null) return true;
	    if((l == null ^ r == null)) return false;
	    else if(l.data != r.data) return false;
	    else return Symmetric(l.left,r.right) && Symmetric(l.right,r.left);
	}
