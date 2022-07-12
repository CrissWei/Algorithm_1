package Demo8List.Single;

/*
* 描述
给定一个单链表的头结点pHead(该头节点是有值的，比如在下图，它的val是1)，
长度为n，反转该链表后，返回新链表的表头。

数据范围： 0≤n≤1000
要求：空间复杂度 O(1) ，时间复杂度 O(n) 。

如当输入链表{1,2,3}时，
经反转后，原链表变为{3,2,1}，所以对应的输出为{3,2,1}。
以上转换过程如下图所示：【没办法复制图片】
*
* 示例1
输入：{1,2,3}
返回值：{3,2,1}

示例2
输入：{}
返回值：{}
说明：空链表则输出空
* */

//内部类
class ListNode {
    int val;
    ListNode next = null;
    ListNode(int val) {
        this.val = val;
    }
}
//内部类
class ReverseList1 {
    public ListNode ReverseList(ListNode head) {
        //新链表
        ListNode newHead = null;
        while (head != null) {
            //先保存访问的节点的下一个节点，保存起来
            //留着下一步访问的
            ListNode temp = head.next;
            //每次访问的原链表节点都会成为新链表的头结点，
            //其实就是把新链表挂到访问的原链表节点的
            //后面就行了
            head.next = newHead;
            //更新新链表
            newHead = head;
            //重新赋值，继续访问
            head = temp;
        }
        //返回新链表
        return newHead;
    }

    public static void main(String[] args) {
       //new ReverseList1().ReverseList(new ListNode(5));
    }
}