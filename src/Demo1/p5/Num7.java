package Demo1.p5;

import java.util.Scanner;

/*
* 描述
输出 1到n之间 的与 7 有关数字的个数。
一个数与7有关是指这个数是 7 的倍数，或者是包含 7 的数字
（如 17 ，27 ，37 ... 70 ，71 ，72 ，73...）

数据范围： 1≤n≤30000
输入描述：
一个正整数 n ( n 不大于 30000 )

输出描述：
一个整数，表示1到n之间的与7有关的数字个数。

示例1
输入：20
输出：3

说明：
输入20，1到20之间有关的数字包括7,14,17共3个
* */
public class Num7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        skip7(num);

        //method7();
    }

    private static void skip7(int num) {
        int sum=0;
        for (int i = 1; i < num; i++) {
            if (i % 7 == 0 || i % 10 == 7 || (i / 10) % 10 == 7
                    || (i / 100) % 10 == 7  || (i / 1000) % 10 == 7
                    || (i / 10000) % 10 == 7 || (i / 100000) % 10 == 7) {
                //System.out.println(i);
                sum++;
            }
        }
        System.out.println(sum);
    }
    private static void method7(){
        for (int i = 0; i < 100; i++) {
            if (i % 7 == 0 || i % 10 == 7 || (i / 10) % 10 == 7) {
                System.out.println(i);
            }
        }
    }


}
