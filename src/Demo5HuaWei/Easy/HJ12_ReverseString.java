package Demo5HuaWei.Easy;


import java.util.Scanner;

/*
* 描述
接受一个只包含小写字母的字符串，然后输出该字符串反转后的字符串。
（字符串长度不超过1000）

输入描述：输入一行，为一个只包含小写字母的字符串。
输出描述：输出该字符串反转后的字符串。

示例1
输入：abcd
输出：dcba
* */
public class HJ12_ReverseString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (in.hasNext()) {
            String str = in.nextLine();
             /*
            char[] chars = str.toCharArray();
            for (int i = chars.length - 1; i >= 0; i--) {
                System.out.print(chars[i]);
            }*/


            //两种for循环都可以二选一
            for (int i = str.length()-1; i >= 0; i--) {
                System.out.print(str.charAt(i));
            }
            System.out.println();
        }
    }
}
