package Demo8List.Single;

/*[反转next指针]
* //反转的关键：当前cur节点的next指针调转方向(而不是cur的next节点的next指针调转方向)，
            // 去指向cur当前节点的前一个节点pre(注意这不是双向链表，没有前驱指针)
            //【我明白了A->B->C，其实意思就是本来B的next指针本来是指向节点C的，现在要让B的next指针重新指向节点A】

* 复杂度分析：
    时间复杂度O(N)：N表示链表长度，双指针一次遍历
    空间复杂度O(1)：常数大小空间指针
* */
public class Test3 {
    public ListNode ReverseList(ListNode head) {

        /*
        * //pre此时是null,cur是当前链表的head头结点，同时代表反转之后的尾节点，而尾节点的next指针必须为null
            // 指针不是赋值，不是 pre = cur.next;
        * */
        //定义变量cur：当前节点cur就是原链表的头结点
        ListNode cur = head;

        //定义变量空节点pre，表示头结点的前一个节点（此时头结点的前一个节点为null）
        ListNode pre = null;

//【这个变量不能定义在这，要在while循环里面，防止空指针异常】
//        //定义变量 ,代表当前节点指向的下一个节点
//        ListNode curNext = cur.next;

        while (cur != null) { //cur != null代表节点不为空，next代表指针不是null

            //定义变量 ,代表当前节点指向的下一个节点, 是cur的下一个节点
            ListNode curNext = cur.next;


            // 指针不是赋值，不是 pre = cur.next;而是cur.next = pre;
            // 【反转指针】,next方法：是当前节点的next指针，（赋值调转方向）指向前一个节点pre
            cur.next = pre;//pre此时是null,cur是当前链表的head头结点，同时代表反转之后的尾节点，而尾节点的next指针必须为null

            //pre赋值给cur, 其实就是pre 和 cur 同时往前移动一个位置，直至当前节点cur到达链表尾部
            //cur = pre;
            pre = cur;//后一个节点赋值给前一个


            //curNext赋值给cur: 当前节点的下一个节点赋值给当前节点，其实就是2者后移一个节点
            cur = curNext;//后一个节点赋值给前一个
            //curNext = cur;
        }
        return pre;//返回的是新链表的最后一个节点，并且此时的pre.next指向是null

    }
}
