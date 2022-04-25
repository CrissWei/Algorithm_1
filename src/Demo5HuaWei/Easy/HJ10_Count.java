package Demo5HuaWei.Easy;

import java.util.HashSet;
import java.util.Scanner;

/*
* 描述
编写一个函数，计算字符串中含有的不同字符的个数。
字符在 ASCII 码范围内( 0~127 ，包括 0 和 127 )，换行表示结束符，不算在字符里。
不在范围内的不作统计。多个相同的字符只计算一次
例如，对于字符串 abaca 而言，有 a、b、c 三种不同的字符，因此输出3

数据范围：1≤n≤500
输入描述：
输入一行没有空格的字符串。

输出描述：
输出 输入字符串 中范围在(0~127，包括0和127)字符的种数。

示例1
输入：abc
输出：3

示例2
输入：aaa
输出：1
* */
public class HJ10_Count {
    public static void main(String[] args) {
        getCount1();
        getCount2();//本身字符就是在Ascii码0-127范围内，不用判断
    }

    private static void getCount2() {
        Scanner in = new Scanner(System.in);
        HashSet<Character> hs = new HashSet<>();
        while (in.hasNext()){
            String str = in.nextLine();
            char[] chars = str.toCharArray();
          /*  for (int i = 0; i < chars.length; i++) {
               hs.add(chars[i]);
            }*/
            //2个for循环二选一都一样
            for (char aChar : chars) {
                //本身字符就是在Ascii码0-127范围内，不用判断也可以
                if (aChar >= 0 && aChar <= 127) {
                    hs.add(aChar);
                }
            }
            System.out.println(hs.size());
        }
    }

    private static void getCount1() {

    }
}
