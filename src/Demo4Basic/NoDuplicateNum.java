package Demo4Basic;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/*HJ9 提取不重复的整数 【华为机考入门】
* 描述
输入一个 int 型整数，按照从右向左的阅读顺序，返回一个不含重复数字的新的整数。
保证输入的整数最后一位不是 0 。

数据范围： 1≤n≤10^8

输入描述：
输入一个int型整数

输出描述：
按照从右向左的阅读顺序，返回一个不含重复数字的新的整数

示例1
输入：9876673
输出：37689
* */
public class NoDuplicateNum {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int i1 = in.nextInt();
        //int 转字符串String方法一：
        String ss = String.valueOf(i1);
       /* //int 转字符串String方法二：不需要valueOf
        String ss3 = i1+"";
        char[] chars3 = ss3.toCharArray();
*/
        //使用SB的reverse方法来反转字符串，或者forr 的i--来反转
        StringBuilder sb = new StringBuilder(ss);
        String ss2 = sb.reverse().toString();

        String str = "";
        char[] chars = ss2.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            //!str如果字符串不包含chars[i] + ""，就添加
            if (!str.contains(chars[i] + "")) {
                //ss2.replace(chars[i],'0' );
                str += chars[i];
            }
        }
        System.out.println(Integer.parseInt(str));

        System.out.println("================================");

        //用一个不存在重复数字的set集合
        Set<Object> hs = new HashSet<>();
        for (int i = 0; i < ss2.length(); i++) {
            char c = ss2.charAt(i);
            hs.add(c);
        }

        //把一个hs的set集合变成String , 再转换为int会报错，转换异常，因为有[]括号
        String ssss = hs + "";
        //int i = Integer.parseInt(ssss);
        System.out.println(ssss);

        System.out.println(hs);

        method2();
    }

    private static void method2() {


        Scanner sc = new Scanner(System.in);
        //死循环
        while (sc.hasNext()) {
            // 使用HashSet来判断是否是不重复的
            HashSet<Integer> hs = new HashSet<>();
            int target = sc.nextInt();// 获取代求解的值
            while (target != 0) { // 求解每位上面的整数
                int temp = target % 10;
                if (hs.add(temp)) // 如果能加入，就是说明没有重复
                    System.out.print(temp);
                target /= 10;// 除10能去掉最右边的数字
            }
            System.out.println();
        }
    }


}
