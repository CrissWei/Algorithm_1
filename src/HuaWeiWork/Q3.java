package HuaWeiWork;
import java.util.*;
public class Q3 {
        /**
         * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
         * 将给定数组排序
         * @param arr int整型一维数组 待排序的数组
         * @return int整型一维数组
         */
        public int[] MySort (int[] arr) {
            // write code here
            int[]result = new int[arr.length];
            Arrays.sort(arr);
            for(int i =0;i<=arr.length;i++ ){
                result[i]= arr[i];
            }
            return result ;
        }
}
