package Demo1.p2subString;

import java.util.Scanner;

/*
* 描述
•输入一个字符串，请按长度为8拆分每个输入字符串并进行输出；

•长度不是8整数倍的字符串请在后面补数字0，空字符串不处理。
输入描述：
连续输入字符串(每个字符串长度小于等于100)

输出描述：
依次输出所有分割后的长度为8的新字符串

示例1
输入：abc
输出：abc00000
*
* 【思路】
*   1.获取输入的字符串
    2.判断字符串长度，小于8,在后面补上0，达到8位，大于8，先以8位作为
一段截取，再判断剩余字符串长度与8比较，如果小于8,照上述操作，大于8，先截取8位，再判断剩下的...
如此循环操作。
*
*
* 【关键点：我没有想到字符串的subString方法】
* */
public class Main {
    public static void main(String[] args) {

        System.out.println(method1());
    }

    private static String method1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入");
        String line = sc.next();

        char[] chars = line.toCharArray();

        int x=0;


        for (int i = 0; i < chars.length; i++) {

            if (chars.length<=8){
                if (chars.length==1) {
                    return line + "0000000";
                }else if (chars.length==2) {
                    return line + "000000";
                }else if (chars.length==3){
                    return line+"00000";
                }else if (chars.length==4){
                    return line+"0000";
                }else if (chars.length==5){
                    return line+"000";
                }else if (chars.length==6){
                    return line+"00";
                }else if (chars.length==7){
                    return line+"0";
                }else {
                    return line;
                }
            }
            else if (chars.length<=100){
                //不会写，乱写的啊啊啊
                if (i==9){
                    line.split(chars.toString(),9);
                }else {
                    String substring = line.substring(0, 8);
                    System.out.println(substring);
                }
            }
        }
        return line;
    }
}
