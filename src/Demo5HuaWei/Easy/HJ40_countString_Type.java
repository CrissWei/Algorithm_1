package Demo5HuaWei.Easy;
import java.util.Scanner;


/*
* 描述
输入一行字符，分别统计出包含英文字母、空格、数字和其它字符的个数。
数据范围：输入的字符串长度满足1≤n≤1000

    输入描述：输入一行字符串，可以有空格
    输出描述：统计其中英文字符，空格字符，数字字符，其他字符的个数

示例
    输入：
    1qazxsw23 edcvfr45tgbn hy67uj m,ki89ol.\\/;p0-=\\][

    输出：
    26
    3
    10
    12
* */
public class HJ40_countString_Type {
    public static void main(String[] args) {

        getAllCount();//我的方法
        getAllCount2();//别人的也可以
    }

    private static void getAllCount2() {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            String str = sc.nextLine();
            int eng=0;
            int blank=0;
            int number=0;
            int other=0;
            for(char ch:str.toCharArray()){
                if(Character.isLetter(ch)){
                    eng++;
                }else if(Character.isDigit(ch)){
                    number++;
                }else if(Character.isSpaceChar(ch)){
                    blank++;
                }else {
                    other++;
                }
            }
            System.out.println(eng);
            System.out.println(blank);
            System.out.println(number);
            System.out.println(other);
        }
    }

    private static void getAllCount() {
        Scanner in = new Scanner(System.in);
        int num=0;
        int English=0;
        int blank=0;
        int others=0;

        while (in.hasNext()){
            String str = in.nextLine();
            char[] chars = str.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                //数字判断居然不是  if (chars[i]>0 && chars[i]<=9)
                //根据ascii表，，0的char是48， 9的char是57, A是65，Z是90， a是97，z是122
                //if (chars[i]>48 && chars[i]<=57){
                if (chars[i]>='0' && chars[i]<='9'){
                    num++;
                }else if ((chars[i]>='A' && chars[i]<='Z') ||( (chars[i]>='a' && chars[i]<='z'))){
                    English++;
                    //如果是空格怎么判断呢？原来直接是' '
                }else if (chars[i]==' '){
                    blank++;
                }else {
                    others++;
                }
            }
            System.out.println(English);
            System.out.println(blank);
            System.out.println(num);
            System.out.println(others);
        }
    }
}
