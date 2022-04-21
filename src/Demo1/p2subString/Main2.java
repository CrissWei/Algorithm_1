package Demo1.p2subString;
import java.util.Scanner;
/*
* 1.获取输入的字符串
2.判断字符串长度，小于8,在后面补上0，达到8位，大于8，先以8位作为
一段截取，再判断剩余字符串长度与8比较，如果小于8,照上述操作，大于8，先截取8位，再判断剩下的...
如此循环操作。
* */
public class Main2 {
    /**
     * @author lxg
     * @description 字符串分割
     * @date 2021/9/26
     */

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            while(input.hasNextLine()){
                String s = input.nextLine();
                split(s);
            }
        }

        public static void split(String s){
            while(s.length()>=8){
                System.out.println(s.substring(0,8));
                s=s.substring(8);
            }
            if(s.length()>0){
                s+="00000000";
                System.out.println(s.substring(0,8));
            }
        }


}
