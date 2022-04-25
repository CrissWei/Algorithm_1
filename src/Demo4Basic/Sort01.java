package Demo4Basic;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Arrays;
import java.util.Scanner;

/*HJ101
* 描述
输入整型数组和排序标识，对其元素按照升序或降序进行排序

数据范围：1≤n≤1000，元素大小满足 0≤val≤100000
输入描述：
第一行输入数组元素个数
第二行输入待排序的数组，每个数用空格隔开
第三行输入一个整数0或1。0代表升序排序，1代表降序排序

示例1
输入：
8
1 2 4 9 3 55 64 25
0

输出：
1 2 3 4 9 25 55 64
* */
public class Sort01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (in.hasNextInt()){
            int N = in.nextInt();
            int [] array = new int[N];

            for (int i = 0; i < N; i++) {
               array[i] = in.nextInt();
                //System.out.print(array[i]+" ");
            }
            //System.out.println();

            //排序
            Arrays.sort(array);
            int flag = in.nextInt();

            if (flag==0){ //不要重新写if (in.nextInt()==0)
                for (int i = 0; i < N; i++) {
                    System.out.print(array[i]+" ");
                }
                System.out.println();
                //new StringBuilder().append(" ");
                //System.out.println(Arrays.toString(array) +" ");


            }else if (flag==1){//不要重新写if (in.nextInt()==0)
                for (int i = array.length-1; i >= 0; i--) {
                    System.out.print(array[i]+" ");
                }
                System.out.println();
            }else {
                return;
            }

        }

    }
}
