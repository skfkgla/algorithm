package algorithm.algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class n1520 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int x,y;
    static int[][] map;
    static int[][] dp;
    public static void main(String[] args) throws IOException{
        StringTokenizer st = new StringTokenizer(br.readLine());
        x = Integer.parseInt(st.nextToken());
        y = Integer.parseInt(st.nextToken());

        map = new int[x][y];
        dp =new int[x][y];

        for(int i =0;i<x;i++){
            st = new StringTokenizer(br.readLine());
            for(int j =0;j<y;j++){
                map[i][j] = Integer.parseInt(st.nextToken());
                dp[i][j] = -1;
            }
        }


        bw.write(String.valueOf(search(0,0)));
        bw.flush();
    }
    public static int search(int row,int column){
        if(row == x-1 && column == y-1){
            return 1;
        }
        if(dp[row][column] == -1){
            dp[row][column] = 0;
            //상
            if(column > 0 && map[row][column] > map[row][column-1]){
                dp[row][column] += search(row,column-1);
            }
            //하
            if(column < y-1 && map[row][column] > map[row][column+1]){
                dp[row][column] += search(row,column+1);
            }
            //좌
            if(row > 0 && map[row][column] > map[row-1][column]){
                dp[row][column] += search(row-1,column);
            }
            //우
            if(row < x-1 && map[row][column] > map[row+1][column]){
                dp[row][column] += search(row+1,column);
            }
        }

        return dp[row][column];
    }
    
}
