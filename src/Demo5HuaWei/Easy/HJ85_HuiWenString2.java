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

import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

public class HJ85_HuiWenString2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            //String next = in.next();
            String next = in.nextLine();
            char[] chars = next.toCharArray();
            int max=0;
            /*
             *2个for，双指针遍历找到最长子串
            * */
            //正序遍历
            for (int i = 0; i < chars.length; i++) {
                //倒序遍历
                // 【注意】是j >i;而不是 j>=0】
                // 【注意】是int j = chars.length；不是int j = chars.length-1
                for (int j = chars.length; j >i; j--) {
                    //如果前后char相等，就截取出来子字符串
                    //if (chars[i]==chars[j]){

                        //substring (start,end)截取范围为： [start,end)
                        String substring = next.substring(i, j);
                        //cdabbacc: begin -1, end 6, length 8
                        //调用方法，判断subString是否是回文,并且返回最大长度
                        //begin 1, end -1, length 8
                        if (isReverse(substring)){
                            max = Math.max(max,j-i);
                        }

                }
            }
            System.out.println(max);
        }
    }

    private static boolean isReverse(@NotNull String str) {
        //判断是不是对称的回文数字
        return str.equals(new StringBuffer(str).reverse().toString());
    }
}
