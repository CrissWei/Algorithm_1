package Demo5HuaWei.Easy;

import java.util.Scanner;

/*
 描述
•输入一个字符串，请按长度为8拆分每个输入字符串并进行输出；
•长度不是8整数倍的字符串请在后面补数字0，空字符串不处理。

    输入描述：
    连续输入字符串(每个字符串长度小于等于100)
    输出描述：
    依次输出所有分割后的长度为8的新字符串

    示例1
    输入：abc
    输出：abc00000
* */
public class HJ4_split {
    public static void main(String[] args) {
        //get8Char();
        //get8Char2();
        get8Char3();


    }

    //最好的方法，非常难想到。
    private static void get8Char3() {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str = sc.nextLine();
            str = str + "0000000";
            int n = str.length() / 8;
            for (int i = 0; i < n; i++) {
                System.out.println(str.substring(8 * i, 8 * (i + 1)));
            }
        }

    }

    private static void get8Char2() {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String str = in.nextLine();
            for (int i = 0; i < str.length(); i++) {
                if (str.length() <= 8) {
                    System.out.print(str.charAt(i));
                    //加8-i个0
                    for (int i1 = 0; i1 < (8 - i); i1++) {
                        new StringBuilder(str).append(0);
                        System.out.println(str.charAt(i));
                    }

                } else if (str.length() <= 100) {
                    String ss = str.substring(0, 8);
                    System.out.println(ss);
                }
            }
        }
    }

    //别人的代码
    private static void get8Char() {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            Scanner scanner = new Scanner(System.in);
            String next = scanner.next();
            int length = next.length();
            int a = length % 8;
            if (a != 0) {
                for (int i = 0; i < 8 - a; i++) {
                    next += "0";
                }
            }
            //System.out.println(next);
            for (int i = 0; i < next.length(); i += 8) {
                System.out.println(next.substring(i, i + 8));
            }
        }
    }
}
