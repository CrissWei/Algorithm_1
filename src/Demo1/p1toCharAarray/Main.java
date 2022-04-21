package Demo1.p1toCharAarray;

import java.util.Scanner;

/*
【网站】https://www.nowcoder.com/practice/
现在有一种密码变换算法。
九键手机键盘上的数字与字母的对应：
1--1， abc--2, def--3, ghi--4, jkl--5, mno--6, pqrs--7, tuv--8 wxyz--9, 0--0，
把密码中出现的小写字母都变成九键键盘对应的数字，如：a 变成 2，x 变成 9.
而密码中出现的大写字母则变成小写之后往后移一位，如：X,先变成小写,再往后移一位,变成了 y, Z 往后移是a

数字和其它的符号都不做变换。
数据范围： 输入的字符串长度满足  1≤n≤100
输入描述：
输入一组密码，长度不超过100个字符。

输出描述：
输出密码变换后的字符串

示例1
输入：YUANzhi1987
输出：zvbo9441987
* */
public class Main {
    public static void main(String[] args) {
//1--1， abc--2, def--3, ghi--4, jkl--5, mno--6, pqrs--7, tuv--8 wxyz--9, 0--0，
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入：");
        String ss = sc.nextLine();


        char ch;
        //小写字母转换成功了！
        for (int i = 0; i < ss.length(); i++) {
            ch = ss.charAt(i);//遍历得到每一个字符

            if (ch == 'a' || ch == 'b' || ch == 'c') {
                System.out.print(2);
            } else if (ch == 'd' || ch == 'e' || ch == 'f') {
                System.out.print(3);
            } else if (ch == 'g' || ch == 'h' || ch == 'i') {
                System.out.print(4);
            } else if (ch == 'j' || ch == 'k' || ch == 'l') {
                System.out.print(5);
            } else if (ch == 'm' || ch == 'n' || ch == 'o') {
                System.out.print(6);
            } else if (ch == 'p' || ch == 'q' || ch == 'r' || ch == 's') {
                System.out.print(7);
            } else if (ch == 't' || ch == 'u' || ch == 'v') {
                System.out.print(8);
            } else if (ch == 'w' || ch == 'x' || ch == 'y' || ch == 'z') {
                System.out.print(9);
            } else if (ch >= 'A' && ch <= 'Z') {
                if ((ch + 32) == 'z') {
                    System.out.print('a');
                } else {
                    System.out.print((char) (ch + 33));
                }
            } else {
                System.out.print(ch);
            }
        }

        //大写字母转换如下
        char[] chars = ss.toCharArray();
        for (char aChar : chars) {
           /* if (aChar>='A' && aChar<='Z'){
                if (aChar=='A'){
                    System.out.println('b');
                } else if (aChar=='B') {
                    System.out.println('c');
                }else if (aChar=='C') {
                    System.out.println('d');
                }
            }*/
            if (aChar >= 'A' && aChar <= 'Z') {
                if ((aChar + 32) == 'z') {
                    System.out.print('a');
                } else {
                    //System.out.print((char) (aChar + 33));
                }
            }
        }


    }

}

