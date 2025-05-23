package algorithm.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class n2156 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    public static void main(String[] args) throws NumberFormatException, IOException{
        int n = Integer.parseInt(br.readLine());
        int[] amount = new int[n+1];
        int[] dp = new int[n+1];
        for(int i=1; i<=n;i++){
            amount[i] = Integer.parseInt(br.readLine());
        }

        dp[1] = amount[1];

        if(n >= 2){
            dp[2] = amount[1]+amount[2];
        }
        for(int i=3;i<=n;i++){
            dp[i] = Math.max(Math.max(amount[i-1]+amount[i]+dp[i-3],amount[i]+dp[i-2]),dp[i-1]);
        }

        System.out.println(dp[n]);
    }
    
}
