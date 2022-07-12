package Demo9BinaryFormat;
//查看源码的注释，熟悉API的用法
public class check_API {
    public static void main(String[] args) {
        String str = "hello";
        String as = str.concat("Cris");//添加在str后面的，
        // 例如str = "hello",  str.concat("Cris"); ---> return "helloCris"
        System.out.println(as);
        System.out.println(as.substring(1, 4));//[1,4) ell
        System.out.println(String.valueOf(123));
        System.out.println("===");

        /*
        * %d"表示以十进制整数形式输出
        "%o"表示以八进制形式输出
        "%x"表示以十六进制输出
        "%X"表示以十六进制输出,并且将字母(A、B、C、D、E、F)换成大写
        "%e"表示以科学计数法输出浮点数
        "%E"表示以科学计数法输出浮点数,而且将e大写
        "%f"表示以十进制浮点数输出,在"%f"之间加上".n"表示输出时保留小数点后面n位
        System.out.printf("%d",128); //binary
        System.out.printf("%o",128);//octal
        System.out.printf("%x",128);//Hex
        *  */


        System.out.println(Integer.toString(128,2));//return String
        System.out.println(Integer.toString(128,8));
        System.out.println(Integer.toString(128,10));
        System.out.println(Integer.toString(128,16));
        System.out.println("====");
        //下面这个方法返回的结果数字全是10进制，如"ABC"这个16进制的数字,转为10进制是2746
        System.out.println(Integer.parseInt("ABC",16));//2748
        System.out.println(Integer.parseInt("100",10));//100
        System.out.println(Integer.parseInt("1111",2));//1111的二进制是16
        System.out.println(Integer.parseInt("100",8));//64
        System.out.println(Integer.parseInt("100",16));//表示100这个16进制,转为10进制是256
        System.out.println("=====");
        System.out.println(Integer.toBinaryString(10));//2进制
        System.out.println(Integer.toOctalString(10));//8
        System.out.println(Integer.toHexString(10));//16
    }
}
