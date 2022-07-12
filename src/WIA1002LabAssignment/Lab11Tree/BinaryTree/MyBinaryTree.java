package WIA1002LabAssignment.Lab11Tree.BinaryTree;


/**
 * @author Criss (English name)
 * @Name WEI ZHANG
 * @ID S2004131
 * @Date 2022/6/18
 * @Link :https://www.bilibili.com
 * /video/BV1Cz411B7qd?p=83&vd_source=c847fa2ae2fbd6ecb3e53cb9b75790b2
 */


public class MyBinaryTree<Key extends Comparable<Key>, Value> {

    //inner TreeNode class
    private class TreeNode {
        public Key key;
        private Value value;//public Value value;
        public TreeNode left;
        public TreeNode right;

        public TreeNode(Key key, Value value, TreeNode left, TreeNode right) {
            this.key = key;
            this.value = value;
            this.left = left;
            this.right = right;
        }
    }


    private TreeNode root;
    private int size;

    //method to get the size of tree
    public int getSize() {
        return size;
    }
    public boolean isEmpty() {
        //return getSize()==0;
        return size == 0;
    }

    public TreeNode getRoot() {
        return root;
    }


    //put K-V into the tree
    public void put(Key key, Value value) {
        //调用下面的private私有put方法
        root = put(root, key, value);

    }

    //【Not public】put K-V into the x tree, and return the x tree
    //在指定的 X树 里面，添加KV
    private TreeNode put(TreeNode x, Key key, Value value) {
 /*    //如果x子树为空

        //如果x子树不为空, 比较x结点的键和key的大小∶
            //如果key小于x结点的键﹐则继续找x结点的左子树
            //如果key大于x结点的键﹐则继续找x结点的右子树
            //如果key等于x结点的键﹔则替换x结点的值为value即可
            */

        //如果x子树为空,直接添加节点
        if (x == null) {
            size++;
            TreeNode root = new TreeNode(key, value, null, null);
            return root;
        }

        //如果x子树不为空, 比较x结点的键和key的大小∶
        int cpm = key.compareTo(x.key);
        if (cpm < 0) {
            //如果key小于x结点的键﹐则继续找x结点的左子树
            x.right = put(x.right, key, value);
        } else if (cpm > 0) {
            //如果key大于x结点的键﹐则继续找x结点的右子树
            x.left = put(x.left, key, value);
        } else {
            //如果key等于x结点的键﹔则替换x结点的值为value即可
            x.value = value;
        }
        return x;
    }

    //delete K-V according the key
    public void delete(Key key) {
        delete(root, key);//调用下面的重载overload方法
    }

    //delete K-V according the key in the x tree
    //在指定的 X树 里面，删除key对应的value,并且返回删除后的新树
    public TreeNode delete(TreeNode x, Key key) {
        if (x == null) return null;

        int cpm = key.compareTo(x.key);
        if (cpm > 0) x.right = delete(x.right, key);
        else if (cpm < 0) x.left = delete(x.left, key);
        else { // 若左边节点是空，返回右边节点，反之亦然.
            size--;

            if (x.right == null) return x.left;
            if (x.left == null) return x.right;

            //找到右子树中最小的节点minNodeOfRight,去替换删掉的节点,保证删除后仍然是右边的key > 左边key
            TreeNode minNode = x.right;
            while (minNode.left != null) {
                minNode = minNode.left;
            }
            //删除右子树中最小节点
            TreeNode n = x.right;
            while (n.left != null) {
                if (n.left.left == null) {
                    n.left = null;
                } else {
                    n = n.left;
                }
            }

            minNode.left = x.left; //让X结点的左子树成为minNode的左子树
            minNode.right = x.right;  //让x结点的右子树成为minNode的右子树
            x = minNode; //让x结点的父结点指向minNode

            //size--;
        }
        return x;
    }

    /*
     * 查询方法getValue实现思想:从根节点开始:
     * 1.如果要查询的key小于当前结点的key，则继续找当前结点的左子结点;
     * 2.如果要查询的key大于当前结点的key，则继续找当前结点的右子结点;
     * 3.如果要查询的key等于当前结点的key，则树中返回当前结点的value。
     * */
    // getValue according the key
    public Value getValue(Key key) {
        return getValue(root, key); //调用下面的重载overload方法
    }

    //【Not public】getValue according the key in the x tree, and return the x tree value
    private Value getValue(TreeNode x, Key key) {
       /*   //如果x子树为空
        if (x==null) return null;

        //如果x子树不为空, 比较x结点的键和key的大小∶
      int cpm = key.compareTo(x.key);
        if (cpm<0){
            //如果key小于x结点的键﹐则继续找x结点的左子树
            return getValue(x.right,key);
        }else if (cpm>0){
            //如果key大于x结点的键﹐则继续找x结点的右子树
            return getValue(x.left,key);
        }else {
            //如果key等于x结点的键,则找到了，直接返回x结点的值value即可
            return x.value;
        }*/

        //一样的代码，可以简化一点
        if (x == null) return null;
        int cpm = key.compareTo(x.key);
        if (cpm < 0) return getValue(x.right, key);
        else if (cpm > 0) return getValue(x.left, key);
        else return x.value;
    }


    //查找整棵树的最小值
    public Key min(){
        //调用下面的重载load私有方法
       return min(root).key;
    }
    private TreeNode min(TreeNode tree){
        //一直递归找左子树，until null，那么当前节点就是最左边的节点，也就是最小key
        if (tree.left!=null) return min(tree.left);//递归调用查找最小的key
        else return tree;
    }

    //查找整棵树的最大值
    public Key max(){
        return max(root).key;
    }
    private TreeNode max(TreeNode tree) {
        if (tree.right!=null) return max(tree.right);
        else return tree;
    }


}
