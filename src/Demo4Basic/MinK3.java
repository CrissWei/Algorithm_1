package Demo4Basic;

import java.util.*;

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
public class MinK3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) { //不能使用in.hasNext()
            int N = in.nextInt();//整数的个数N
            int K = in.nextInt();//整数的前K个最小值
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 0; i < N; i++) {
                list.add(in.nextInt());
            }
            //排序
            Collections.sort(list);
          /*  System.out.println(list);
            System.out.println("====");
            System.out.println(list+"");
            System.out.println("====");
            String s1 = list + " ";
            System.out.println(list+" ");
            System.out.println("====");
            System.out.println("s1:"+s1);
            System.out.println("====");*/

            if (K <= N) {

                //遍历前K个元素
                for (int i = 0; i < K; i++) {
                    //顺便Arraylist变成String
                    String s = list.get(i) + " ";
                    System.out.print(s);
                }
                System.out.println();
            }else {
                System.out.println(list+" ");
            }
        }
    }
}
