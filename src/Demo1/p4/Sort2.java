package Demo1.p4;
import java.util.*;
public class Sort2 {
        public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);
            while(scanner.hasNext()){
                int length = Integer.valueOf(scanner.nextLine());
                String[] strs = new String[length];
                for(int i =0; i<strs.length;i++){
                    strs[i] = scanner.nextLine();
                }
                Arrays.sort(strs);
                for(String v : strs){
                    System.out.println(v);
                }
            }
        }
}
