package offer;

import java.util.ArrayList;
import java.util.Collections;


public class demo3 {
    /**输入一个链表，按链表值从尾到头的顺序返回一个ArrayList。*/
    public static void main(String[] args) {

    }

    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> list = new ArrayList<>();
        //反转链表
        ListNode pre = null;
        ListNode next = null;
        while (listNode!=null){
            next = listNode.next;
            listNode.next = pre;
            pre = listNode;
            listNode = next;
        }
        while (listNode.next!=null){
            list.add(listNode.val);
            listNode.next=listNode;
        }
        return list;
    }
     public class ListNode {
         int val;
         ListNode next = null;
         ListNode(int val) {
             this.val = val;
         }
     }
}
