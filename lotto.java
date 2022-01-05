package algorithm;

import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class lotto {
    static int[] num=new int[10000];
    static int k;
	static int[] result=new int[10000];
    public static void main(String[] args) throws IOException{
 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			k = Integer.parseInt(st.nextToken());       //몇개의 숫자
            
            if(k == 0) break;
            
            for(int i = 0; i < k; i++) {
				num[i] = Integer.parseInt(st.nextToken());
			}
            combination(result, 0, k, 6, 0,num);
            System.out.println();
        }
    }   
    public static void combination(int[] arr, int index, int n, int r, int target, int[] arr2) { //조합

		if (r == 0) 
			print(arr,index); 
		else if (target == n) 
			return;
		else {
			arr[index] = arr2[target];
			
			combination(arr, index + 1, n, r - 1, target + 1, arr2);
			combination(arr, index, n, r, target + 1, arr2);
		}
	}
    public static void print(int[] arr, int length) {   //조합에 따른 출력
		for (int i = 0; i < length; i++) 
			System.out.print(arr[i] + " ");
		System.out.println(""); 
	}
}

