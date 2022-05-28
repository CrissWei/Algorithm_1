package WorkQuestion.Xinye;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (in.hasNext()){
            String s = in.nextLine();
        }

        method1();
    }

    /*
    输入一个正整数的字符串，输出与它最接近的对称数字(不包括它自己)的字符串

注1: 输入字符串的长度最多不会超过18
注2: 当大于输入数字和小于输入数字的对称数字与输入数字距离相同时，取小的数字作为答案

输入描述:输入为一个正整数的字符串
123
输出描述:输出为与输入数字最接近的对称数字(不包括输入本身)的字符串
121
    * 观察对称数和输入数有一定的结构关系。以字符串来看，后半部分一定是前一部分的对称。
    * 以数字大小关系来看，要想找和原数最近的对称数，最高位到最低温越相近越好.
    * 所以直接把原数的前一半对称即可。
    * */
    private static void method1() {
        Scanner sc = new Scanner(System.in);
        String string = sc.next();
        char[] carr = string.toCharArray();
        if(carr.length == 1){
            if(carr[0] == '0'){
                System.out.print(0);
                return;
            }
            System.out.print((char) (carr[0] - 1));
        }else if(carr.length == 2){
            if(carr[0] == '1' && (carr[1] == '1' || carr[1] == '0')){
                System.out.println("9");
                return;
            }
            int n1 = Integer.valueOf(carr[0] + "" + carr[0]);
            int n2 = Integer.valueOf(((char)(carr[0] - 1)) + "" + ((char)(carr[0] - 1)));
            int n3 = Integer.valueOf(((char)(carr[0] + 1)) + "" + ((char)(carr[0] + 1)));
            int oN = Integer.valueOf(string);
            //进行比较，代码省略
            return;
        }
        int stop= carr.length / 2 - 1;
        int j = carr.length % 2;
        if(j == 1){
            for (int i = 0;i <= stop;i ++){
                System.out.print(carr[i]);
            }
            System.out.print(carr[stop + 1]);
            for(int i = stop;i >= 0;i --){
                System.out.print(carr[i]);
            }
        }else {
            for (int i = 0;i <= stop - 1;i ++){
                System.out.print(carr[i]);
            }
            System.out.print((char)(carr[stop] - 1));
            System.out.print((char)(carr[stop] - 1));
            for(int i = stop - 1;i >= 0;i --){
                System.out.print(carr[i]);
            }
        }


    }
}
