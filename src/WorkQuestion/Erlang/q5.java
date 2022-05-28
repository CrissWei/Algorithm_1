package WorkQuestion.Erlang;

public class q5 {
    static class basket {
        int no;

        basket(int no) {
            this.no = no;
        }
    }
    // A class that uses Car objects
    class Main {
        // 交换 egg and apple
        public static void swap(basket egg, basket apple) {
            int temp = egg.no;
            egg.no = apple.no;
            apple.no = temp;
        }
        public static void main(String[] args) {
            basket egg = new basket(1);
            basket apple = new basket(2);
            swap(egg, apple);
            System.out.println("egg.no = " + egg.no);
            System.out.println("apple.no = " + apple.no);
        }
    }
}
