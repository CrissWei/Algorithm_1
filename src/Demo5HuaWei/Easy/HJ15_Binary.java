package Demo5HuaWei.Easy;

import java.util.Scanner;

/*
描述
输入一个 int 型的正整数，计算出该 int 型数据在内存中存储时 1 的个数。

数据范围：保证在 32 位整型数字范围内
输入描述：输入一个整数（int类型）

输出描述：这个数转换成2进制后，输出1的个数

示例1
输入：5    (因为5 的二进制就是 101)
输出：2
* */
public class HJ15_Binary {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){

            int num = in.nextInt();
            String two = Integer.toBinaryString(num);
            System.out.println(num+"的2进制是："+two);

            char[] chars = two.toCharArray();
            int count=0;
            for (int i = 0; i < chars.length; i++) {
                if (chars[i]=='1'){ //【注意】不是chars[i]==1 而是chars[i]=='1'
                    count++;
                }
            }
            System.out.println("1的个数count："+count);

            //把0全部替换掉，剩下的全是1，输出字符串长度即可
            String re = two.replaceAll("0", "");
            System.out.println("1的个数replaceAll："+re.length());
/*
            String str = in.next();
            Integer ten = Integer.valueOf("101", 2); //5
            System.out.println(str+"的10进制是："+ten);*/

        }
    }
}
