package algorithm.algorithm;

import java.util.Scanner;

public class n2447 {
    static char[][] arr;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        arr= new char[N][N];

        square(0,0,N,false);

        StringBuilder sb = new StringBuilder();
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				sb.append(arr[i][j]);
			}
			sb.append('\n');
		}
		System.out.print(sb);
    }
    static void square(int x, int y, int size, boolean mark){
        if(mark){
            for(int i=x; i< x+size; i++){
                for(int j=y; j<y+size; j++){
                    arr[i][j]=' ';
                }
            }
            return;
        }

        if(size==1){
            arr[x][y] = '*';
            return;
        }

        int s = size/3;
        int count = 0;
        for(int i=x; i< x+size; i+=s){
            for(int j=y;j<y+size;j+=s){
                count++;
                if(count ==5){
                    square(i, j, s,true);
                }else{
                    square(i,j, s,false);
                }
            }
        }
    }
}
