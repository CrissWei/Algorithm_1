package WorkQuestion.Erlang;

public class q2 {
    //判读一个数是不是2的N 次幂
    public static boolean isPowerOfTwo(int n) {
        //如果n小于0，那肯定不是
        if(n<=0){
            return false;
        }
        //计数器，每次+1
        int count=0;

        while(n!=0){
            if((n&1)==1){
                count++;
            }
            if(count>1){
                return false;
            }
            n=n>>1;
        }
        return true;

    }
}
