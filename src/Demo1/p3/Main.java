package Demo1.p3;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        Set<Integer> integers = new TreeSet<>();

        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) {
            integers.add(scanner.nextInt());
            System.out.println(integers);
        }
    }
}
