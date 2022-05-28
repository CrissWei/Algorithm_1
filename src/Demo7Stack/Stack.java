package Demo7Stack;

public class Stack<T> {
    //记录节点个数
    private int N;
    //记录头结点
    private Node head;
    //定义一个内部类Node
    private class Node {
        public T item;
        public Node next;
        public Node(T item,Node next){
        }
    }

    public Stack() {
        //初始化,不存储任何元素，节点的个数也是0
        this.head=new Node(null,null);
        this.N=0;
    }
    //判断当前Stack内元素是否为空的方法
    public boolean isEmpty(){
        return N==0;
    }
    //获取Stack元素个数
    public int size(){
        return N;
    }
    //弹出栈pop
    public T pop(){
        return null;
    }

    //压栈push
    public void push(T t){
        //找到首结点,指向的第一个结点
        Node oldFirst = head.next;
        //创建新的首结点
        Node newNode = new Node(t ,null);
        //让首结点指向新的首结点
        head.next = newNode ;
        //让新结点指向原来的第一个结点
        newNode.next = oldFirst;
        //元素个数+1 ;
        N++;
    }



}


