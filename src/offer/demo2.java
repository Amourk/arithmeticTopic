package offer;

 class demo2 {
    /**请实现一个函数，将一个字符串中的每个空格替换成“%20”。
     * 例如，当字符串为We Are Happy.
     * 则经过替换之后的字符串为We%20Are%20Happy。*/
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("We Are Happy");
        String a = str.toString().replace(" ","%20");
        System.out.println("aaaaaa"+a);

    }
    public static String replaceSpace(StringBuffer str) {
        StringBuilder sb = new StringBuilder();
        char[] c = str.toString().toCharArray();
        for (int i = 0; i <c.length ; i++) {
            if (c[i]==' '){
                sb.append("%20");
            }else {
            sb.append(c[i]);
            }
        }
        System.out.println("aaaaaa"+sb);
        return sb.toString();
    }
}
