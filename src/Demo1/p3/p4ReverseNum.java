package Demo1.p3;

import java.util.Scanner;

/*
* 描述
输入一个整数，将这个整数以字符串的形式逆序输出
程序不考虑负数的情况，若数字含有0，则逆序形式也含有0，如输入为100，则输出为001

数据范围：0≤n≤2^30

输入描述：
输入一个int整数
输出描述：
将这个整数以字符串的形式逆序输出

示例1
输入：1516000
输出：0006151
* */
public class p4ReverseNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        //reverse(num);
        //reverse2(num);
        reverse3(num);
    }
    private static void reverse(int num) {
        String ss = String.valueOf(num);
        char[] chars = ss.toCharArray();
        for (int i = chars.length - 1; i >= 0; i--) {
            System.out.print(chars[i]);
        }
    }

    private static void reverse2(int num) {
        String ss = String.valueOf(num);
        for (int i = ss.length() - 1; i >= 0; i--) {
            System.out.print(ss.charAt(i));
        }
    }

    private static void reverse3(int num) {
        String ss = String.valueOf(num);
        StringBuffer sb = new StringBuffer(ss);
        sb.reverse();
        System.out.println(sb.toString());
    }
}
