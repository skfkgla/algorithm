package algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

public class TowerOfHanoi {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    static BigInteger ans = new BigInteger("2");

    public static void Hanoi(int n,int a, int b, int c) throws IOException{
        if(n ==1){
            bw.write(a+" "+ c+"\n");
            return;
        }
        Hanoi(n-1,a,c,b);       //n-1번째 를 A에서 B로

        bw.write(a+" "+c+"\n"); //n번째를 A에서 C로

        Hanoi(n-1,b,a,c);       //n-1번째를 B에서 C로 이동
    }
    public static void main(String[] args) throws IOException{

        int num = Integer.parseInt(br.readLine());      //원판 개수

        if(1 <= num && num <=100){
        ans = ans.pow(num).subtract(new BigInteger("1"));
        System.out.println(ans);
        if(num <= 20){
            Hanoi(num,1,2,3);
        }
    }

        bw.flush();
        bw.close();
        br.close();
    }
}