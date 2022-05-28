package Demo10HuaWei;

import java.util.Scanner;

/*
* 将一个字符中所有的整数前后加上符号“*”，其他字符保持不变。连续的数字视为一个整数。
数据范围：字符串长度满足1≤n≤100
输入描述：输入一个字符串
输出描述：字符中所有出现的数字前后加上符号“*”，其他字符保持不变

示例1
输入：Jkdi234klowe90a3
输出：Jkdi*234*klowe*90*a*3*
* */
public class HJ96 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()){
            String next = in.nextLine();
            method1(next);
        }

    }


    private static void method1(String str) {
        StringBuilder sb = new StringBuilder();
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i]>='0' && chars[i]<='9'){
                String s = sb.append('*').append(chars[i]).append('*').toString();
                System.out.println(s);
            }

        }

    }
}
