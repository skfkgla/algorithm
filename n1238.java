package algorithm.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class n1238 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static LinkedList<Node> list[];
    static int distance[][];
    static boolean visit[];
    static int party;

    public static void main(String[] args) throws IOException{
        int n,m;
        int max = 0;
        int c1;
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        party = Integer.parseInt(st.nextToken());

        list = new LinkedList[n+1];
        distance = new int[n+1][n+1];
        visit = new boolean[n+1];
        for(int i=1; i<= n;i++){
            list[i] = new LinkedList<>();
        }
        for(int i=1; i<= m; i++){
            st = new StringTokenizer(br.readLine());
            int v1 = Integer.parseInt(st.nextToken());
            int v2 = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            list[v1].add(new Node(v2, w));
        }
        for(int i =0; i<n+1;i++){
        Arrays.fill(distance[i], -1);
        }

        for(int i=1;i<=n;i++){
        dik(i);
        }
        for(int i=1; i <=n ;i++){
            c1 = distance[party][i]+distance[i][party];
            System.out.println(c1);
            if(max < c1){
                max = c1;
            }
        }
        //System.out.println(max);
    }
    static void dik(int x){
        PriorityQueue<Node> pq = new PriorityQueue<>();
        Arrays.fill(visit, false);
        distance[x][x] = 0;
        pq.offer(new Node(x, 0));

        while(!pq.isEmpty()){
            Node now = pq.poll();
            if(!visit[now.num]){
            visit[now.num] = true;
            for(Node next : list[now.num]){
                if(distance[next.num][x]==-1 || distance[next.num][x] > distance[now.num][x]+ next.weight){
                    distance[next.num][x] = distance[now.num][x] + next.weight;
                }
                pq.offer(new Node(next.num, distance[next.num][x]));
            }
        }
    }
}


    static class Node implements Comparable<Node>{
        int num, weight;
        Node(int num, int weight){
            this.num = num;
            this.weight = weight;
        }
        @Override
        public int compareTo(Node o) {
            // TODO Auto-generated method stub
            return num - o.num;
        }

    }
}
