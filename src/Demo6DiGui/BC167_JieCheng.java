package Demo6DiGui;

import java.util.Scanner;

/*
* 描述
编写一个函数 long long factorial(int n)，用于计算 n 的阶乘.（要求使用递归实现）
*
输入描述：键盘输入任意一个整数 n ，范围为 1 - 20 ,不能使用int，要long
输出描述：输出 n 的阶乘

* 示例1
输入：5
输出：120
* */
public class BC167_JieCheng {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            //范围为 1 - 20 ,不能使用int，要long
            long a = in.nextInt();
            System.out.println(getJieCheng(a));
        }
    }

    private static long getJieCheng(long n) {
        //if (n==0) return 1;
        if (n==1) return 1;
        if (n==2) return 2;
//        if (n==3) return 6;
//        if (n==4) return 24;
//        if (n==5) return 120;
        else return getJieCheng(n-1)*n;
    }
}
