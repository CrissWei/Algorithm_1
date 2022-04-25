package Demo4Basic;

import java.util.Scanner;

/*HJ46 截取字符串
* 描述
输入一个字符串和一个整数 k ，截取字符串的前k个字符并输出


* 数据范围：字符串长度满足1≤n≤1000 , 1≤k≤n
输入描述：
1.输入待截取的字符串

2.输入一个正整数k，代表截取的长度

输出描述：
截取后的字符串

示例1
输入：
abABCcDEF
6

输出：
abABCc
* */
public class subString {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        while (in.hasNext()){

            String line = in.nextLine();
            int k2 = line.length()-1;

            //int k = in.nextInt();这里不能使用nextInt
            //此处不能使用nextInt方法,迭代器后移一位会导致下次运行时出现类型转换失败或者空指针异常
            String ss = in.nextLine();
            int k = Integer.parseInt(ss);

            if (k<=k2){
                String substring = line.substring(0, k);
                System.out.println(substring);
            }else {
                return;
            }

        }
    }
}
