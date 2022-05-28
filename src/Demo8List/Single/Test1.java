package Demo8List.Single;



    /*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/



public class Test1 {
    public static ListNode ReverseList(ListNode head) {
        //pre指针：用来指向反转后的节点，初始化为null
        ListNode pre = null;
        //当前节点指针
        ListNode cur = head;
        //循环迭代
        while (cur != null) {
            //Cur_next 节点，永远指向当前节点cur的下一个节点
            ListNode Cur_next = cur.next;
            //反转的关键：当前的节点指向其前一个节点(注意这不是双向链表，没有前驱指针)
            cur.next = pre;
            //更新pre
            pre = cur;
            //更新当前节点指针
            cur = Cur_next;
        }
        //为什么返回pre？因为pre是反转之后的头节点
        return pre;
    }

    public static void main(String[] args) {
//        ListNode next = new ListNode(3).next;
//        ListNode next1 = next.next;
//        ListNode next2 = next1.next;
//        ListNode listNode = ReverseList(next2);
//        System.out.println(listNode);

    }

}
