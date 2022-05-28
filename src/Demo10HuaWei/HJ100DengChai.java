package Demo10HuaWei;

import java.util.Scanner;

/*
* 等差数列 2，5，8，11，14。。。。
（从 2 开始的 3 为公差的等差数列）输出求等差数列前n项和

数据范围： 1≤n≤1000
输入描述：输入一个正整数n。
输出描述：输出一个相加后的整数。

示例1
输入：2
输出：7
说明：2+5=7
*
* *-----------
* 由于an = an-1 + an-2 ，可以采用递归求Sn
* 公式：an = a1+ (n-1)d ,,,d=3
* 公式：Sn = n(a1 + an)/2
* */
public class HJ100DengChai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int length = sc.nextInt(); // n
            int first = 2;//a1=2
            //公式：an = a1+ (n-1)*d ,d=3
            int last = 3 * length - 1; //  an
            //公式：Sn = n(a1 + an)/2
            System.out.println((first + last) * length / 2);
        }
        sc.close();
        //diGuiSn();

    }

    private static void diGuiSn(int n, int sum) {
        int a = 2, b = 5, c = 8;
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int num = in.nextInt();
            for (int i = 0; i < num; i++) {
                a += 3;
            }
        }
    }
}
