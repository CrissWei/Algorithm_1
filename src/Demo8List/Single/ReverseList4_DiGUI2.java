package Demo8List.Single;
/*
*文字解说：
（1）先递归，递归到倒数第二个节点，因为倒数第一个节点是最后一个节点，没有next节点。
（2）此时来到了倒数第二个节点“3”,此时的目的就是将节点“3”和节点“4”中间的 “->” 变为 “<-”
这个也好弄，只需要将 节点“3” 的next节点“4”的next指针指向节点“3”本身就 OK 了，
然后将 节点“3”的next指针指向 null 即可，至此，节点“3”的反转就完成了，是不是炒鸡简单！
（3）然后到了节点“2”，只需要重复节点“3”的动作即可，节点“1”也是如此。
这样整个链表的反转就完事了，没骗你们吧，确实很简单滴。

* */
public class ReverseList4_DiGUI2 {
    public ListNode ReverseList(ListNode head) {
        //定义三个遍历，分别代表‘前’，‘中’，‘后’，三个节点
        ListNode pre = null;//上个节点
        ListNode cur = head;//当前节点head重命名为cur
        ListNode curNext = cur.next;//下一个节点

        // 已经到最后一个节点了，返回 作为新链表的头节点
        if (curNext == null) {
            return head;
        }
        ListNode newHead = ReverseList(curNext);
        //pre = ReverseList(curNext);
        curNext.next = cur;
        cur.next=pre;//pre = null;
        return newHead;
    }
}
