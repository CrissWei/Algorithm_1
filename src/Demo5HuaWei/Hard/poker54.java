package Demo5HuaWei.Hard;
//打印一副扑克牌
public class poker54 {
    public static void main(String[] args) {
        String [] colors = {"♠","♥","♣","♦"};
        String [] numbers = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
        for (String color : colors) {
            for (String number : numbers) {
                System.out.print(color+number+"\t");
            }
            System.out.println();
        }
        System.out.println("JOKER"+"\t"+"joker");
    }

}
