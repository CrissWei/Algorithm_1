package Demo6DiGui;
import java.util.Scanner;
/*
* 描述
牛牛定义了一个函数 digit(x,i) ，表示分离出 x 的后 i 位的数字。
*
输入描述：输入两个正整数 x 和 i
输出描述：输出 x 的后 i 位数字

* 示例1
输入：23908 3
输出：908
* */
public class BC170_subString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String a = in.next();
            int b = in.nextInt();
            System.out.println(getString(a,b));
        }
    }

    private static String getString(String a,int b) {
        //这里不清楚是开区间()还是闭区间[]，所以先测试一下最后
        return a.substring(a.length() - b, a.length() );


    }
}
