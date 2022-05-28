package Demo7Stack;

import java.util.Stack;

public class StackPractice2 {
    public static void main(String[] args) {
        String[] str ={"3","17", "15","-","*","18","6","/","+"};
        int result =getReversePolish(str);
        System.out.println("逆波兰表达式结果："+result);
    }

    private static int getReversePolish(String[] str ) {
        //1.定义一个栈，用来存储操作数
        Stack<Integer> stack = new Stack<>();
        //2.从左往右遍历逆波兰表达式，得到每一个元素，
        for (int i = 0; i<str.length;i++) {
            //3.判断当前元素是运算符还是操作数
            String s = str[i];

            //4.运算符，从栈中弹出两个操作数，完成运算，运算完的结果再压人栈中
            //5.操作数， 把该操作数放人到栈中;
            if (s.equals("+")){
                Integer p1 = stack.pop();
                Integer p2 = stack.pop();
                stack.push(p2+p1);
            }else if (s.equals("-")){
                Integer p1 = stack.pop();
                Integer p2 = stack.pop();
                stack.push(p2-p1);
            }else if (s.equals("*")){
                Integer p1 = stack.pop();
                Integer p2 = stack.pop();
                stack.push(p2*p1);
            }else if (s.equals("/")){
                Integer p1 = stack.pop();
                Integer p2 = stack.pop();
                stack.push(p2/p1);
            }else {
                stack.push(Integer.parseInt(s));
            }
        }
        //6.得到栈中最后一个元素，就是逆波兰表达式的结果
        return stack.pop();
    }
}
