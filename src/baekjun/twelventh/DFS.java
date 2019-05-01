package baekjun.twelventh;

import java.util.Iterator;
import java.util.LinkedList;

public class DFS {

    private int V;
    private LinkedList<Integer> adj[];

    DFS(int v){
        V = v;
        adj = new LinkedList[v];
        for(int i=0; i<v; i++) {
            adj[i] = new LinkedList<>();
        }
    }

    void addEdge(int v, int w){ adj[v].add(w); }

    void DFSUtil(int v, boolean visited[]){
        // 현재 노드를 방문한 것으로 표시하고 값을 출력
        visited[v] = true;
//        System.out.println(v + " ");

        // 방문한 노드와 인접한 모든 노드를 가져온다(여기에서 오름차순 내림차순 정할 수 있을듯?)
        Iterator<Integer> i = adj[v].listIterator();
        while (i.hasNext()) {
            System.out.print(v + " ");
            int n = i.next();
            System.out.println(n);
            // 방문하지 않는 노드면 해당 노드를 시작 노드로 다시 해당 메소드 재귀 호출
            if(!visited[n]) DFSUtil(n, visited);
        }
    }

    void DFSstart(int v){
        boolean visited[] = new boolean[V];

        DFSUtil(v, visited);
    }

    void DFSstart(){
        boolean visited[] = new boolean[V];

        for (int i=0; i<V; i++){
            if(!visited[i]) DFSUtil(i, visited);
        }
    }

    public static void main(String[] args){
        DFS g = new DFS(4);

        g.addEdge(0,1);
        g.addEdge(0,2);
        g.addEdge(1,2);
        g.addEdge(2,0);
        g.addEdge(2,3);
        g.addEdge(3,3);

//        g.DFS(2);
        g.DFSstart();
    }
}
