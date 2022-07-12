package WIA1002LabAssignment.Lab8Graph.ITHeiMa.MyGraphs;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Criss (English name)
 * @Name WEI ZHANG
 * @ID S2004131
 * @Date 2022/6/18
 * @Link :https://www.bilibili.com
 * /video/BV1Cz411B7qd?p=147&vd_source=c847fa2ae2fbd6ecb3e53cb9b75790b2
 */

public class MyUndirectedGraph {

    //number of vertex 顶点数量
    private final int vertex;//why final here?
    //number of edge 边数量
    private int edge;
    //邻接表 adjacency list
    private LinkedList<Integer>[] adj;

    public MyUndirectedGraph(int vertex){
        //初始化 顶点，边，和邻接矩阵.
        this.vertex=vertex;
        this.edge=0;
        this.adj = new LinkedList[vertex];

        for (int i = 0; i < adj.length; i++) {
            adj[i] = new LinkedList<Integer>();
        }
    }

  /*  不要写这个
    public MyUndirectedGraph(int vertex, int edge, LinkedList<Integer>[] adj) {
        this.vertex = vertex;
        this.edge = edge;
        this.adj = adj;
    }*/

    //get number of vertex
    public int getVertex() {
        return vertex;
    }
    //get number of edges
    public int getEdge(){
        return edge;
    }

    //add a edge : "from" --> "arrive"
    //public void addEdge(String from, String arrive){ }
    public void addEdge(int from, int arrive){
        adj[from].add(arrive);
        adj[arrive].add(from);
        edge++;
    }

    //get all vertex which next to vertex(Param) 获取和参数顶点相邻的所有顶点
    public LinkedList<Integer> adj(int vertex){
        return adj[vertex];
    }
}
