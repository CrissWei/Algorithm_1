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

//打印一副扑克牌
public class playPoke2 {
    public static void main(String[] args) {
        //定义一个集合用来存牌
        ArrayList<String> cardList = new ArrayList<>();
        String [] colors = {"♠","♥","♣","♦"};
        String [] numbers = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
        for (String color : colors) {
            for (String number : numbers) {
                System.out.print(color+number+"\t");
                cardList.add(color+number);
            }
            System.out.println();
        }
        System.out.println("JOKER"+"\t"+"joker");

        cardList.add("JOKER");
        cardList.add("joker");

        //开始定义玩家
        ArrayList<String> DP = new ArrayList<>();
        ArrayList<String> player1 = new ArrayList<>();
        ArrayList<String> player2 = new ArrayList<>();
        ArrayList<String> player3 = new ArrayList<>();


        //洗牌
        Collections.shuffle(cardList);
        System.out.println("===============");
        System.out.println("洗完牌: "+cardList);
        System.out.println("===========================");

        //把牌分成4份，玩家1，2，3和底牌
        for (int i = 0; i < cardList.size(); i++) {
            String pokers = cardList.get(i);
            if (i<3){//3张底牌
                DP.add(pokers);
            }
            else if (i %3 ==0){
                player1.add(pokers);
            }
            else if (i %3 ==1){
                player2.add(pokers);
            }
            else if (i %3 ==2){
                player3.add(pokers);
            }

        }


        //排序
        Collections.sort(cardList);
        System.out.println("======");
        System.out.println("排序后："+cardList);
        System.out.println("==========");

        //没办法给牌排序，用TreeSet和map
//        Collections.sort(player1);
//        Collections.sort(player2);
//        Collections.sort(player3);
//        Collections.sort(DP);

        //看牌方法
        lookPoker(player1,"player1");
        lookPoker(player2,"player2");
        lookPoker(player3,"player3");
        lookPoker(DP,"DP");
    }


    private static void lookPoker(ArrayList<String> cardList,String name) {

        System.out.print(name + "的牌是：" );
        for (String s : cardList) {
            System.out.print(s+" ");
        }
        System.out.println();
    }


    private static void sendCard(ArrayList<String> cardList, ArrayList<String> player) {
    }

}
