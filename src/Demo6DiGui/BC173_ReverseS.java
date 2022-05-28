package Demo6DiGui;



/*
* 牛牛在尝试把一个整数逆序地输出。
输入描述：输入一个正整数 n。保证个位数不是 0
输出描述：逆序输出这个正整数。

* 示例1
输入：2345
输出：5432
* */
import java.util.Scanner;
public class BC173_ReverseS {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            String inNum = in.nextLine();
            for (int i = inNum.length()-1; i >= 0; i--) {
                char c = inNum.charAt(i);
                System.out.print(c);
            }
            System.out.println();
        }

    }
}
