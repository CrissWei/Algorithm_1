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
        //method2();

        System.out.println(markNums("Jkdi234klowe90a3"));

    }
    private static void method2() {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String s1 = s.replaceAll("(\\d+)", "*$1*");
        System.out.println(s1);
        //上面4行全部合成一行代码
        System.out.println( new Scanner(System.in).nextLine().replaceAll("(\\d+)", "*$1*"));
    }

    //没完成的方法
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


    //将数字周围都加上*  两个数字中间肯定有两个** 然后替换掉就行了
    public static String markNums(String pInStr) {
        char[] arr = pInStr.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i]  >= '0') && (arr[i] <= '9')) { // 判断为数字
                sb.append("*" + arr[i] + "*");  //两边都加上*
            } else
                sb.append(arr[i]);
        }
        return sb.toString().replace("**", "");  //两个数字中间有** 替换掉
    }
}
