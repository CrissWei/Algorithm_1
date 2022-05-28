package Demo5HuaWei.Easy;

import java.util.Scanner;
import java.util.WeakHashMap;

/*
HJ84 统计大写字母个数
简单  通过率：44.75%
知识点:字符串

描述
找出给定字符串中大写字符(即'A'-'Z')的个数。
数据范围：字符串长度：1≤∣s∣≤250
字符串中可能包含空格或其他字符
进阶：时间复杂度：O(n)\O(n) ，空间复杂度：O(n)\O(n)

输入描述：对于每组样例，输入一行，代表待统计的字符串
输出描述：输出一个整数，代表字符串中大写字母的个数

示例1
输入：A 1 0 1 1150175017(&^%&$vabovbaoadd 123#$%#%#O
输出：2
* */
public class HJ84_countUpperCase {
    public static void main(String[] args) {
        methodMy();
    }

    private static void methodMy() {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            String str = in.nextLine();
            char[] chars = str.toCharArray();
            int count=0;
            for (char aChar : chars) {
                if (aChar >= 'A' && aChar <= 'Z') {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
