package Demo1.p4;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/*
* 描述
给定 n 个字符串，请对 n 个字符串按照字典序排列。

数据范围： 1≤n≤1000  ，字符串长度满足 1≤len≤100
*
输入描述：
输入第一行为一个正整数n(1≤n≤1000),下面n行为n个字符串(字符串长度≤100),
字符串中只含有大小写字母。
*
输出描述：
数据输出n行，输出结果为按照字典序排列的字符串。
*
示例1
输入：
9
cap
to
cat
card
two
too
up
boat
boot

输出：
boat
boot
cap
card
cat
to
too
two
up
* */
public class Sort {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        times(num);
    }

    public static void times(int num){
        Set<String> set = new TreeSet<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < num; i++) {
            String ss = sc.nextLine();
            set.add(ss);
        }
        //System.out.println(set);

        for (String s : set) {
            System.out.println(s);
        }
    }
}
