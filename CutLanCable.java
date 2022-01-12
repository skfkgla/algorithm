package algorithm.algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class CutLanCable {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    public static void main(String[] args) throws IOException{
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        long sum =0;
        long max = 1;
        int num1 = Integer.parseInt(st.nextToken());
        int num2 = Integer.parseInt(st.nextToken());

        int c=0;
        int[] LAN = new int[num1];
        
        while(num1 > c){
            LAN[c] = Integer.parseInt(br.readLine());
            if(max < LAN[c]){
                max = LAN[c];
            }
            c++;
        }
        max++;
        long min = 1;

        while(min <= max){
            sum = (max+min)/2;
            long count = 0;
        for(int i=0; LAN.length > i; i++){
            count += (LAN[i]/sum);        //나눴을때 랜선의 개수
            }
        if(count >= num2){
            min = sum+1;
        }
        else if(count < num2){
            max = sum-1;
        }
        }
        bw.write(String.valueOf((int)sum));

        bw.flush();
        bw.close();
        br.close();
        } 
    }

