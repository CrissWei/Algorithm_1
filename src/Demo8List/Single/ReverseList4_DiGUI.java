package Demo8List.Single;

public class ReverseList4_DiGUI {
    public ListNode ReverseList(ListNode head) {

        ListNode pre = null;//上个节点
        ListNode cur = head;//当前节点head重命名为cur
        ListNode curNext = cur.next;//下一个节点

            //递归结束条件
            if(cur == null || cur.next ==null){
                return cur;
            }
            //继续遍历下一个节点
            ListNode reverse = ReverseList(curNext);

            //将后节点指向前节点
            curNext.next = cur;
            //cur.next=pre;这个不行

            //删除前节点指向后节点的指针
            cur.next =null;

            //最终reverse为头节点
            return reverse;

    }

    /*
    * 修改前的代码：
    * public ListNode ReverseList(ListNode head) {
        //递归结束条件
        if(head == null || head.next ==null){
            return head;
        }
        //继续遍历下一个节点
        ListNode reverse = ReverseList(head.next);

        //将后节点指向前节点
        head.next.next = head;
        //删除前节点指向后节点的指针
        head.next =null;

        //最终reverse为头节点
        return reverse;
    }
    *
    * */
}
