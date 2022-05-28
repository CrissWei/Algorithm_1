package Demo7Stack;

import java.util.Iterator;
import java.util.Stack;

public class testStack {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("a");
        stack.push("b");
        //获取最后一个添加的元素，但是不弹出
        System.out.println(stack.peek());//b
        stack.push("c");
        //从栈里面弹出最后一个添加的元素，size-1
        System.out.println(stack.pop());//c,弹出最后一个添加的元素，也是最栈的上面的
        stack.push("d");
        System.out.println(stack.peek());//d
        stack.push("e");
        stack.push("f");

        System.out.println(stack.firstElement());//a
        System.out.println(stack.lastElement());//f
        System.out.println(stack.isEmpty());
        System.out.println(stack.size()); //abdef
        System.out.println("====---");

        //遍历方法1：
        Iterator<String> it = stack.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("======");
        ////遍历方法2：
        for (String s : stack) {
            System.out.println(s);
        }

        //
    }
}
