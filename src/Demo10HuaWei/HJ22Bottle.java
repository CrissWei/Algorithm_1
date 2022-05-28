package Demo10HuaWei;

import java.util.ArrayList;
import java.util.Scanner;

/*
* 描述
某商店规定：三个空汽水瓶可以换一瓶汽水，允许向老板借空汽水瓶（但是必须要归还）。
小张手上有n个空汽水瓶，她想知道自己最多可以喝到多少瓶汽水。
数据范围：输入的正整数满足 1≤n≤100

注意：本题存在多组输入。输入的 0 表示输入结束，并不用输出结果。
*
输入描述：
输入文件最多包含 10 组测试数据，每个数据占一行，仅包含一个正整数 n（ 1<=n<=100 ），
表示小张手上的空汽水瓶数。n=0 表示输入结束，你的程序不应当处理这一行。

输出描述：
对于每组测试数据，输出一行，表示最多可以喝的汽水瓶数。如果一瓶也喝不到，输出0。

示例1
输入：
3
10
81
0

输出：
1
5
40

说明：
样例 1 解释：用三个空瓶换一瓶汽水，剩一个空瓶无法继续交换
样例 2 解释：用九个空瓶换三瓶汽水，剩四个空瓶再用三个空瓶换一瓶汽水，
剩两个空瓶，向老板借一个空瓶再用三个空瓶换一瓶汽水喝完得一个空瓶还给老板
* */

/*
* 我自己分析题目。列举法
*
* 瓶子数n   喝水数   剩余瓶子数
* 0         0       0
* 1         0       0
* 2         1       0
* 3         1       1
* 4         2       0
* 5         2       0
* 6         3       1
* 7         3       1
* 8         4       0
* 9         4       1
* 10        5       0
* 由此可以推算出来，喝水数是瓶子数/2 向下取整floor 或者直接int类型
*
* */
public class HJ22Bottle {
    public static void main(String[] args) {
        method1();
    }
    private static void method1() {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
            int n = in.nextInt();
            if (n==0){
                break;
            } else {
                list.add(n / 2);
            }
        }
        for (Integer integer : list) {
            System.out.println(integer);
        }
    }
}
