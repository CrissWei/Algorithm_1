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
public class StackPractice3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            System.out.println(isDouble(in.next()));
        }
    }
    private static boolean isDouble(String str) {
        Stack<Character> stack = new Stack<>();
        char[] chars = str.toCharArray();
        for (char aChar : chars) {
            if (aChar == '(') {
                stack.push(aChar);
            } else if (aChar == ')') {//&& !stack.isEmpty()
                Character p = stack.pop();
                if (p==0){// char 类型的默认值为 0 ,代表stack没有可以弹出的了
                    return false;
                }
            }
        }
        if (stack.isEmpty()) {return true;}
        else { return false; }
    }
}
