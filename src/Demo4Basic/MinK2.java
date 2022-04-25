package Demo4Basic;

import java.util.Arrays;
import java.util.Scanner;

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
public class MinK2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) { //也可以使用in.hasNextInt()
            int N = in.nextInt();//整数的个数N
            int K = in.nextInt();//整数的前K个最小值
            int[] array = new int[N];

            //整数的个数N
            for (int i = 0; i < N; i++) {
                array[i] = in.nextInt();
                //System.out.println(array[i]);
            }
            //排序
            Arrays.sort(array);

            if (K <= N) {
                //取前K个最小值，进行拼接
                StringBuilder sb = new StringBuilder();
                //sb.append(array[0]);

                for (int i = 0; i < K; i++) {
                    //sb.append(array[i]).append(" ");
                    sb.append(array[i]).append(" ");
                    //sb.append(" ");
                }
                System.out.println(sb.toString());
            }else {
                return;
            }
        }
    }
}
