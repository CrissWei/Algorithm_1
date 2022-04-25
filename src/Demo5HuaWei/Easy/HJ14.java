package Demo5HuaWei.Easy;



import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
    public class HJ14 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();

            times(num);
        }

        public static void times(int num){
            Set<String> set = new TreeSet<>();
            Scanner sc = new Scanner(System.in);
            for (int i = 0; i < num; i++) {
                String ss = sc.nextLine();
                set.add(ss);
            }
            for (String s : set) {
                System.out.println(s+"");
            }
        }


}
