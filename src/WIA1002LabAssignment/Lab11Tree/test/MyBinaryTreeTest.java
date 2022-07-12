package WIA1002LabAssignment.Lab11Tree.test;

import WIA1002LabAssignment.Lab11Tree.BinaryTree.MyBinaryTree;

public class MyBinaryTreeTest {
    public static void main(String[] args) {
        MyBinaryTree<Integer, String> tree = new MyBinaryTree<>();

        System.out.println("============Test My API====================");
        System.out.println();
        System.out.println("======size and isEmpty======");
        System.out.println(tree.getSize());
        System.out.println(tree.isEmpty());
        tree.put(1, "朱一");
        tree.put(6, "刘六");
        tree.put(2, "赵二");
        tree.put(5, "王五");
        tree.put(4, "李四");
        System.out.println("======size and isEmpty======");
        System.out.println(tree.getSize());
        System.out.println(tree.isEmpty());
        System.out.println("=====getValue==========");
        System.out.println(tree.getValue(2));
        System.out.println("======delete key=======");
        tree.delete(2);
        System.out.println("=====getValue==========");
        System.out.println(tree.getValue(2));
        System.out.println("======size======");
        System.out.println(tree.getSize());
        System.out.println("========put=========");
        tree.put(3,"张三");
        System.out.println("=====getValue==========");
        System.out.println(tree.getValue(3));
        System.out.println("======size======");
        System.out.println(tree.getSize());

        //为什么max 和 min相反
        System.out.println("======max key======");
        System.out.println(tree.max());
        System.out.println("======min key======");
        System.out.println(tree.min());
    }
}
