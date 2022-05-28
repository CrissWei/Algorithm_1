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
import java.util.Iterator;

//打印一副扑克牌
public class playPoker {
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

        //发牌方法
        sendCard(cardList,DP);
        sendCard(cardList,player1);
        sendCard(cardList,player2);
        sendCard(cardList,player3);

        //排序
        Collections.sort(cardList);
        System.out.println("======");
        System.out.println("排序后："+cardList);
        System.out.println("==========");

        //看牌方法
        lookPoker(player1,"player1");
        lookPoker(player2,"player2");
        lookPoker(player3,"player3");
        lookPoker(DP,"DP");
    }


    private static void lookPoker(ArrayList<String> cardList,String name) {

       /* //遍历集合，用Iterator方法
        Iterator<String> it = cardList.iterator();
        while (it.hasNext()) {
            System.out.print(player+"的牌是："+it.next());
        }*/
        //使用增强for, 不使用Iterator方法遍历



        System.out.print(name + "的牌是：" );
        for (String s : cardList) {
            System.out.print(s);
        }
        System.out.println();
    }

    private static void sendCard(ArrayList<String> cardList, ArrayList<String> player) {
/*
        //遍历集合，用Iterator方法
        Iterator<String> it = cardList.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
            //得到牌
            String pokers = it.next();
            if (Integer.parseInt(it.next())<=3){
                //底牌
                player.add(pokers);
            }
            if (cardList.size() %3 ==0){
                player.add(pokers);
            }
            if (cardList.size() %3 ==1){
                player.add(pokers);
            }
            if (cardList.size() %3 ==2){
                player.add(pokers);
            }
        }
*/

        for (int i = 0; i < cardList.size(); i++) {
            String pokers = cardList.get(i);
            if (i<3){//3张底牌
                player.add(pokers);
            }
            else if (i %3 ==0){
                player.add(pokers);
            }
            else if (i %3 ==1){
                player.add(pokers);
            }
            else if (i %3 ==2){
                player.add(pokers);
            }



        }

    }

}
