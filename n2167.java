package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class n2167 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int[][] arr;
    public static void main(String[] args) throws IOException{
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        arr = new int[n+1][m+1];
        for(int i=1;i<=n;i++){
            st = new StringTokenizer(br.readLine());
            for(int j=1;j<=m;j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
                //System.out.println("("+i+","+j+")"+arr[i][j]); 
            }
        }
        int k = Integer.parseInt(br.readLine());
        int i;
        int j;
        int x;
        int y;
        StringBuilder sb = new StringBuilder();
        for(int l=0;l<k;l++){
            int sum=0;
            st = new StringTokenizer(br.readLine());
            i = Integer.parseInt(st.nextToken());
            j = Integer.parseInt(st.nextToken());
            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());

            for(;i<=x;i++){
                for(int w=j;w<=y;w++){
                    sum= sum+arr[i][w];

                }
            }
            sb.append(sum).append("\n");
        }
        System.out.println(sb.toString());
    }
    
}
