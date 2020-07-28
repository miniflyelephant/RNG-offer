package com.day;

import com.type.TreeNode;

public class d104 {
    public int maxDepth(TreeNode root) {
        int deep=0;
        deep=deepLength(root,deep);
        return deep;
    }

    public int deepLength(TreeNode root,int deep){
        if (root.right==null&&root.left==null){
            return 1;
        }
        int left=0;
        int right=0;
        left=deep+deepLength(root.left,deep);
        right=deep+deepLength(root.right,deep);
        if (left>right){
            return left;
        }else {
            return right;
        }
    }

}
