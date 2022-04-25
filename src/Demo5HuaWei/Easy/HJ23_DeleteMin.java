package Demo5HuaWei.Easy;

import java.util.*;

/*
* 描述
删除字符串中出现次数最少的字符，若出现次数最少的字符有多个，则把出现次数最少的字符都删除。

输出删除这些单词后的字符串，字符串中其它字符保持原来的顺序。

数据范围：输入的字符串长度满足1≤n≤20 ,保证输入的字符串中仅出现小写字母

* 输入描述：
字符串只包含小写英文字母, 不考虑非法输入，输入的字符串长度小于等于20个字节。
* 输出描述：
删除字符串中出现次数最少的字符后的字符串。

示例1
输入：aabcddd
输出：aaddd
* */
public class HJ23_DeleteMin {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       /* //由于需要删除操作，而数组不能删除，所以采用集合  【集合也没map好】
        ArrayList<Character> ch = new ArrayList<>();*/
        HashMap<Character,Integer> hm = new HashMap<>();
        while (in.hasNext()){
            String str = in.nextLine();
            char[] chars = str.toCharArray();
            for (char key : chars) {
                //根据key 得到value
                Integer value = hm.get(key);
                if (value==null){
                    //把数组元素全部添加的map集合
                    hm.put(key,1);
                }else {
                    //统计每一个char的个数
                    value++;
                    hm.put(key,value);
                }
            }
            //遍历map
            Set<Character> keys = hm.keySet();
            for (Character allKeys : keys) {
                Integer allValues = hm.get(allKeys);
                //System.out.println(allKeys+"的个数是："+allValues);
            }

            //取出最小出现次数，并排序，排序后的数组第一个数为最小值
            Collection<Integer> value2 = hm.values();
            Object[] array1 = value2.toArray();
            Arrays.sort(array1);
            int  min =(Integer) array1[0];


            String str2="";
            for (int i = 0; i < chars.length; i++) {
                //如果和最小值不相等，则拼接到字符串便于输出
                if(hm.get(chars[i]) > min) str2 += chars[i];
            }
            System.out.println(str2);

        }


    }
}
