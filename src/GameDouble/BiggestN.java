package GameDouble;

public class BiggestN {
    //从数组a里，找出前N个最大的。如果是a[100],则start = 0， end = 99.注意这个索 引问题
    void main (int a[], int start, int end, int N) {
        int mid = (start + end)/2;

        int i = start, j = end;

        while(i<j)

        {
            while(i<j && a[i]<=a[mid])

                i++;

            while(i<j && a[j]>=a[mid])

                j--;

            swap(a[i], a[j]);

        }
        /*注意这个while出来之后，i一定是等于j的，且从i 到 end是较大的那一端*/

        if(end-i+1 == N)

            return;

        if(end - i+1 > N)

            findMaxN(a, i, end, N);

        else

            findMaxN(a, start, i, N - (end -i +1));

    }

    private void findMaxN(int[] a, int i, int end, int n) {
        //快速排序方法
    }

    void swap(int a, int b) {

        int temp = a;

        a = b;

        b= temp;
    }

}
