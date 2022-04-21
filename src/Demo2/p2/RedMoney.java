package Demo2.p2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/*
* 描述
春节期间小明使用微信收到很多个红包，非常开心。
在查看领取红包记录时发现，某个红包金额出现的次数超过了红包总数的一半。
请帮小明找到该红包金额。写出具体算法思路和代码实现，要求算法尽可能高效。

给定一个红包的金额数组 gifts 及它的大小 n ，请返回所求红包的金额。
若没有金额超过总数的一半，返回0。

数据范围：1≤n≤1000, 红包金额满足 1≤gift≤100000

* 示例1
输入：[1,2,3,2,2],5
返回值：2

示例2
输入：[1,1,2,2,3,3],6
返回值：0
* */
public class RedMoney {
    public static void main(String[] args) {
    /*    //红包的大小 n
        int[] n =new int[1000];

        Random random = new Random();
        for (int i = 0; i < n.length; i++) {
            int money = random.nextInt(100000)+1;
            n[i]=money;

            if (n[i]>n.length/2){
                System.out.println("太难了，根本不会写啊");
            }
        }*/

        int[] gifts= new int[100000];
        int n =1000;

        //System.out.println( getValue(gifts,n));

        getValue2(gifts,n);



    }

    private static int getValue(int[] gifts, int n) {
        Map<Integer, Integer> m = new HashMap<>();
        for(int i = 0; i < gifts.length; ++i){
            if(m.containsKey(gifts[i])){
                m.put(gifts[i], m.get(gifts[i]) + 1);
            }else{
                m.put(gifts[i], 1);
            }
            //超过一半就返回
            if(m.get(gifts[i]) > gifts.length/2){
                return gifts[i];
            }
        }
        return 0;
    }

    public static int getValue2(int[] gifts, int n) {
        Arrays.sort(gifts);
        int ans = gifts[n/2];
        int num = 0;
        for(int i = 0; i < gifts.length; i++) {
            if(gifts[i] == ans) {
                num++;
            }
        }
        return num <= n/2 ? 0 : ans;

    }
}
