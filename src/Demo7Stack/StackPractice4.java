package Demo7Stack;

import java.util.Scanner;
import java.util.Stack;

/*括号匹配问题。
给定一个字符串，里边可能包含"()"小括号和其他字符，
请编写程序检查该字符串的中的小括号()是否成对出现。
    例如︰
        "(上海)(长安)":正确匹配
        "上海((长安))":正确匹配
        "上海(长安(北京)(深圳)南京)":正确匹配”
        上海(长安)):错误匹配
        "((上海)长安":错误匹配

* */
public class StackPractice4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            System.out.println(isDouble(in.nextLine()));
        }
    }
    private static boolean isDouble(String str) {
        int left = 0;
        int right = 0;
        char[] chars = str.toCharArray();
        for (char aChar : chars) {
            if (aChar == '(') {
                left++;
            } else if (aChar == ')')
                right++;
            }
         if (left == right && left!=0) {
            return true;
        }
         return false;
    }
}
