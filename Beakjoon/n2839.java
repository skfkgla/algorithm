package algorithm.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class n2839 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args)throws IOException{
		int N = Integer.parseInt(br.readLine());
		int[] dp = new int[N + 1];
        
        if(N == 4 || N == 7){       //4,7은 나누어 떨어지지 않음
            System.out.println(-1);
            return;
        }
		if (N >= 3)
			dp[3] = 1;      //3을 1로 초기화
		if (N >= 5)
			dp[5] = 1;      //5를 1로 초기화

        for (int i = 6; i <= N; i++) { 
			if (i % 5 == 0) {           //5로 먼저 나누어 떨어지는지 확인해야 15와같은 케이스에서 가장 작은 값 도출
				dp[i] = dp[i - 5] + 1;
			} else if (i % 3 == 0) {    //이후 3이 나누어 떨어지는지(6 또는 9)
				dp[i] = dp[i - 3] + 1;
			} else {                    // 둘이 합해야 나누어 떨어질 경우
				if (dp[i - 3] != 0 && dp[i - 5] != 0) {
					dp[i] = Math.min(dp[i - 3], dp[i - 5]) + 1;     
				}
			}
		}
		
        if (dp[N] == 0) {
			System.out.println("-1");
			return;
		}
		System.out.println(dp[N]);
	}

}
    

