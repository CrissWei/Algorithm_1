package Demo9;

//试卷： 腾讯2020校园招聘-后台
import java.util.Deque;
import java.util.LinkedList;
/*
* 利用一个栈，遇到']' 进行出栈运算，将结果再次入栈。
* 【总结：】
* 遇到这种对称问题，尤其是括号问题，用stack来解决
*

①【整体递归】整体是一个 递归，跳出的条件是 字符串里不含有字符 [
* ② 单个处理是，把字符串与StringBuilder之间做转换
* ③ 循环处理时，判断是否含有左中括号，或右中括号，
* 借助 Java的LinkedList构建的栈，做入栈和弹栈操作
* */
public class TX2020_Q1a {
    public static void main(String[] args) {
        //正确输出HGBCACABCACABCACAF
        System.out.println(new TX2020_Q1a().compress("HG[3|B[2|CA]]F"));
    }



    public String compress(String str) {
        if(!str.contains("[")){
            return str;
        }
        StringBuilder sb=new StringBuilder(str);
        int len=str.length();
        char[] ch=str.toCharArray();
        //用stack栈内存，单向的进站，先进后出
        Deque<Integer> stack=new LinkedList<>();
        for(int i=0;i<len;i++){
            if(ch[i]=='['){
                stack.push(i);
            }else if(ch[i]==']'){
                int l=stack.pop();
                int r=i;
                String s=str.substring(l+1,r);
                String res=helper(s);
                sb.delete(l,r+1);
                sb.insert(l,res);
                break;
            }
        }
        return compress(sb.toString());
    }

    //拆分括号中的
    public static String helper(String str){
        StringBuilder sb=new StringBuilder();
        String[] d=str.split("\\|");
        int num=Integer.parseInt(d[0]);
        String s=d[1];
        for(int i=0;i<num;i++){
            sb.append(s);
        }
        return sb.toString();
    }
}
