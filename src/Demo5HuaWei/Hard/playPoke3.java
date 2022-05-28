package Demo5HuaWei.Hard;
/*
* 案例:模拟斗地主
需求:通过程序实现斗地主过程中的洗牌，发牌和看牌
    思路:
        1.创建一个牌盒，也就是定义一个集合对象，用ArrayList集合实现
        2.往牌盒里面装牌
        3.洗牌，也就是把牌打乱，用Collections的shuffle()方法实现
        4.发牌，也就是遍历集合，给三个玩家发牌
        5.看牌，也就是三个玩家分别遍历自己的牌

* */

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeMap;
import java.util.TreeSet;

//打印一副扑克牌
public class playPoke3 {
    public static void main(String[] args) {
        //定义一个map来存索引和对应的牌，为了排序索引
        TreeMap<Integer, String> map = new TreeMap<>();
        int index = 0;

        //定义一个集合用来存牌
        ArrayList<Integer> cardList = new ArrayList<>();
        String[] colors = {"♠", "♥", "♣", "♦"};
        String[] numbers = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K","A","2"};

        //TMD巨坑啊，必须先for数字，然后for颜色才能有序啊
        for (String number : numbers) {
            for (String color : colors) {
                //存map
                map.put(index, color+number);
                //把索引存ArrayList
                cardList.add(index);
                index++;
            }
        }
        map.put(index, "小王");
        cardList.add(index);
        index++;
        map.put(index, "大王");
        cardList.add(index);

        //洗牌
        Collections.shuffle(cardList);

        //开始定义玩家
        TreeSet<Integer> DP = new TreeSet<>();
        TreeSet<Integer> player1 = new TreeSet<>();
        TreeSet<Integer> player2 = new TreeSet<>();
        TreeSet<Integer> player3 = new TreeSet<>();



        //把牌分成4份，玩家1，2，3和底牌
        for (int i = 0; i < cardList.size(); i++) {
            Integer pokers = cardList.get(i);
            if (i < 3) {//3张底牌
                DP.add(pokers);
            } else if (i % 3 == 0) {
                player1.add(pokers);
            } else if (i % 3 == 1) {
                player2.add(pokers);
            } else if (i % 3 == 2) {
                player3.add(pokers);
            }

        }

        //排序
        Collections.sort(cardList);

        //看牌方法
        lookPoker(player1, "player1",map);
        lookPoker(player2, "player2",map);
        lookPoker(player3, "player3",map);
        lookPoker(DP, "DP",map);
    }


    private static void lookPoker(TreeSet<Integer> cardList, String name, TreeMap<Integer,String> map) {
        System.out.print(name + "的牌是：");
        for (Integer index : cardList) {
            String value = map.get(index);
            System.out.print(value+" ");
        }
        System.out.println();
    }

}
