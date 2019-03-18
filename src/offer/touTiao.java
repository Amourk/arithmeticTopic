package offer;

import java.util.*;

/**
 * 输入： 第1行为n代表用户的个数 第2行为n个整数，
 * 第i个代表用户标号为i的用户对某类文章的喜好度
 * 第3行为一个正整数q代表查询的组数
 * 第4行到第（3+q）行，每行包含3个整数l,r,k代表一组查询，
 * 即标号为l<=i<=r的用户中对这类文章喜好值为k的用户的个数。
 * 数据范围n <= 300000,q<=300000 k是整型
 *
 * 输出：一共q行，每行一个整数代表喜好值为k的用户的个数
 *
 *
 * 5
 * 1 2 3 3 5
 * 3
 * 1 2 1
 * 2 4 5
 * 3 5 3
 *
 * 1
 * 0
 * 2
 *
 *
 * 样例解释:
 * 有5个用户，喜好值为分别为1、2、3、3、5，
 * 第一组询问对于标号[1,2]的用户喜好值为1的用户的个数是1
 * 第二组询问对于标号[2,4]的用户喜好值为5的用户的个数是0
 * 第三组询问对于标号[3,5]的用户喜好值为3的用户的个数是2*/
public class touTiao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i <arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        int q = scanner.nextInt();
        int size = 0;
        int aa[][] = new int[q][3];
        for (int j = 0; j < q; j++) {
            for (int x = 0; x < 3; x++) {
                aa[j][x] = scanner.nextInt();
            }
        }
        for (int i = 0; i <q ; i++) {
            size = 0;
            for (int j = aa[i][0]-1 ; j <aa[i][1] ; j++) {
                if (aa[i][2]==arr[j]){
                    size++;
                }
            }
            System.out.println(size);
        }
    }

    /**
     * 作为一个手串艺人，
     * 有金主向你订购了一条包含n个杂色串珠的手串——每个串珠要么无色，
     * 要么涂了若干种颜色。
     * 为了使手串的色彩看起来不那么单调，金主要求，
     * 手串上的任意一种颜色（不包含无色），
     * 在任意连续的m个串珠里至多出现一次（注意这里手串是一个环形）。
     * 手串上的颜色一共有c种。
     * 现在按顺时针序告诉你n个串珠的手串上，
     * 每个串珠用所包含的颜色分别有哪些。
     * 请你判断该手串上有多少种颜色不符合要求。
     * 即询问有多少种颜色在任意连续m个串珠中出现了至少两次。
     *
     *
     * 第一行输入n，m，c三个数，用空格隔开。
     * (1 <= n <= 10000, 1 <= m <= 1000, 1 <= c <= 50)
     * 接下来n行每行的第一个数num_i(0 <= num_i <= c)
     * 表示第i颗珠子有多少种颜色。
     * 接下来依次读入num_i个数字，
     * 每个数字x表示第i颗柱子上包含第x种颜色(1 <= x <= c)
     *
     * 一个非负整数，表示该手链上有多少种颜色不符需求。
     *
     * 5 2 3
     * 3 1 2 3
     * 0
     * 2 2 3
     * 1 2
     * 1 3
     *
     *
     * 2
     *
     *
     * 第一种颜色出现在第1颗串珠，与规则无冲突。
     * 第二种颜色分别出现在第 1，3，4颗串珠，第3颗与第4颗串珠相邻，所以不合要求。
     * 第三种颜色分别出现在第1，3，5颗串珠，第5颗串珠的下一个是第1颗，所以不合要求。
     * 总计有2种颜色的分布是有问题的。
     * 这里第2颗串珠是透明的。*/
    public static  void  er(){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int c= scanner.nextInt();
        HashMap<Integer,List<Integer>> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i <n ; i++) {
            int a = scanner.nextInt();
            for (int j = 0; j <a ; j++) {
                list.add(scanner.nextInt());
            }
            map.put(i,list);
        }
        for (int i = 0; i <c ; i++) {
            List<Integer> list1 = map.get(i);
            for (Integer l:list1) {
                if (l==i){

                }
            }
        }
    }


    /**【编码题】字符串S由小写字母构成，长度为n。
     * 定义一种操作，每次都可以挑选字符串中任意的两个相邻字母进行交换。
     * 询问在至多交换m次之后，
     * 字符串中最多有多少个连续的位置上的字母相同？
     *
     *
     * 第一行为一个字符串S与一个非负整数m。
     * (1 <= |S| <= 1000, 1 <= m <= 1000000)
     *
     * 一个非负整数，表示操作之后，连续最长的相同字母数量。
     *
     * abcbaa 2
     *
     * 2
     *
     *
     * 使2个字母a连续出现，至少需要3次操作。即把第1个位置上的a移动到第4个位置。
     * 所以在至多操作2次的情况下，最多只能使2个b或2个a连续出现。*/
    public static void san(){

    }
}
