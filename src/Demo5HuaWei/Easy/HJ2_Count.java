package Demo5HuaWei.Easy;

import java.util.Scanner;

/*
* 描述
写出一个程序，接受一个由字母、数字和空格组成的字符串，和一个字符，
然后输出输入字符串中该字符的出现次数。（不区分大小写字母）

数据范围：1≤n≤1000
输入描述：
第一行输入一个由字母和数字以及空格组成的字符串，
第二行输入一个字符。

输出描述：
输出输入字符串中含有该字符的个数。（不区分大小写字母）

示例1
输入：
ABCabc
A

输出：
2
* */
public class HJ2_Count {
    public static void main(String[] args) {
        getCount();//简单的好方法
        getCount2();//也可以的
        getCount3();//自己的方法
    }

    private static void getCount3() {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            //全部转为小写
            String ss = in.nextLine().toLowerCase();
            String inputA = in.nextLine().toLowerCase();

            int count = 0;
            char[] chars = ss.toCharArray();
            //双层for循环完全是自己突然想到的，非常完美，，就是时间复杂度为O(n2)
            for (int i = 0; i < chars.length; i++) {
                for (int i1 = 0; i1 < inputA.length(); i1++) {
                    if (inputA.charAt(i1)==chars[i]){
                        count++;
                    }/*else {
                        return;
                    }*/
                }
            }
            System.out.println(count);
        }

    }

    private static void getCount2() {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String str = in.nextLine().toLowerCase();
            //String [] sList = str.split(" ")
            //String putChar =in.nextLine();
            char putChar = in.nextLine().toLowerCase().charAt(0);

            int count = 0;

            char[] chars = str.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                //f( chars[i].equals(putChar)){
                if (chars[i] == putChar) {
                    count++;
                }
            }
            System.out.println(count);

        }
    }

    private static void getCount() {
        Scanner s = new Scanner(System.in);
        String input1 = s.nextLine();
        String input2 = s.nextLine();
        String split3 = input1.toUpperCase().replaceAll(input2.toUpperCase(), "");
        System.out.println(input1.length() - split3.length());
    }
}
