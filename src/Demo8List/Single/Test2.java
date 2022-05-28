package Demo8List.Single;

/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/

/*
* 在遍历链表时，将当前节点的next 指针改为指向前一个节点。
* 由于节点没有引用其前一个节点，因此必须事先存储其前一个节点。
* 在更改引用之前，还需要存储后一个节点。最后返回新的头引用。
* */
public class Test2 {
    public ListNode ReverseList(ListNode head) {
        //pre指针：用来指向反转后的节点，初始化为null
        ListNode pre = null;
        //当前节点指针
        ListNode cur = head;

        //当前cur节点的指针，指向的下一个next节点不是为null就循环
        while (cur!=null){
            //定义一个变量：curNext 节点，永远指向当前节点cur的下一个节点
            ListNode curNext = cur.next;

            //反转的关键：当前cur节点的next指针调转方向(而不是cur的next节点的next指针调转方向)，
            // 去指向cur当前节点的前一个节点pre(注意这不是双向链表，没有前驱指针)
            //【我明白了A->B->C，其实意思就是本来B的next指针本来是指向节点C的，现在要让B的next指针重新指向节点A】
            cur.next = pre;//赋值


            //往前移动

            //更新pre
            pre = cur;
            //更新当前节点指针
            cur = curNext ;
        }
        //为什么返回pre？因为pre是反转之后的头节点
        return pre;
    }
}
/*
* 解题思路：
（1）定义两个指针： pre 和 cur ；pre 在前 cur 在后。
（2）每次让 pre 的 next 指向 cur ，实现一次局部反转
（3）局部反转完成之后， pre 和 cur 同时往前移动一个位置
（4）循环上述过程，直至 pre 到达链表尾部

*
* 让当前结点的下一个结点的 next 指针指向当前节点。
同时让当前结点的 next 指针指向NULL
* */