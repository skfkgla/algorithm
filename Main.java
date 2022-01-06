package algorithm.algorithm;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int K = scan.nextInt();
        int P, P1=0;
        ArrayList<Integer> num = new ArrayList<>();
        
        if(N <= 1) return;

        for(int i=N;2<=i;i--){  //2~N까지의 모든 정수 배열(코드리뷰시 질문: 뒤에서부터 찍힘)
            int j = 0;
            num.add(j,i);
            j++;
        }
        for(int i=0;K>i;){   //K번째까지 지우기
            P = num.get(0);
            P1 = P;
            // System.out.println(P+"바퀴수\n"); //테스트 주석
            num.remove(Integer.valueOf(P1));
            ++i;
            System.out.println(num.size());
            for(;P1 < num.get(num.size()-1) && K>i ;i++){
                P1 = P1+P;
                if(num.contains(P1)){
                num.remove(Integer.valueOf(P1));
                // System.out.println(num); //테스트 주석
                }
                else i--;
            }
            
        }
        System.out.println(P1);
        scan.close();
     }
}
