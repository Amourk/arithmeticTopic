package offer;

public class demo12 {
    public static void main(String[] args) {

    }
    /**输入一个整数数组，实现一个函数来调整该数组中数字的顺序，
     * 使得所有的奇数位于数组的前半部分，
     * 所有的偶数位于数组的后半部分，
     * 并保证奇数和奇数，偶数和偶数之间的相对位置不变*/
    public void reOrderArray(int [] array) {
//         1 2 3 7 5 4 9 8
//        [2,4,6,1,3,5,7]
        for (int i = 0; i <array.length ; i++) {
            for (int j = 0; j <array.length-1 ; j++) {
                if (array[j]%2!=1){
                    if (array[j+1]%2==1) {
                        int temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                    }
                }
            }
        }
    }
}
