package algorithm.algorithm;

import java.util.Scanner;

public class n2562 {
    public static void main(String[] args) {
		int[] x;
		int max = 0, num = 0;
		
		Scanner sc = new Scanner(System.in);
		x = new int[9];
		
		for(int i=0; i<9;i++) {
			x[i] = sc.nextInt();
			if(max<x[i]) {
				max = x[i];
				num = i+1;
				}
			
			}
			System.out.println(max+"\n"+num);
		}
    
}
