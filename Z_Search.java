package algorithm.algorithm;

import java.util.Scanner;

public class Z_Search {
    static int count=0;

    public static void find(int N, int r, int c){
        if(N == 1){
            return;
        }
            if(r<(N/2) && c<(N/2)){        //1사분면
                find((N/2),r,c);
            }
            else if(r<(N/2) && c>=(N/2)){    //2사분면
                count+=(N*N)/4;
                find((N/2),r,c-(N/2));
            }
            else if(r>=(N/2) && c<(N/2)){    //3사분면
                count+=((N*N)/4)*2;
                find((N/2),r-(N/2),c);
            }
            else{    //4사분면
                count+=((N*N)/4)*3;
                find((N/2),r-(N/2),c-(N/2));
            }
    }
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt(); //크기
        int r = scan.nextInt(); //행
        int c = scan.nextInt(); //열

        N = (int)(Math.pow(2, N));    // 크기

        find(N,r,c);

        System.out.println(count);

    }
    
}
