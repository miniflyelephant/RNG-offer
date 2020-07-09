package com.ljc;

import java.util.HashMap;
import java.util.Map;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class seven {
    public class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
         TreeNode(int x) { val = x; }
    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        Map<Integer, Integer> index=new HashMap<Integer, Integer>();
        if(preorder.length==0||preorder==null){
            return null;
        }
        for(int i=0;i<inorder.length;i++){
            index.put(inorder[i],i);
        }
        TreeNode root= tr(preorder,0,preorder.length-1,inorder,0,inorder.length-1,index);
        return root;
    }

    public  TreeNode tr(int[] preorder,int prestart,int preend,int[] inorder,int instart,int inend,Map<Integer,Integer> index){
        if(prestart>preend){
            return null;
        }
        int now=index.get(preorder[prestart]);
        TreeNode root=new TreeNode(preorder[prestart]);

        int
        root.left=tr(preorder,prestart+1,prestart+now-instart,inorder,,now-1);
        root.right=tr(preorder,prestart+now+1,);



    }

}
