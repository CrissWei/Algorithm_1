package GameDouble;
/*
*  经常会遇见这样的问题，如何从一组序列中找出最大的N个数，
* 比如从一个班级的成绩中找出总成绩的前三名。
* 可能会有一个比较简单的做法就是先将这组序列排序，然后前N个值自然而然就得到了。
* 这对于比较少的序列，是可行的，比如前面说的一个班的前三名，
* 但是对于数据量特别庞大的现实应用中，就不太现实了，例如我们经常用到的搜索引擎，
* 它应该不会对她搜到的所有的页面先进行排序然后再返回前N个搜索结果吧，
* 这样的话花费在排序上的时间消耗的也太大了。

    * 对于这样一个问题应该怎么做呢，可以使用一种数据结构--堆。
    * 假如问题是求一个很大的整数序列中的前M个，
    * 我们就可以建立一个最多包含M + 1个元素的堆，然后逐个将序列中的元素插入堆中，
    * 元素插入堆后堆的元素个数大于M，就执行删除最小元素的操作。

* */
import java.util.Arrays;
import java.util.Random;

public class TopM {

    //创建一个内部类MinHeap，是数据结构‘堆’
    private class MinHeap {
        private int M; // 堆中需要保存多少个元素
        private int N; // 堆中实际存在的元素个数
        private int[] heap = null;
        public MinHeap(int M) {
            this.M = M;
            heap = new int[M + 2];
        }
/*1.首先是小根堆的插入函数的实现，很简单，先将元素插入N后，
然后再从N向上调整堆，如果插入元素后N到达堆数组的最后一个位置，
即N == M + 1，先将堆调整好后，再删除最小的元素*/
        private void insert(int x){
            heap[++N] = x;
            swim(N);
            if(N > M)
                delMin();
        }
//2.删除最小元素的操作，delMin，先将堆顶元素返回，
// 然后用堆底元素代替堆顶元素，将N-1，从底部开始向下调整堆，
        private int delMin(){
            int min = heap[1];
            heap[1] = heap[N];
            N--;
            sink(1);
            return min;
        }
//3.向上调整堆
        private void swim(int k) {
            while (k > 1 && heap[k] < heap[k / 2]) {
                exch(k, k / 2);
                k = k / 2;
            }
        }
//4.向下调整堆
        private void sink(int k) {
            while (2 * k <= N) {
                int j = 2 * k;
                if (j < N && heap[j] > heap[j + 1])
                    j++;
                if (heap[k] < heap[j])
                    break;
                exch(k, j);
                k = j;
            }
        }

        private int size() {
            return N;
        }
//交换元素
        private void exch(int i, int j){
            if(i < 0 || j < 0 || i > heap.length || j > heap.length || i == j)
                return;
            int t = heap[i];
            heap[i] = heap[j];
            heap[j] = t;
        }

        public String toString() {
            String str = N + " : [";
            for (int i = 1; i <= N; i++) {
                str += heap[i] + ",";
            }
            str += "]";
            return str;
        }
    }

    public void topM(int[] a, int M) {
        MinHeap minHeap = new MinHeap(M);
        for (int i = 0; i < a.length; i++) {
            minHeap.insert(a[i]);
        }
        System.out.println(minHeap);
    }

    public static int[] generateArray(int length) {
        Random rand = new Random(47);
        int[] a = new int[length];
        for (int i = 0; i < length; i++) {
            a[i] = rand.nextInt(length);
        }
        return a;
    }

    public static void main(String[] args) {
        int length = 20;
        int M = 3;
        int[] a = generateArray(length);
        System.out.println(Arrays.toString(a));
        new TopM().topM(a, M);
    }
}
