package Demo8List.Single;

public class ReverseList2 {
        public ListNode ReverseList(ListNode head) {
            ListNode pre = null;//当前节点的上一个节点
            //ListNode cur = head;//当前节点 这一行其实就是把参数head换个名字cur方便理解，没实际意义

            //ListNode curNext = head.next;//当前节点的下一个节点     【1】
            ListNode curNext=head.next;//当前节点的下一个节点     【1】

            while (head!=null){
                //ListNode curNext = cur.next;//当前节点的下一个节点   【1+1=2】
                //curNext=head.next;//【赋值，右边赋值给左边】         【1】
                head.next=pre;//【指针】cur的next指针指向pre
                pre=head;//【赋值】
                head= curNext;//【赋值】
            }
            return pre;
        }
}
