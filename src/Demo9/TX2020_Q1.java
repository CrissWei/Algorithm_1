package Demo9;

//试卷： 腾讯2020校园招聘-后台
public class TX2020_Q1 {
    public static void main(String[] args) {
        new TX2020_Q1().compress("HG[3|B[2|CA]]F");

        //testStringIndex();
    }

    private static void testStringIndex() {
        String strS = "3abcdeabcdsfxhg";
        int firstL = strS.indexOf("a");//1
        int firstR = strS.indexOf("b");//2
        int lastR = strS.lastIndexOf("b");//7
        int lastL = strS.lastIndexOf("a");//6
        //[)
        String lift = strS.substring(firstL, lastL + 1);//abcdea
        String right = strS.substring(firstR, lastR + 1);//bcdeab

        System.out.println(firstL);
//        System.out.println("fL2次："+firstL2);
//        System.out.println("fR2次："+firstR2);
        System.out.println(firstR);
        System.out.println(lastR);
        System.out.println(lastL);
        System.out.println("---");
        System.out.println(lift);
        System.out.println(right);
    }

    /*
    * 小Q想要给他的朋友发送一个神秘字符串，但是他发现字符串的过于长了，
    * 于是小Q发明了一种压缩算法对字符串中重复的部分进行了压缩，
    * 对于字符串中连续的m个相同字符串S将会压缩为[m|S](m为一个整数且1<=m<=100)，
    * 例如字符串ABCABCABC将会被压缩为[3|ABC]，现在小Q的同学收到了小Q发送过来的字符串，
    * 你能帮助他进行解压缩么？

    * 输入例子1:
    "HG[3|B[2|CA]]F"
    * 输出例子1:
    "HGBCACABCACABCACAF"
    * 例子说明1:
    HG[3|B[2|CA]]F−>HG[3|BCACA]F−>HGBCACABCACABCACAF
     * */
    public void compress(String str) {
        // write code here
        int l = 0;
        int r = 0;
        for (int i = 0; i < str.length(); i++) {
            String ss = str.charAt(i) + "";
            if (ss.equals("[")) {
                l++;
            } else if (ss.equals("]")) {
                r++;
            }
        }
        System.out.println("【个数：" + l);
        System.out.println("】个数：" + r);

        String lift=null;
        String right=null;
        String CA =null;
        String BCA=null;
        int num2 =0;
        int num3 =0;
        for (int i = 0; i < str.length(); i++) {
            //不纯在‘[’就停止循环
            // while (!str.contains("[")) {
            //str = in.nextLine(); "HG[3|B[2|CA]]F"
            int firstL = str.indexOf("[");  //第一个[的索引
            int lastR = str.lastIndexOf("]");//最后一个]的索引
            int firstR = str.indexOf("]");
            int lastL = str.lastIndexOf("[");

            //分割字符串:"HG[3|B[2|CA]]F"
            lift = str.substring(firstL, lastR + 1);//
            right = str.substring(lastL, firstR + 1);//
            // }

            //从"HG[3|B[2|CA]]F"当中去分割"CA"
            String n2 = str.charAt(lastL + 1) + "";//2
             num2 = Integer.parseInt(n2);//2
            CA = str.substring(lastL + 3, firstR);//CA

            //从"HG[3|B[2|CA]]F"当中去分割"[3|B[2|CA]"
            String s3 = str.charAt(firstL + 1) + "";
            num3 = Integer.parseInt(s3);
            BCA = str.substring(firstL+3,lastR);

        }

        System.out.println(CA);//CA 没错
        System.out.println(BCA);//B[2|CA] 没错
        System.out.println(num2);//2
        System.out.println(num3);//3

     /*   //字符串拼接SB，循环次数,因为本身有一次了，所以减少一次拼接num2-1
        for (int i = 0; i < num2-1; i++) {
            //new StringBuilder(CA).append(CA);
            CA= CA+CA;
        }
        for (int i = 0; i < num3-1; i++) {
            new StringBuilder(BCA).append(BCA);
        }*/
        CA=CA+CA;
        //BCA=BCA+BCA+BCA;




        //缺点：没办法解决中间的[]，只能求只有2个[]的情况下
        System.out.println(lift);//[3|B[2|CA]]
        System.out.println(right);//[2|CA]
        //"HG[3|B[2|CA]]F"
        //获取最后一个‘[’右边的索引，即数字2

        System.out.println(CA);
        System.out.println(BCA);

    }


}
