package Demo5HuaWei.Easy;
/*
* 描述
明明生成了N个1到500之间的随机整数。
请你删去其中重复的数字，即相同的数字只保留一个，把其余相同的数去掉，
然后再把这些数从小到大排序，按照排好的顺序输出。

数据范围：1≤n≤1000  ，输入的数字大小满足1≤val≤500

输入描述：
第一行先输入随机整数的个数 N 。
接下来的 N 行每行输入一个整数，代表明明生成的随机数。

输出描述：
输出多行，表示输入数据处理后的结果

示例1
输入：
3
2
2
1

输出：
1
2

说明：
输入解释：第一个数字是3，也即这个小样例的N=3，
说明用计算机生成了3个1到500之间的随机整数
接下来每行一个随机数字，共3行，也即这3个随机数字为：
2
2
1
* */

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class HJ3_ScannerRepeat {
    public static void main(String[] args) {

        //方法2，不需要用那么多导包，用if就行
        //method2();
        method1();

    }

    private static void method1() {
        Scanner in = new Scanner(System.in);
        TreeSet<Integer> tm = new TreeSet<>();
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNextInt()) { // 注意 while 处理多个 case
            int N = in.nextInt();
            for (int i = 0; i < N; i++) {
                tm.add(in.nextInt());
            }
            //System.out.println(tm+" ");

            //set集合的遍历输出用Iterator，【记住格式，集合遍历，没有括号】
            /*Iterator it = tm.iterator();
            while (it.hasNext()) {
                System.out.println(it.next());
            }*/
            //增强for遍历set集合
            for (Integer integer : tm) {
                System.out.println(integer);
            }
        }
    }

    private static void method2() {
        Scanner in = new Scanner(System.in);

        while (in.hasNext()) {
            int N = in.nextInt();
            int[] arr = new int[N];
//            for (int i : arr) {
//                //用数组来接收
//                arr[i] = in.nextInt();
//            }
            //【为什么不能用增强for啊，必须要fori，测试code有一点点区别】
            for (int i = 0; i < arr.length; i++) {
                arr[i] = in.nextInt();
            }

            Arrays.sort(arr);    //使用库函数排序
            System.out.println(arr[0]);    //打印排序后的第一个数（必不重复）
            for(int i=1; i < N; i++){    //打印其他数字，需与前面数字比较，不重复才能打印
                if(arr[i] != arr[i-1])
                    System.out.println(arr[i]);
            }
        }
    }
}
