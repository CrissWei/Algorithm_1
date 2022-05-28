package Demo5HuaWei.Easy;

import java.util.*;

/*
描述
输入一个只包含小写英文字母和数字的字符串，按照不同字符统计个数由多到少输出统计结果,
如果统计的个数相同，则按照ASCII码由小到大排序输出。

数据范围：字符串长度满足1≤len(str)≤1000

输入描述：一个只包含小写英文字母和数字的字符串。
输出描述：一个字符串，为不同字母出现次数的降序表示。若出现次数相同，则按ASCII码的升序输出。

示例1
输入：aaddccdc
输出：cda

说明：样例里，c和d出现3次，a出现2次，但c的ASCII码比d小，所以先输出c，再输出d，最后输出a.
* */
public class HJ102_countString {
    public static void main(String[] args) {

        method2();
    }

    private static void method2() {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str = sc.next();
            char[] array = str.toCharArray();
            Map<Character, Integer> map = new HashMap<>();
            for (char c : array) {
                if (map.containsKey(c)) {
                    map.put(c, map.get(c) + 1);
                } else {
                    map.put(c, 1);
                }
            }
            List<Map.Entry<Character, Integer>> list = new ArrayList<>(map.entrySet());//改变封装
            //将map 转换成list 排序
            Collections.sort(list, new Comparator<Map.Entry<Character, Integer>>() {
                @Override
                public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
                    if (o1.getValue() < o2.getValue()) {
                        return 1;//返回正数说明 o1 o2 要交换
                    } else if (o1.getValue() == o2.getValue()) {
                        if (o1.getKey() < o2.getKey()) {
                            return -1;
                        } else {
                            return 1;
                        }
                    } else {
                        return -1;//返回负数说明 o1 o2 不要交换
                    }
                }
            });
            for (Map.Entry entry : list) {//注意这里要遍历list
                System.out.print(entry.getKey());
            }
            System.out.println();
        }


    }


}
