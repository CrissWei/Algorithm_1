package Demo5HuaWei.Easy;
/*
* 描述
给定一个仅包含小写字母的字符串，求它的最长回文子串的长度。
所谓回文串，指左右对称的字符串。
所谓子串，指一个字符串删掉其部分前缀和后缀（也可以不删）的字符串
数据范围：字符串长度1≤s≤350
进阶：时间复杂度：O(n) ，空间复杂度：O(n)

* 输入描述：输入一个仅包含小写字母的字符串
* 输出描述：返回最长回文子串的长度

示例1
输入：cdabbacc
输出：4
说明：abba为最长的回文子串,左右对称
* */

import java.util.*;
import java.util.Scanner;

public class HJ85_HuiWenString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()) {
            String s = in.nextLine();
            int max = 0;     // 最长回文子串的长度
            for (int i = 0; i < s.length(); i++) {
                for (int j = s.length(); j > i; j--) {             // 从两头开始匹配
                    if (s.charAt(i) == s.charAt(j - 1)) {      // 两头的字符相等，即开始判断是否为回文串
                        String str = s.substring(i, j);     // 截取待判断的子串str，将str分为两段，相等即为回文子串
                        int n = str.length();
                        String s1 = str.substring(0, n / 2);  // 前半段
                        StringBuffer s2;                   // 后半段，需要分为奇数长度和偶数长度
                        if (str.length() % 2 == 0) {           // 偶数长度：直接截取剩下的后半部分
                            s2 = new StringBuffer(str.substring(n / 2));
                        } else {                             // 奇数长度：不判断中间字符，越过中间字符截取剩下的后半部分
                            s2 = new StringBuffer(str.substring(n / 2 + 1));
                        }
                        //String t = String.valueOf(s2.reverse()); // 翻转后半段的字符串
                        String t = new StringBuffer(s2).reverse().toString(); // 翻转后半段的字符串
                        if (t.equals(s1)) {                        // 翻转后的字符串与前半段相等即为回文串
                            //max = n > max ? n : max;           // 取长度的最大值
                            max = Math.max(n, max);              // 取长度的最大值
                        }
                    }
                }
            }
            System.out.println(max);
        }
    }

}
