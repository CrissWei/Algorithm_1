package Demo3HeiMa.P226;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

/*
*
* 案例:统计字符串中每个字符出现的次数
需求:键盘录入一个字符串，要求统计字符串中每个字符串出现的次数。
举例:键盘录入“aababcabcdabcde”
在控制台输出:a(5)b(4)c(3)d(2)e(1)

* 分析:
我们可以把结果分成几个部分来看:a(5),b(4),c(3),d(2),e(1)
* 每一个部分可以看成是:字符和字符对应的次数组成
这样的数据，我们可以通过HashMap集合来存储，键是字符，值是字符出现的次数

* 注意: 键key是字符，类型应该是Character,
        值value是字符出现的次数，类型应该是Integer

* =============
* 思路:
    1.键盘录入一个字符串
    2.创建HashMap集合,键是Character，值是Integer
    3.遍历字符串,得到每一个字符
    4.拿得到的每一个字符作为键key到HashMap集合中去找对应的值，看其返回值
        如果返回值是null:说明该字符在HashMap集合中不存在，就把该字符作为键，1作为值存储
        如果返回值不是null:说明该字符在HashMap集合中存在，把该值加1，然后重新存储该字符和对应的值
    5.遍历HashMap集合，得到健和值,按照要求进行拼接
    6.输出结果

*/
public class StringCount {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String line = in.nextLine();

        //HashMap<Character,Integer> map = new HashMap<>();
        TreeMap<Character,Integer> map = new TreeMap<>();


        for (int i = 0; i < line.length(); i++) {
            char key = line.charAt(i);
            //map.put(key,count);

            //根据key找对应的单个value
            Integer value = map.get(key);

            if (value==null){
                map.put(key,1);
            }else {
                value++;
                map.put(key,value);
            }

          /*  if (map.containsKey(keys)){
                count++;
            }*/

            //System.out.println(key+"======="+value);
            //System.out.println(count);
        }

        StringBuilder sb = new StringBuilder();

        //得到all keys集合
        Set<Character> keys = map.keySet();
        for (Character key : keys) {
            //根据 all keys得到all values
            Integer values2 = map.get(key);

            sb.append(key).append("(").append(values2).append(")");
        }
        System.out.println(sb.toString());
    }
}
