package Demo3HeiMa.p2Matrix;

import java.util.Arrays;

public class DoubleArray {
    public static void main(String[] args) {
        //3行4列的矩阵
        int[][] n2 = new int[3][4];

        //第1行赋值
        n2[0][0] = 11;
        n2[0][1] = 22;
        n2[0][2] = 33;
        n2[0][3] = 44;


        n2[1][0] = 10;
        n2[1][1] = 20;
        n2[1][2] = 30;
        n2[1][3] = 40;

        n2[2][0]=88;
        n2[2][1]=95;
        n2[2][2]=99;
        n2[2][3]=100;


        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(n2[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("=======");

        for (int i = 0; i < n2.length; i++) {
            for (int j = 0; j < n2[i].length; j++) {
                System.out.print(n2[i][j]+" ");
            }
            System.out.println();
        }

        /*【成功了！】
        11 22 33 44
        10 20 30 40
        88 95 99 100
        */
        System.out.println(n2.length+"行===============");//3行
        System.out.println(n2[1].length+"列===============");//4列

        for (int i = 0; i <= n2.length; i++) {
            for (int[] ints : n2) {
                System.out.print(ints[i]+" ");
            }
            System.out.println();
        }
        /*结果是：
        *   11 10 88
            22 20 95
            33 30 99
            44 40 100
            * 与理想的不一致
            * [[11, 22, 33, 44]
            * [10, 20, 30, 40]
            * [88, 95, 99, 100]]
        * */

        System.out.println("====");
        String ss = Arrays.deepToString(n2);
        System.out.println(ss);
        //[[1, 2, 3, 4], [10, 20, 30, 40], [88, 95, 99, 100]]
    }
}
