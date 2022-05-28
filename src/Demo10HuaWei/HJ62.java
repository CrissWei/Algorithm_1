package Demo10HuaWei;
import java.util.Scanner;
public class HJ62 {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            // 注意 hasNext 和 hasNextLine 的区别
            while (in.hasNextInt()) { // 注意 while 处理多个 case
                int a = in.nextInt();
                String b=Integer.toBinaryString(a);
                System.out.println(b);
                String s = b.replaceAll("0", "");
                System.out.println(s.length());
                System.out.println(s);
            }
        }

}
