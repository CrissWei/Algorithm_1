package Demo4Basic;
/*HJ58 输入n个整数，输出其中最小的k个
* 描述
输入n个整数，找出其中最小的k个整数并按升序输出

本题有多组输入样例

数据范围：1≤n≤1000  ，输入的整数满足 1≤val≤10000
输入描述：
第一行输入两个整数n和k
第二行输入一个整数数组

输出描述：
从小到大输出最小的k个整数，用空格分开。

示例1
输入：
5 2
1 3 5 7 2

输出：1 2
* */

import java.util.Arrays;
import java.util.Scanner;

public class MinK {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //getMin();
    }

    private static String getMin(int N, int K, int[]Array) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){

            N = in.nextInt();
            K=in.nextInt();
            for (int i = 0; i < N; i++) {
                int N2 = in.nextInt();
            }

            Arrays.sort(Array);
            //System.out.println(Array[0]+" "+Array[1]);
            return Array[0]+" "+Array[1];
        }




        return null;
    }

}
