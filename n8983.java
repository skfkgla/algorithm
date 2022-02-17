package algorithm.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class n8983 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int list[];
    static int ani[][];
    static int count=0;
    public static void main(String[] args) throws IOException{
        StringTokenizer st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        int l = Integer.parseInt(st.nextToken());

        list = new int[m];
        ani = new int[n][2];

        st = new StringTokenizer(br.readLine());
        for(int i=0;i < m;i++){
            list[i] = Integer.parseInt(st.nextToken());
        }
        for(int i=0;i<n;i++){
            st = new StringTokenizer(br.readLine());
            ani[i][0] = Integer.parseInt(st.nextToken());
            ani[i][1] = Integer.parseInt(st.nextToken());
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(ani[i][1] <= l){
                   int x =Math.abs(list[j]-ani[i][0]);
                   if(x+ani[i][1]<= l){
                   count++;
                   j=m;
                   }
                }
            }
        }
        System.out.println(count);
    }
}
