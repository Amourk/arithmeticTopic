package offer;

public class demo13 {
    public static void main(String[] args) {
        int i =0;
        for (;i<5;i++){

        }
        System.out.println("aaaa"+i);
    }
    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    /**输入一个链表，输出该链表中倒数第k个结点。*/
//    public ListNode FindKthToTail(ListNode head,int k) {
//        int i = 0;
//        while (head.next!=null){
//            i++;
//        }
//        for (int j = 0; j <i-k+1 ; j++) {
//            head = head.next;
//        }
//        return head;
//    }

    public ListNode FindKthToTail(ListNode head,int k) { //5,{1,2,3,4,5}
        ListNode p, q;
        p = q = head;
        int i = 0;
        for (; p != null; i++) {
            if (i >= k)
                q = q.next;
            p = p.next;
        }
        return i < k ? null : q;
    }
}
