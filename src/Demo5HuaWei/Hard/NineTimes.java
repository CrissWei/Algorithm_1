package Demo5HuaWei.Hard;
/*打印
* 1
* 2 2
* 3 3 3
* 4 4 4 4
* .....
* n n n n n n n n n
* n<=10
* */

/*打印9*9乘法表
1*1=1
1*2=2	2*2=4
1*3=3	2*3=6	3*3=9
1*4=4	2*4=8	3*4=12	4*4=16
1*5=5	2*5=10	3*5=15	4*5=20	5*5=25
1*6=6	2*6=12	3*6=18	4*6=24	5*6=30	6*6=36
1*7=7	2*7=14	3*7=21	4*7=28	5*7=35	6*7=42	7*7=49
1*8=8	2*8=16	3*8=24	4*8=32	5*8=40	6*8=48	7*8=56	8*8=64
1*9=9	2*9=18	3*9=27	4*9=36	5*9=45	6*9=54	7*9=63	8*9=72	9*9=81
*
*
* */
public class NineTimes {
    public static void main(String[] args) {
        //printNN();

        //9*9乘法表
        //printN9();

        //可以去掉int N =1;和N++
        //printN10();

        //while循环
        printWhileN10();
    }

    private static void printWhileN10() {

    }

    private static void printN10() {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <=i; j++) {
                //完美答案,无需要二维数组就行
                System.out.print(j+"*"+i+"="+j*i+"\t");
            }
            System.out.println();
        }
    }

    private static void printN9() {
        //9行9列的二维数组或 matrix矩阵
        int N=1;
        int [][] N9 = new int[10][10];//这里why10行10列而不是int[9][9]?
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <=N; j++) {
                N9[i][j] = i*j;
                //完美答案,无需要二维数组就行
                //System.out.print(j+"*"+i+"="+j*i+"\t");
                System.out.print(j+"*"+i+"="+N9[i][j]+"\t");
            }
            N++;
            System.out.println();
        }
    }

    private static void printNN() {
        int N =1;
        for (int i = 1; i<=9; i++) {
            //外循环1次，内循环N次
            for (int j = 0; j < N; j++) {
                System.out.print(N+" ");
            }
            N++;
            System.out.println();
        }

    }
}
