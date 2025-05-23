package algorithm.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class n1753 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static LinkedList<Node> list[];
    static int distance[];
    static boolean visit[];
    
    public static void main(String[] args) throws IOException{
        StringTokenizer st = new StringTokenizer(br.readLine());
        int V = Integer.parseInt(st.nextToken());   //정점
        int E = Integer.parseInt(st.nextToken());   //간선
        int start = Integer.parseInt(br.readLine());    //시작점
        visit = new boolean[V+1];   //방문 여부
        list = new LinkedList[V+1]; //방향 그래프
        distance = new int[V+1];    //가중치

        Arrays.fill(distance, -1);  //가중치를 -1로 모두 채움
        for(int i = 1; i <= V;i++){ //list를 연결리스트로 선언
            list[i] = new LinkedList<Node>();
        }
        for(int i=0;i< E; i++){ //간선 갯수만큼 list에 넣는다.
            st = new StringTokenizer(br.readLine());
            int v1 = Integer.parseInt(st.nextToken());
            int v2 = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            list[v1].add(new Node(v2, w));
        }

        dik(start);
        StringBuilder sb = new StringBuilder();
        for(int i=1; i<= V; i++){
            sb.append(distance[i] == -1 ? "INF" : distance[i]).append("\n");
        }
        System.out.print(sb.toString());
    }

    public static void dik(int start){
        PriorityQueue<Node> pq = new PriorityQueue<>();
        pq.offer(new Node(start, 0));   //시작점, 가중치 0
        distance[start] = 0;    //첫 정점 가중치를 0으로 초기화

        while(!pq.isEmpty()){   
            Node now = pq.poll();   //now에 시작점, 가중치 0을 넣고 우선순위 큐에서 삭제.

            if(!visit[now.number]){ //시작점의 방문 여부가 false이면
                visit[now.number] = true;   //방문으로 만들고
                for(Node next : list[now.number]){  
                    if(distance[next.number] == -1 || distance[next.number] > distance[now.number] + next.weight)
                        distance[next.number] = distance[now.number] + next.weight;
                        pq.offer(new Node(next.number, distance[next.number]));
                }
            }
            
        }
    }
    static class Node implements Comparable<Node>{
        int number,weight;

        Node(int n, int w){
            this.number = n;
            this.weight = w;
        }

        @Override
        public int compareTo(Node n) {
            // TODO Auto-generated method stub
            return this.weight - n.weight;
        }

    }
}
