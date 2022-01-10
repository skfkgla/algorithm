package algorithm.algorithm;

import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;


public class FibonacciExpansion {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 

    public static void main(String[] args) throws NumberFormatException, IOException{

        long count=Integer.parseInt(br.readLine());

        long n1=0,n2=1, result=1;

        if(count == 0){
            System.out.println("0\n0");
            return;
        }
        if(count > 0){
            System.out.println("1");
        }
        if(count <0 && (Math.abs(count)%2) == 0){
            System.out.println("-1");
            count=Math.abs(count);
        }else if(count <0){
            System.out.println("1");
            count=Math.abs(count);
        }
        for(int i=1;count >= i;i++){
            if(count == i){
                System.out.println(result);
                return;
        }
            result = (n1+n2)%1000000000;
            n1 = (n2%1000000000);
            n2 = result;
        }
        br.close();
    }
    
}
