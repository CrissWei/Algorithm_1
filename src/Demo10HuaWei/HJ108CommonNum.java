package Demo10HuaWei;

import java.util.Scanner;

/*
* 正整数A和正整数B 的最小公倍数是指 能被A和B整除的最小的正整数值，
设计一个算法，求输入A和B的最小公倍数。

数据范围：1≤a,b≤100000
输入描述：输入两个正整数A和B。
输出描述：输出A和B的最小公倍数。

示例1
输入：
5 7
输出：
35
* */
public class HJ108CommonNum {
    public static void main(String[] args) {
        method1();
        method2();



    }

    //求最大公因数，转弯求最小公倍数
    private static void method2() {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int A = in.nextInt();
            int B = in.nextInt();
//            if (A % B == 0) System.out.println(A);
//            if (B % A == 0) System.out.println(B);
            for (int i = Math.min(A,B); i >0 ; i--) {
                if (A%i==0 && B%i==0){
                    System.out.println(A*B/i);
                    break; //一旦满足条件必须马上终止，不然还有其他公倍数
                }
            }
        }
    }

    //暴力算法
    private static void method1() {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()){
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            for(int i = 1; i <= n1*n2;i++){
                if(i % n1 == 0 && i % n2 == 0){
                    System.out.println(i);
                    break;
                }
            }
        }
        sc.close();
    }
}
