package com.ljc;

import com.type.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class a32_2 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<TreeNode>();
        List<List<Integer>> res=new ArrayList<>();
        if (root==null){
            return res;
        }
        q.offer(root);
        while (!q.isEmpty()){
            List<Integer> level=new ArrayList<>();
            int size=q.size();
            for (int i=0;i<size;i++){
                TreeNode temp=q.poll();
                level.add(temp.val);
                if (temp.left!=null){
                    q.offer(temp.left);
                }
                if (temp.right!=null){
                    q.offer(temp.right);
                }
            }

            res.add(level);

        }


        return res;
    }
}
