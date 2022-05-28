package Demo11Thead;

import java.util.Scanner;

public class DuiCheng {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        isReverse(in.nextLine());
    }

    private static void isReverse( String s) {
        StringBuffer sb=new StringBuffer(s);
        //StringBuffer sb1=sb.reverse();  System.out.println(sb);输出的sb是反转之后的字符串
        String sb1=sb.reverse().toString();
        //注意：这里不能使用==进行比较，因为比较的是字符串内容，所以需要用equals方法
        if(s.equals(sb1)){
            System.out.println("是对称字符串");
        }else{
            System.out.println("不是对称字符串");
        }
    }
}
