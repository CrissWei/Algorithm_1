package Demo6DiGui;

import java.util.Scanner;

/*
* 描述
牛牛最近学会了一些简单的数学运算，例如 ∑
   请你帮他模拟一下这个运算。 （即 1+2+3....+n-1+n)
   *
输入描述：输入仅一个正整数 n
输出描述：请你计算 ∑

示例1
输入：4
输出：10
*
* 其实就是输入一个数n,然后求前n个数的和。用递归的方法
* */
public class BC168_JieHe {
    public static void main(String[] args) {
        //简单求和方法
        //mySum();

        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
            int a = in.nextInt();
            System.out.println(getSum(a));
        }

        //求前n个数的和，类似阶乘，不过是加，不是乘法


    }

    private static int  getSum(int n) {
        if (n==1) return 1;
        if (n==2) return 3;
        if (n==3) return 6;
        if (n==4) return 10;
        else return n + getSum(n-1);
    }

    //简单求和方法
    private static void mySum() {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        while (in.hasNextInt()) {
            int a = in.nextInt();
            System.out.println(sum+=a);
        }
    }
}
