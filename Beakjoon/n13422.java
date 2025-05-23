package algorithm.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class n13422 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException{
        int t;
        t = Integer.parseInt(br.readLine());
        int n,m,k;

        for(int i=0;i < t; i++){
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        int start = 0, end = m;
        int[] list = new int[n];
        int sum1=0;
        st = new StringTokenizer(br.readLine());
            for(int j=0;j<n;j++){
                list[j]=Integer.parseInt(st.nextToken());
                sum1 += list[j];
            }
        int result = 0;
        if(n == m){
            if(sum1 < k) System.out.println("1");
            else System.out.println("0");
        } else{
            int sum =0;
            for(int j=0; j< end; j++){
                sum += list[j];
            }
        
            while(start < n){       //start가 끝에 도달
                if(sum < k) result++;
                sum -= list[start];
                start++;
                sum += list[end%n];
                end++;
            }
            System.out.println(result);
        }

        }
    }
}

