package Demo1.p1toCharAarray;
import java.util.*;
public class Main2{
    public static void main(String[] arg){
        HashMap<String,Integer> map=new HashMap<>();
        map.put("abc",2);
        map.put("def",3);
        map.put("ghi",4);
        map.put("jkl",5);
        map.put("mno",6);
        map.put("pqrs",7);
        map.put("tuv",8);
        map.put("wxyz",9);
        Scanner sc=new Scanner(System.in);
        String line=sc.next();
        char[] chars = line.toCharArray();
        for(char ch:chars){
            if(ch>='A'&&ch<='Z'){
                if((ch+32)=='z'){
                    System.out.print('a');
                }else{
                    System.out.print((char)(ch+33));
                }
            }else if(ch>='a'&&ch<='z'){
                final Character cF=ch;
                String key= map.keySet().stream().filter(o->o.contains(cF.toString())).findAny().get();
                System.out.print(map.get(key));
            }else{
                System.out.print(ch);
            }
        }
    }
}