package algorithm.algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class fibonacci2 {
    static int count0=0;
    static int count1=0;

    public static void fibonacci(int n){
            int temp1 = 0;
            int temp2 = 1;
            int result = 0;

            if(n==0){
                count0++;
                return;
            }
            if(n==1){
                count1++;
                return;
            }
            else{
                for(int i = 1 ; i < n ; i++) {
                    result = temp1 + temp2;
                    temp1 = temp2;
                    temp2 = result;
                }
                count0 = temp1;
                count1 = temp2;
            }
        }
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int num = 0;
        for(int i=0;T>i;i++){
            num = Integer.parseInt(br.readLine());
            fibonacci(num);
            bw.write(String.valueOf(count0)+" "+String.valueOf(count1)+"\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}