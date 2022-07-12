package WIA1002LabAssignment.Lab10HashMap.ITheiMa;

/**
 * @author Criss (English name)
 * @Name WEI ZHANG
 * @ID S2004131
 * @Date 2022/6/18
 *
 * extends Comparable
 */


public class MyTreeMap<Key extends Comparable<Key>, Value> {
    //////////////////////
    //inner class
    private class MapNode {
        //MapNode类的成员变量
        //member variables not local variables
        public Key key;
        public Value value;
        public MapNode next;

        public MapNode(Key key, Value value, MapNode next) {
            this.key = key;
            this.value = value;
            this.next = next;
        }
    }
/////////////////////

    //MyHashMap类的成员变量
    //member variables not local variables
    private final MapNode head;//make it final so never change head
    private int size;

    public MyTreeMap() {
        //Initialize variables
        this.head = new MapNode(null, null, null);
        this.size = 0;
    }

    //get the size of MyHashMap
    public int getSize() {
        return size;
    }

    //is empty or not
    public boolean isEmpty() {
        //return getSize()==0;
        return size == 0;
    }

    //put key and value, and 100% can put it successfully
    @Deprecated
    public void putFirst(Key key, Value value) {
        MapNode cur = head;
        while (cur.next != null) {
            cur = cur.next; //move to next
            //if the same key,then just update
            if (key.equals(cur.key)) {
                //update the value
                cur.value = value;
                return;//to end
                //size++; dont need to,just update,not create a new MapNode
            }
        }
        //if no key, then add a newNode and let it be the second MapNode after head
        //create a new MapNode, make head--->newNode-->curNext-->....-->null
        MapNode curNext = head.next;
        MapNode newNode = new MapNode(key, value, curNext);//newNode-->curNext
        head.next = newNode;//head--->newNode

        size++;//even update , also +1
    }


    //put the Node with order of key 根据key的大小排序插入
    public void putOrder(Key key, Value value) {

        //MapNode preNode = this.head;
        MapNode preNode = head;
        MapNode curNode = preNode.next;

/*
* 也不能放在这个位置，不会覆盖，而是多一个节点
*  if (curNode!=null && key.compareTo(curNode.key)==0){
            curNode.value=value;//参数的value赋值给当前节点

            //I just forget to return in order to end the method
            return;
        }
*/
        // if key(参数) > curNode.key , put the K-V(参数) before curNode
        while (curNode!=null && key.compareTo(curNode.key)>0){
            preNode = curNode;// then move to next Node
            curNode = curNode.next;

        /*    // if key(参数) = curNode.key , update the value of curNode
            if (curNode!=null && key.compareTo(curNode.key)==0){
                curNode.value=value;//参数的value赋值给当前节点

                //I just forget to return in order to end the method
                return;
            }*/
        }
 ///////////////////////////////////////////////////////////
 /////////这个要特别注意一下，这个if判断只能放在while 和 new Node之间的代码///////////////////
        // if key(参数) = curNode.key , update the value of curNode
        if (curNode!=null && key.compareTo(curNode.key)==0){
            curNode.value=value;//参数的value赋值给当前节点

            //I just forget to return in order to end the method
            return;
        }


        MapNode newNode = new MapNode(key, value, curNode);//newNode-->curNode
        preNode.next=newNode;// pre--->newNode   --->curNode
        size++;

        /*  不能放在这个位置，不然没起到update覆盖的作用，而是多一个节点
        *  if (curNode!=null && key.compareTo(curNode.key)==0){
            curNode.value=value;//参数的value赋值给当前节点

            //I just forget to return in order to end the method
            return;
        }
*/
    }

    //remove K&V according to key
    public void remove(Key key) {
        MapNode pre = head;
        while (pre.next != null) {
            //pre.next = pre.next.next; //move to next
            //pre.next.key,,find the pre one
            if (key.equals(pre.next.key)) {
                //delete the key and value
//                pre.key = null;
//                pre.value=null;
                MapNode cur = pre.next;//need to delete the cur Node
                pre.next=cur.next;

                size--;
                return;//must end it
            }
            pre= pre.next; //move to next
        }
        // pre.next is always null,because pre.next is already the last one
        //MapNode curNext = pre.next;
    }


/*    @Deprecated
    //remove K&V according to index.. sometimes correct, sometimes not
    public void remove(int index) { //what if the key is Integer ,will confused
        //if (isEmpty()) return; //end it

        MapNode pre = head;
        for (int i = 0; i < index; i++) {
            pre=pre.next;
        }
        MapNode cur = pre.next;
        pre.next=cur.next;

        size--;
    }*/


    public void removeFirst() {

    }

    public void removeLast() {

    }

    public void removeAll() {
        head.next = null;
        size = 0;
    }

    public void displayAll() {
        MapNode cur = head;
        while (cur.next != null) {
            cur = cur.next; //move to next
            System.out.println(cur.key+", "+cur.value);
        }
    }

    //get the value according to the key
    public Value getValue(Key key) {
        MapNode cur = head;
        if (cur.next == null) return null;//better to add first,but can also delete
        while (cur.next != null) {
            cur = cur.next; //move to next
            if (key.equals(cur.key)) {
                //get the value
                return cur.value;
            }
        }
        return null;
    }
}
