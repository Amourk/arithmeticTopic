package offer;

public class demo7 {
    //斐波那契数列
    public static void main(String[] args) {

    }
    /**
     大家都知道斐波那契数列，现在要求输入一个整数n，
     请你输出斐波那契数列的第n项（从0开始，第0项为0）。
     n<=39*/
    public int Fibonacci(int n) {
        if (n==0)
            return 0;
        if (n==1)
            return 1;
        int num0 = 0;
        int num1 = 1;
        int result = 0;
        for (int i = 2;i<n;i++){
            result = num0+num1;
            num0 = num1;
            num1 = result;
        }
        return result;
    }
}
