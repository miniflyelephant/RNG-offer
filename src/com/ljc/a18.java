package com.ljc;

import com.type.ListNode;

public class a18 {
    public ListNode deleteNode(ListNode head, int val) {
        ListNode realHead=head;
        if (head.val==val){
            return head.next;
        }
        ListNode nextNode=null;
        while (head.next!=null){
            if (head.val==val){
                nextNode=head.next;
                head.next=nextNode.next;
                nextNode=null;
            }else {
                head=head.next;
            }
        }


        return realHead;
    }
}
