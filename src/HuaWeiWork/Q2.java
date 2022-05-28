package HuaWeiWork;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();
            System.out.println(getWays(a,b));
        }
    }
        private static int getWays(int a, int b){
            if (a == 0 || b == 0) {
                return 1;
            }
            return getWays(a, b - 1) + getWays(a - 1, b);

        }


}