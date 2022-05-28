package WorkQuestion.Erlang;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class q1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 1; i <= 10; i++)
            list.add(i);
        System.out.println("打乱前：");
        System.out.println(list);
        Collections.shuffle(list);
        System.out.println("打乱后：");
        System.out.println(list);
    }
}
