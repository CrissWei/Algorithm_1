package Demo3HeiMa.p2Matrix;

public class ReverseMatrix {
    public static void main(String[] args) {
        //n2是7行8列的二维数组
        //int[][] n2 = new int[7][8];

        //arrayA是3行4列的二维数组，第一行是{1,3,5,7}
        int [][] arrayA={{1,3,5,7},{2,4,6,8},{0,5,7,9}};
        //arrayB是4行3列的二维数组，
        int [][] arrayB=new int[arrayA[0].length] [arrayA.length];

        printArray(arrayA);
        System.out.println("====行列互换前后====");


        for (int i = 0; i < arrayA.length; i++) {
            for (int j = 0; j < arrayA[i].length; j++) {
                //关键一步在这，赋值，行列互换
                arrayB[j][i]=arrayA[i][j];
            }
            System.out.println();
        }
        System.out.println("====行列转换后==");
        printArray(arrayB);
    }

    public static void printArray(int[][] arrayA) {
        for (int i = 0; i < arrayA.length; i++) {
            for (int j = 0; j < arrayA[i].length; j++) {
                System.out.print(arrayA[i][j]+" ");
            }
            System.out.println();
        }
            /*
            *   1 3 5 7
                2 4 6 8
                0 5 7 9
            * */

    }

}
