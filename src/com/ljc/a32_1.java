package com.ljc;

import com.type.TreeNode;

import java.util.*;

public class a32_1 {
    public int[] levelOrder(TreeNode root) {
        List<Integer> list=new ArrayList<Integer>();
        int[] a=new int[0];
        if (root==null){
            return a;
        }
        Queue<TreeNode> q=new LinkedList<TreeNode>();
        q.offer(root);
        int j=0;
        while (!q.isEmpty()){
            int size=q.size();
            for (int i=0;i<size;i++){
                TreeNode b=q.poll();
                list.add(b.val);
                j++;
                if (b.left!=null){
                    q.offer(b.left);
                }
                if (b.right!=null){
                    q.offer(b.right);
                }
            }
        }
        int[] b=new int[j+1];
        for (int i=0;i<=j;i++){
            b[i]=list.get(i);
        }
        return b;
    }
}
