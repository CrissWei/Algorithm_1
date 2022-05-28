package WorkQuestion.Erlang;

public class q4 {
    //打印斐波那契数列 ，打印28657和46368之前的斐波那契数列
    public static void main(String[] args) {
        //定义num1、num2、num3三个变量，代表数列中连续的三个数
        int num1 = 1;
        int num2 = 1;
        int num3 = 0;
        while (num3 < 28657) {
            System.out.println(num3);
            num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
        }

        System.out.println("=========");
        method(num1, num2, num3);
        System.out.println("=========");
        method2();

    }

    //如果是打印包含46368在内的是
    public static void method(int a, int b, int sum) {
        while (sum <= 46368) {
            sum = a + b;
            System.out.println(sum);
            a = b;
            b = sum;
        }
    }

    public static void method2() {
        //定义num1、num2、num3三个变量，代表数列中连续的三个数
        int a = 1;
        int b = 1;
        int sum = 0;
        while (sum < 46368) {
            sum = a + b;
            System.out.println(sum);
            a = b;
            b = sum;
        }
    }
}
