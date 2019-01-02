import java.util.ArrayList;
import java.util.List;

class TwoThreadWaitNotify {
    private int start = 1;

    private boolean flag = false;

    public static void main(String[] args) {
//        ListNode a = new ListNode(1);
//        ListNode b = new ListNode(2);
//        ListNode c = new ListNode(3);
//        ListNode d = new ListNode(4);
//        ListNode e = new ListNode(5);
//        a.next = b;
//        b.next = c;
//        c.next = d;
//        d.next = e;
//        new Solution().ReverseList(a);
//        while (e != null) {
//            System.out.println(e.val);
//            e = e.next;
//        }
//        int nums[] = {1,2,3,4,5,6,7,9,10};
//        search(nums,13);
//        mySqrt(2147395599);
//        coin(11);

//
//        TwoThreadWaitNotify twoThread = new TwoThreadWaitNotify();
//
//        Thread t1 = new Thread(new OuNum(twoThread));
//        t1.setName("A");
//
//
//        Thread t2 = new Thread(new JiNum(twoThread));
//        t2.setName("B");
//
//        t1.start();
//        t2.start();
//        String json = "{\"customerCode\":20012}";
//        String str[] ={"aca","cba"};
//        longestCommonPrefix(str);
        int str[] = {7 ,1, 5, 6, 3};
        maxProfitNew(str);


    }
    public static class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
    public static class Solution {

        public ListNode ReverseList(ListNode head) {

            ListNode next = null;
            ListNode pre = null;

            while (head != null) {
                // 保存要反转到头的那个节点
                next = head.next;
                // 要反转的那个节点指向已经反转的上一个节点(备注:第一次反转的时候会指向null)
                head.next = pre;
                // 上一个已经反转到头部的节点
                pre = head;
                // 一直向链表尾走
                head = next;
            }
            return pre;
        }
    }
    public static int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        while(left<=right){
            int mid = (left+right)/2;
            if(nums[mid]==target){
                return mid;
            }
            if(nums[mid]<target){
                left = mid+1;
            }else{
                right = mid-1;
            }
        }
        return -1;
    }
    public static int mySqrt(int x) {
        if(x<=1){
            return x;
        }
        int left = 0;
        int right = x;
        int anr = 0;
        while(left<=right){
            int mid = (left+right)/2;
            if((long)mid*mid<=(long)x){
                anr = mid;
                left = mid+1;
            }else{
                right = mid-1;
            }
        }
        return anr;
    }

    /**
    * 1  2x+1
    * 2  2x+2
     *
     * 10
     * 122
    */
    public static int coin(int num){
        List key = new ArrayList();
        StringBuilder sb = new StringBuilder();
        sb.reverse();
        while (num>2) {
            if (num % 2 == 0) {
                num = (num - 2) / 2;
                key.add(2);
            } else {
                num = (num - 1) / 2;
                key.add(1);
            }
        }
        if (num==1){
            key.add(1);
        }
        if (num==2){
            key.add(2);
        }
        for (int i = 0; i <key.size() ; i++) {
            System.out.println(key.get(i));
        }
        return 0;
    }
    /**
     * 1354 */
    /**
     * 偶数线程
     */
    public static class OuNum implements Runnable {
        private TwoThreadWaitNotify number;

        public OuNum(TwoThreadWaitNotify number) {
            this.number = number;
        }

        @Override
        public void run() {

            while (number.start <= 100) {
                synchronized (TwoThreadWaitNotify.class) {
                    System.out.println("偶数线程抢到锁了");
                    if (number.flag) {
                        System.out.println(Thread.currentThread().getName() + "+-+偶数" + number.start);
                        number.start++;

                        number.flag = false;
                        TwoThreadWaitNotify.class.notify();

                    }else {
                        try {
                            TwoThreadWaitNotify.class.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }

            }
        }
    }
    /**
     * 奇数线程
     */
    public static class JiNum implements Runnable {
        private TwoThreadWaitNotify number;

        public JiNum(TwoThreadWaitNotify number) {
            this.number = number;
        }

        @Override
        public void run() {
            while (number.start <= 100) {
                synchronized (TwoThreadWaitNotify.class) {
                    System.out.println("奇数线程抢到锁了");
                    if (!number.flag) {
                        System.out.println(Thread.currentThread().getName() + "+-+奇数" + number.start);
                        number.start++;

                        number.flag = true;

                        TwoThreadWaitNotify.class.notify();
                    }else {
                        try {
                            TwoThreadWaitNotify.class.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
    }
    /**编写一个函数来查找字符串数组中的最长公共前缀。

     如果不存在公共前缀，返回空字符串 ""。

     示例 1:

     输入: ["flower","flow","flight"]
     输出: "fl"*/
    public static String longestCommonPrefix(String[] strs){
        if (strs.length==0){
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int min = strs[0].length();
        for(int i=0;i<strs.length;i++)
        {
            if(strs[i].length()<min)
                min=strs[i].length();
        }
        char flag = ' ';
        for (int i =0;i<min;i++){
                for (int j = 0; j < strs.length-1; j++) {
                    if (!strs[j].equals("")){
                    if (strs[j].charAt(i) == strs[j + 1].charAt(i)) {
                        flag = strs[j].charAt(i);
                    } else {
                        flag = ' ';
                        return sb.toString().trim();
                    }
                    }else {
                return "";
            }
                }
            sb.append(flag);
        }
        System.out.println("111111-------"+sb.toString());
        return sb.toString().trim();
    }
    /**输入: [7,1,5,3,6,4]
       输出: 5
       解释: 在第 2 天（股票价格 = 1）的时候买入，
       在第 5 天（股票价格 = 6）的时候卖出，最大利润 = 6-1 = 5 。
       2 4 1*/
    public static int maxProfit(int[] prices){
        int flag =0;
        int min = prices[0];
        int max = 0;
        for (int i = 0; i <prices.length ; i++) {
            if (min>prices[i]){
                min = prices[i];
                flag = i;
            }
        }
        max = prices[flag];
        for (int i = flag; i <prices.length ; i++) {
            if (max<prices[i]){
                max = prices[i];
            }
        }
        System.out.println("aaaaaaaa-----"+(max-min));
        return max - min;

        /***/
    }
    /**
     * 2 4 1
     * 7 6 4 3 1
     * 7 1 2 5 6 3*/
    public static int maxProfitNew(int[] prices){
        if (prices.length==0){
            return 0;
        }
        int min = prices[0];
        int value = 0;
        for (int i = 0; i <prices.length ; i++) {
            value = Math.max(value,prices[i] - min);
            min = Math.min(min,prices[i]);
        }
        System.out.println("aaaaaaaaa-----"+value);
        return value;
    }
    /**给定一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？找出所有满足条件且不重复的三元组。

     注意：答案中不可以包含重复的三元组。

     例如, 给定数组 nums = [-1, 0, 1, 2, -1, -4]，

     满足要求的三元组集合为：
     [
     [-1, 0, 1],
     [-1, -1, 2]
     ]*/
    public static List<List<Integer>> threeSum(int[] nums){
        List<Integer> meetConditions = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();

        return result;
    }
}
