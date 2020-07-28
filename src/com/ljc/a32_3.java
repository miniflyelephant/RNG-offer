package com.ljc;

import com.type.TreeNode;

import java.util.*;

public class a32_3 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<TreeNode>();
        List<List<Integer>> res=new ArrayList<>();
        Stack<TreeNode> st=new Stack<TreeNode>();
        int jo=0;
        if (root==null){
            return res;
        }
        q.offer(root);
        while (!q.isEmpty()||!st.isEmpty()){
            List<Integer> level=new ArrayList<Integer>();
            TreeNode temp;
            if (jo%2==0){
                int size=q.size();
                temp=q.poll();
                level.add(temp.val);
                for (int i=0;i<size;i++){
                    if (temp.left!=null){
                        st.push(temp.left);
                    }
                    if (temp.right!=null){
                        st.push(temp.right);
                    }
                }
            }else {
                int size=st.size();
                temp=st.pop();
                level.add(temp.val);
                for (int i=0;i<size;i++){
                    if (temp.left!=null){
                        q.offer(temp.left);
                    }
                    if (temp.right!=null){
                        q.offer(temp.right);
                    }
                }
            }
            res.add(level);
        }
        return res;
    }
}
