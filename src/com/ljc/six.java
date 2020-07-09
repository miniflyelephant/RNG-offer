package com.ljc;

import java.util.Stack;

public class six {

      public class ListNode {
          int val;
          ListNode next;
          ListNode(int x) { val = x; }
      }

    public int[] reversePrint(ListNode head) {
          int i=0;
          int []a=new int[]{0};
          int j=0;
        Stack<ListNode> s1=new Stack<ListNode>();
        while (head!=null){
            s1.push(head);
            head=head.next;
            i++;
        }
        while (!s1.empty()){
           a[j]=s1.pop().val;
           j++;
        }
        return a;
    }
}
