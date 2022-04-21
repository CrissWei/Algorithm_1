package Demo1.p2subString;

/**
 *1.输入字符串大于8时，递归截取前8位输入，直至小于8位时进入循环补0
 *2.字符串小于8时直接跳到循环补0操作，补满至8位时打印输出
 *3.正好等于8位或为空字符串时，直接打印输出
 */
import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //死循环
        while (in.hasNextLine()) {
            String s=in.nextLine();
            while(s.length()>8){
                System.out.println(s.substring(0,8));
                s=s.substring(8);
            }
            while(s.length()<8 && s.length()>0){
                s+="0";
            }
            System.out.println(s);
        }
    }
}

