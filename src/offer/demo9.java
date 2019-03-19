package offer;

public class demo9 {
    public static void main(String[] args) {

    }
    /**我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。
     * 请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，
     * 总共有多少种方法？*/
    public int RectCover(int target) {
        int one = 1;
        int two = 2;
        int result = 0;
        for (int i = 3; i <target ; i++) {
            result = one + two;
            one = two;
            two = result;
        }
        return result;
    }
}
