package Demo8List.Single;

public class ReverseList3 {
    public ListNode ReverseList(ListNode head) {
        ListNode pre = null;//上个节点
        ListNode cur = head;//当前节点
        ListNode curNext = cur.next;//下一个节点

        while (cur != null) {
            curNext = cur.next;//下一个节点
            cur.next = pre;//当前节点的next指针，指向上一个节点
            pre = cur;//赋值给pre上一个节点
            cur = curNext;//赋值cur当前节点
        }
        return pre;

        /*
        *【这个方法也行！】
        if(head == null) return null;
        ListNode cur = head;
        ListNode new_head = null;
        while(cur!=null){
            ListNode temp = cur.next;
            cur.next = new_head;
            new_head = cur;
            cur = temp;
        }
        return new_head;
    }
        * */
    }
}
