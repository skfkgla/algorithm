package algorithm.algorithm;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int count = scan.nextInt();

        long n1=0,n2=1, result=1;

        if(count == 0){
            System.out.println("0");
            return;
        }
        for(int i=1;count >= i;i++){
            if(count == i){
                System.out.println(result);
                return;
        }
            result = n1+n2;
            n1 = n2;
            n2 = result;
        }
    }   
}
