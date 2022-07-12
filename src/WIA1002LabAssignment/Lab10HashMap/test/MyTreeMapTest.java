package WIA1002LabAssignment.Lab10HashMap.test;

import WIA1002LabAssignment.Lab10HashMap.ITheiMa.MyTreeMap;

/**
 *
 *  * @author Criss (English name)
 *  * @Name WEI ZHANG
 *  * @ID S2004131
 *  * @Date 2022/6/18
 *  *
 *  *extends Comparable
 *
 */

public class MyTreeMapTest {
    public static void main(String[] args) {
        MyTreeMap<Integer, String> map1 = new MyTreeMap<>();
        MyTreeMap<Integer, String> map2 = new MyTreeMap<>();
        System.out.println("============Test My API====================");
        System.out.println();
        System.out.println("======size and isEmpty======");
        System.out.println(map1.getSize());
        System.out.println(map1.isEmpty());
        map1.putOrder(1, "朱一");
        map1.putOrder(6, "刘六");
        map1.putOrder(2, "赵二");
        map1.putOrder(5, "王五");
        map1.putOrder(3, "张三");
        map1.putOrder(4, "李四");
        System.out.println("======size and isEmpty======");
        System.out.println(map1.getSize());
        System.out.println(map1.isEmpty());
        System.out.println("======display=======");
        map1.displayAll();
        System.out.println("=======put 3,\"张三\"======");
        map1.putOrder(3, "张三");
        System.out.println("======size=====");
        System.out.println(map1.getSize());
        System.out.println("=============");
        System.out.println("======display=======");
        map1.displayAll();
        System.out.println("======remove key=======");
        map1.remove(1);
        map1.remove(6);
        System.out.println("======size=====");
        System.out.println(map1.getSize());
        System.out.println("======display=======");
        map1.displayAll();



        System.out.println("=======update 3,\"张维\"======");
        map1.putOrder(3, "张维");
        System.out.println("======size=====");
        System.out.println(map1.getSize());
        System.out.println("=============");
        System.out.println("======display=======");
        map1.displayAll();
        System.out.println("============Done==========");
    }
}
