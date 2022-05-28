package GameDouble;

public class DoubleGame {
    //求前10个最大值

    //求递归S(N)=N+S(N-2) S0=0 ，求S(100)=5050,其实就前100之和而已
    public static void main(String[] args) {

        System.out.println(getSumSn(100));//5050
    }

    private static int getSumSn(int num) {
        if (num == 0) return 0;
        if (num == 1) return 1;
        /*
        * S0=0
        * S1=1+S0=1
        * S2=2+S1=3
        * S3=3+S2=6
        * S4=4+S3=10
        * S5=5+S4=15
        * ....
        * S100=100+S99
        * */
        return num + getSumSn(num - 1);
    }
}
