package Demo8List.Single;

public class ReverseList0 {
        public ListNode ReverseList(ListNode head) {
            //if (head==null) return null; //head不可能是null,所以这行code可以省略
            //if (head.next!=null) return head;

            ListNode pre = null;//当前节点的上一个节点
            ListNode cur = head;//当前节点
            //ListNode curNext = head.next;//当前节点的下一个节点     【1】

            while (cur!=null){
                ListNode curNext = cur.next;//当前节点的下一个节点   【1+1=2】
                //curNext=cur.next;//【赋值，右边赋值给左边】         【1】
                cur.next=pre;//【指针】cur的next指针指向pre
                pre=cur;//【赋值】
                cur= curNext;//【赋值】
            }
            return pre;
        }

        /*
        *   if (head == null) return null;
        if (head.next == null) return head;
        ListNode pre = null;
        ListNode cur = head;
        ListNode curNext = head.next;//1
        while (cur != null) {
            //ListNode curNext = cur.next;//1+1=2
            curNext = cur.next;//1
            cur.next = pre;
            pre = cur;
            cur = curNext;
        }
        return pre;
        * */
}
