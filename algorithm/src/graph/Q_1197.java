package graph;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Q_1197 {

    static class Edge implements Comparable<Edge>{
        int to; //간선의 도착 정점
        int weight;// 간선의 가중치

        public Edge(int to, int weight){
            this.to = to;
            this.weight = weight;
        }

        @Override
        public int compareTo(Edge o) {
            return Integer.compare(this.weight, o.weight);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int v = sc.nextInt();
        int e =  sc.nextInt();

        List<List<Edge>> graph = new ArrayList<>();
        for (int i = 0; i <= v; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < e; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int w = sc.nextInt();
            //무방향 그래프 양쪽 추가
            graph.get(a).add(new Edge(b, w));
            graph.get(b).add(new Edge(a, w));
        }

        long min = 0;
        boolean[] visited = new boolean[v + 1];

        PriorityQueue<Edge> pq = new PriorityQueue<>();
        pq.add(new Edge(1, 0)); // 1번 정점부터 시작

        int visitedCount = 0;
        while (!pq.isEmpty() &&  visitedCount < v) {
            Edge edge = pq.poll();

            int to = edge.to;
            int weight = edge.weight;

            if (visited[to]) {
                continue;
            }

            visited[to] = true;
            min +=  weight;
            visitedCount++;

            for (Edge neighbor : graph.get(to)) {
                if (!visited[neighbor.to]) {
                    pq.add(neighbor);
                }
            }
        }
        System.out.println(min);
        sc.close();
    }
}
