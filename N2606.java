package algorithm.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N2606 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int com = 0;
    static int edge = 0;
    static int[][] N = new int[com+1][com+1];
    static boolean[] mark = new boolean[com+1];
    static int count = 0;
    public static int dfs(int i){
        mark[i] = true;
        
        for(int j=1; j<=com; j++){
            if(N[i][j] ==1 && mark[j] != true){
                count++;
                dfs(j);
            }
        }

        return count;
    }
    public static void main(String[] args) throws NumberFormatException, IOException{
        com = Integer.parseInt(br.readLine());
        edge = Integer.parseInt(br.readLine());
        int a,b;
        N = new int[com+1][com+1];
        mark = new boolean[com+1];
        for(int i=0; edge>i; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            N[a][b] = N[b][a] = 1;
        }
        dfs(1);
        System.out.println(count);
    }
}
