package Demo5HuaWei.Easy;


import java.util.Scanner;

/*
* 描述
将一个英文语句以单词为单位逆序排放。例如“I am a boy”，逆序排放后为“boy a am I”
所有单词之间用一个空格隔开，语句中除了英文字母外，不再包含其他字符
数据范围：输入的字符串长度满足1≤n≤1000

注意本题有多组输入
输入描述：输入一个英文语句，每个单词用空格隔开。保证输入只包含空格和字母。
输出描述：得到逆序的句子

示例1
输入：I am a boy
输出：boy a am I

示例2
输入：nowcoder
输出：nowcoder
* */
public class HJ13_ReverseSentence {
    public static void main(String[] args) {
        getReverse1();

    }

    private static void getReverse1() {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String str = in.nextLine();
            //用空格来分割字符串，变成String[]数组
            String[] split = str.split(" ");

            //判断字符数组的长度，如果是1，那么倒序打印字符串str
            if (split.length == 1) {
                char[] chars = str.toCharArray();
                for (int i = chars.length - 1; i >= 0; i--) {
                    System.out.print(chars[i]);
                }
                System.out.println();
            } else {
                //排序数组 Arrays.sort(split);
                //倒序打印
                for (int i = split.length - 1; i >= 0; i--) {
                    System.out.print(split[i] + " ");
                }
                System.out.println();
            }
        }
    }
}
