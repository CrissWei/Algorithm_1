package Demo10HuaWei;

public class TestReplaceAll {
    public static void main(String[] args) {
        String str = "hello mother fo you!";
        System.out.println(str.length());
        String o = str.replaceAll("o", "");
        System.out.println(o);
        System.out.println(o.length());


    }
}
