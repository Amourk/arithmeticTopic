package offer;


import com.sun.deploy.util.StringUtils;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class demo8 {
    //跳台阶
    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        List<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        Iterator<Integer> it = list1.iterator();
        while (it.hasNext()) {
            int idTemp = it.next();
            if(list2.contains(idTemp)) {
                it.remove();
            }
        }
        System.out.println(list1);
//        StringBuilder sb =new StringBuilder();
//        list1.stream().forEach(list->{
//            sb.append(list+",");
//        });
//        System.out.println("aaaaaaaaa+"+sb);
//        String[] id = list1.toArray();
//        for (int i = 0; i <id.length ; i++) {
//            System.out.println("ccccccc+"+id[i]);
//        }
//        System.out.println("aaaaaaaaa+"+StringUtils.join(list1,","));


    }
    /**一只青蛙一次可以跳上1级台阶，也可以跳上2级。
     * 求该青蛙跳上一个n级的台阶总共有多少种跳法（
     * 先后次序不同算不同的结果）。
     *
     * f(n) = f(n-1)+f(n-2)*/
    public int JumpFloor(int target) {
        int one = 1;
        int two = 2;
        int result = 0;
        for (int i = 0; i <target ; i++) {
            result = one + two;
            one = two;
            two = result;
        }
        return result;
    }
}
