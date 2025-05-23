package algorithm.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class firefly{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException{
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int H = Integer.parseInt(st.nextToken());

        int[] suck = new int[H+2];
        int[] jong = new int[H+2];

        for(int i=0;(N/2)>i;i++){
            suck[Integer.parseInt(br.readLine())]++;
            jong[H - Integer.parseInt(br.readLine()) + 1]++;
        }
        for(int i =1; H>=i;i++){
            suck[i] += suck[i-1];
        }
        for(int i =H; 1<=i;i--){
            jong[i] += jong[i+1];
        }
        int min = N;
        int count = 0;
        
        for(int i=1;H>=i;i++){
            int sum = (suck[H]-suck[i-1])+(jong[1]-jong[i+1]);

            if(sum < min){
                min = sum;
                count=1;
            }
            else if(min == sum)
                count++;
            
        }
        System.out.println(min+" "+count);
        br.close();
    }
}