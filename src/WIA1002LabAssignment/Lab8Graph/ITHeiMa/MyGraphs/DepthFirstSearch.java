package WIA1002LabAssignment.Lab8Graph.ITHeiMa.MyGraphs;

public class DepthFirstSearch {
    private boolean[] marked;
    private int count;

    public DepthFirstSearch(MyUndirectedGraph graph , int vertex){
        this.count=0;//初始化跟顶点s想通的顶点数量
        this.marked = new boolean[graph.getVertex()];//初始化marked数组
        dfs(graph,vertex);//调用下面的private内的 dfs方法
    }
    private void dfs(MyUndirectedGraph graph, int vertex){
        marked[vertex] =true;
        for (Integer w : graph.adj(vertex)) {
            //如果当前顶点没被搜索过，则递归
            if (!marked[w]) dfs(graph,w);//递归调用
        }
        count++;
    }
    //判断顶点w和顶点vertex是否相连通
    public boolean isMarker(int w ){
        return marked[w];
    }

    //获取与vertex相连通的所有顶点个数
    public int getCount() {
        return count;
    }
}
