package Demo1.p5;

import java.util.Scanner;

public class Contains7 {
        public static void main(String[] args){
            Scanner in = new Scanner(System.in);
            while(in.hasNext()){
                int N = in.nextInt();
                int result = 0;
                //if(N == 0) System.out.println(result);
                String str;
                for(int i = 1; i <= N; i++){
                    str = String.valueOf(i);
                    if(str.contains("7") || i % 7 == 0){
                        result++;
                    }
                }
                System.out.println(result);
            }
            //关闭资源
            in.close();
        }
    }
//it can be converted to a str with which to check that contains the "7"

