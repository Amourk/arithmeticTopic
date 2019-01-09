package offer;

public class demo6 {
    /**旋转数组的最小数字*/
    public static void main(String[] args) {

    }
    /**把一个数组最开始的若干个元素搬到数组的末尾，
     * 我们称之为数组的旋转。
     * 输入一个非减排序的数组的一个旋转，输出旋转数组的最小元素。
     * 例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，
     * 该数组的最小值为1。
     * NOTE：给出的所有元素都大于0，若数组大小为0，请返回0。*/
    public int minNumberInRotateArray(int [] array) {
        int size = array.length;
        if (size==0){
            return 0;
        }
        int left = 0;
        int right = size-1;
        int mid = 0;
        ///二分查找
        while (array[left]>=array[right]){
            if (left-right==1){
                mid = right;
                break;
            }
            mid = left+(right-left)/2;
            //说明数组中有重复的元素 只能顺序查找
            if (array[left]==array[mid]&&array[left]==array[right]){
                int result = array[0];
                for (int i = 0; i <array.length ; i++) {
                    if (result>array[i]){
                        result = array[i];
                    }
                    return result;
                }
            }
            if (array[mid]>=array[left]){
                left = mid;
            }else {
                right = mid;
            }
        }
        return array[mid];
    }
}
