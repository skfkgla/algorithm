package algorithm.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class n1992 {
    static int[][] image;
    static int n,k;

    private static void compress(int x, int y, int n){
        if(check(x,y,n)){
            System.out.print(k);
        }
        else{
            System.out.print("(");
            int s=n/2;
            for(int i=0;i<2;i++){
                for(int j=0;j<2;j++){
                    compress(x+s*i, y+s*j, s);
                }
            }
            System.out.print(")");
        }
    }
    private static boolean check(int x, int y, int n){
        int num = image[x][y];
        for(int i=x; i<x+n ;i++){
            for(int j=y;j<y+n ;j++){
                if(num != image[i][j]){
                    return false;
                }
            }
        }
        k = num;
        return true;
    }
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        n = Integer.parseInt(br.readLine());
        image = new int[n][n];
        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            for(int j=0; j < n ; j++){
                image[i][j] = Integer.valueOf(str.substring(j,j+1));
            }
        }
        compress(0,0,n);
    }
}
