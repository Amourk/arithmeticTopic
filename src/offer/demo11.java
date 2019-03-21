package offer;

public class demo11 {
    public static void main(String[] args) {

    }
    /**给定一个double类型的浮点数base和int类型的整数exponent。
     * 求base的exponent次方。*/
    public double Power(double base, int exponent) {
        double result = 1;
        if (exponent==0){
            return 1;
        }
        if (exponent>0) {
            for (int i = 0; i < exponent; i++) {
                result *= base;
            }
            return result;
        }
        if (exponent<0) {
            for (int i = 0; i < Math.abs(exponent); i++) {
                result *= base;
            }
            return 1/result;
        }
        return 0;
    }
}
