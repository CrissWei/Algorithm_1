package WorkQuestion.Erlang;

import java.util.Arrays;
//对任意2个类型数据排序
public class q3 {
    public static<T extends Comparable<T>> void BubbleSort(T[] arr) {
        boolean sorted = true;
        int len = arr.length;
        for(int j=0;j<len-1;j++)
        {
            sorted = true;
            for(int i=0;i<len-1-j;i++)
            {
                if(((Comparable)arr[i]).compareTo(arr[i+1])>0)
                {
                    T  temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    sorted = false;
                }
            }
            if(sorted)
            {
                break;
            }
        }
        System.out.println(Arrays.toString(arr));
    }


}
