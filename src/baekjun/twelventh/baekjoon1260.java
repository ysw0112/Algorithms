package baekjun.twelventh;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class baekjoon1260 {
    public static int N, M, V;
    public static int x, y;

    public static int[][] graph = new int[1001][1001];
    public static boolean visited[] = new boolean[10001];

    public static void DFS(int V){
        System.out.print(V + " ");
        visited[V] = true;

        for(int i=1; i<=N; i++){
            if(graph[V][i] == 1 && visited[i] == false){
                DFS(i);
            }
        }
    }

    public static void BFS(int V){
        visited = new boolean[10001];
        Queue<Integer> q = new LinkedList<>();

        q.offer(V);
        visited[V] = true;

        while(!q.isEmpty()){
            int temp = q.poll();
            System.out.print(temp + " ");
            for(int i=1; i<=N; i++){
                if(graph[temp][i] == 1 && visited[i] == false){
                    q.offer(i);
                    visited[i] = true;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String inputValue[] = br.readLine().split(" ");
        N = Integer.parseInt(inputValue[0]);
        M = Integer.parseInt(inputValue[1]);
        V = Integer.parseInt(inputValue[2]);

        for(int i=1; i<=M; i++){
            String value[] = br.readLine().split(" ");
            x = Integer.parseInt(value[0]);
            y = Integer.parseInt(value[1]);
            graph[x][y] = graph[y][x] = 1;
        }

        DFS(V);
        System.out.println();
        BFS(V);

    }
}
