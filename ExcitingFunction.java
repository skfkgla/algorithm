package algorithm.algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class ExcitingFunction {
    static int[][][] dp =new int[100][100][100];
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    
    static int w(int a, int b, int c) {
        if(dp[a][b][c]!=0){
            return dp[a][b][c];
        }
        if(a <= 0 || b <= 0 || c <= 0) {
            return dp[a][b][c]=1;
        }
        if(a > 20 || b > 20 || c > 20) {
                dp[a][b][c] = w(20, 20, 20);
                return dp[a][b][c];
        }
        if(a < b && b < c) {
            dp[a][b][c-1] = w(a, b, c - 1);
            dp[a][b-1][c-1]=w(a, b - 1, c - 1);
            dp[a][b-1][c] = w(a, b - 1, c);

            return dp[a][b][c-1] + dp[a][b][c-1] - dp[a][b][c-1];
        }
        dp[a-1][b][c]=w(a - 1, b, c);
        dp[a-1][b-1][c]=w(a - 1, b - 1, c);
        dp[a-1][b][c-1]=w(a - 1, b, c - 1);
        dp[a-1][b-1][c-1]=w(a - 1, b - 1, c - 1);
        return dp[a-1][b][c] + dp[a-1][b-1][c] + dp[a-1][b][c-1] - dp[a-1][b-1][c-1];
    }
    public static void main(String[] args) throws Exception {
        int k;
        int[] num= new int[3];
        
        while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
            
            for(int i = 0; i < 3; i++) {
				num[i] = Integer.parseInt(st.nextToken());
			}
            if(num[0]==-1 && num[1]==-1&&num[2] == -1){
                break;
            }
            if(num[0]<0 || num[1]<0||num[2]< 0){
                k=1;
            }else
            k=w(num[0],num[1],num[2]);

            bw.write("w("+num[0]+", "+num[1]+", "+num[2]+") = "+k+"\n");
    }
    bw.flush();
    bw.close();
    br.close();
}
}
