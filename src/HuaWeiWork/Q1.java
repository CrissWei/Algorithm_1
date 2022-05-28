package HuaWeiWork;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str  = "";
        int count=0;
        while (in.hasNextInt()) {
            int num = in.nextInt();
            for (int i = 0; i < num; i++) {
                int i1 = in.nextInt();
                str+=i1;
            }

            char[] chars = str.toCharArray();
            if (chars.length<5){
                System.out.println(0);
                break;
            }else {
                for (int i = 0; i < chars.length-4; i++) {
                    //chars[i]==0&&chars[i+1]==0&&chars[i+2]==0&&chars[i+3]==0&&chars[i+4]==0
                    if (chars[i]==0&&chars[i+1]==0&&chars[i+2]==0&&chars[i+3]==0&&chars[i+4]==0){
                        count++;
                        System.out.println(count);
                    }
                    else {
                        System.out.println(0);//每次执行都是else,说明上面的if没写好
                        break;

                    }
              }
            }
        }
        //method1();
    }

    private static void method1(String str) {
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i]==0){
            }
        }

    }
}
