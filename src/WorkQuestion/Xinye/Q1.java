package WorkQuestion.Xinye;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            String s = in.nextLine();
            int i = lengthOfLongestSubstring(s);
            System.out.println(i);
        }

    }

    private static int lengthOfLongestSubstring(String s ) {
        int sl = s.length();
        int ml = 0;
        Map<Character,Integer> map = new HashMap<>();
        for (int i = 0,j=0; j<sl; j++) {
            if (map.containsKey(s.charAt(j))) {
                i = Math.max(map.get(s.charAt(j)),i);
            }
            ml = Math.max(ml,j-i+1);
            map.put(s.charAt(j),j+1);
        }
        return ml;
    }
}
