package offer;

public class demo1 {
    /**在一个二维数组中（每个一维数组的长度相同），
     * 每一行都按照从左到右递增的顺序排序，
     * 每一列都按照从上到下递增的顺序排序。
     * 请完成一个函数，输入这样的一个二维数组和一个整数，
     * 判断数组中是否含有该整数。*/
    public static void main(String[] args) {

    }
    public boolean Find(int target, int [][] array) {
        for (int i = 0; i <array.length; i++) {
            //二分
            //递增 有规律 查找 使用二分
            int left = 0;
            int right = array[i].length;
            while (left<=right){
                int mid = (left+right)/2;
                if (target<array[i][mid]){
                    right = mid-1;
                }else if (target>array[i][mid]){
                    left = mid +1;
                }else {
                    return true;
                }
            }
        }
        return false;
    }
}
