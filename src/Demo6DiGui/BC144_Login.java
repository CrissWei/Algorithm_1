package Demo6DiGui;

import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class BC144_Login {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String username = "admin";
        String password = "admin";
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNext()) { // 注意 while 处理多个 case
            String a = in.next();
            String b = in.next();
            if (a.equals(username) && b.equals(password)) {
                System.out.println("Login Success!");
            } else {
                System.out.println("Login Fail!");
            }
        }
        in.close();
    }

}
