package WIA1002LabAssignment.Lab8Graph.ITHeiMa.test;

import WIA1002LabAssignment.Lab8Graph.ITHeiMa.MyGraphs.DepthFirstSearch;
import WIA1002LabAssignment.Lab8Graph.ITHeiMa.MyGraphs.MyUndirectedGraph;

public class DFS_graphTest {
    public static void main(String[] args) {
        MyUndirectedGraph graph = new MyUndirectedGraph(13);

        graph.addEdge(0,5);
        graph.addEdge(0,1);
        graph.addEdge(0,2);
        graph.addEdge(0,6);
        graph.addEdge(5,3);
        graph.addEdge(5,4);
        graph.addEdge(3,4);
        graph.addEdge(4,6);

        graph.addEdge(7,8);

        graph.addEdge(9,11);
        graph.addEdge(9,10);
        graph.addEdge(9,12);
        graph.addEdge(11,12);

        //DFS对象
        DepthFirstSearch search = new DepthFirstSearch(graph,0);

        //测试与某个顶点相通的顶点数量
        System.out.println("====与顶点0相连通的顶点数量===="+search.getCount());

        //测试某个顶点是否与起点相同
        System.out.println("====测试顶点0和顶点5是否想连通===="+search.isMarker(5));
        System.out.println("====测试顶点0和顶点7是否想连通===="+search.isMarker(7));


    }
}
