package Demo8List.Single;

import java.util.Stack;

/*
* 1，使用栈解决
链表的反转是老生常谈的一个问题了，同时也是面试中常考的一道题。
* 最简单的一种方式就是使用栈，因为栈是先进后出的。
* 实现原理就是把链表节点一个个入栈，当全部入栈完之后再一个个出栈，
* 出栈的时候在把出栈的结点串成一个新的链表。原理如下 :[图片]
* */
public class ReverseList5_Stack {
    public ListNode ReverseList(ListNode head) {

        ListNode pre = null;//上个节点
        ListNode cur = head;//当前节点head重命名为cur
        ListNode curNext = cur.next;//下一个节点

        //创建一个Stack来存储ListNode类
        Stack<ListNode> stack = new Stack<>();

        //遍历链表 && 把链表节点全部摘掉放到栈中
        while (cur!=null){
            stack.push(cur);//压栈，即添加进入栈
            cur = cur.next;//cur = cur.next 类似i++,步进表达式
        }
        if (stack.isEmpty()) {
            return null;
        }
            ListNode node = stack.pop();//最上面的节点被弹出
            ListNode dummy = node;//定义一个新的链表

        //栈中的结点全部出栈，然后重新连成一个新的链表
        while (!stack.isEmpty()) {
            ListNode tempNode = stack.pop();
            node.next = tempNode;
            node = tempNode; //下一个节点赋值给前一个节点 curNext = cur
        }
        //最后一个结点就是反转前的头结点，一定要让他的next
        //等于空，否则会构成环
        node.next = null;
        return dummy;
    }

}
