package algorithm.algorithm;

import java.util.Scanner;

public class n1546 {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num = 0;
		int x = 0;
		double max= 0;
		double n = 0;
		x = sc.nextInt();
		double[] gr = new double[x];
		
		for(int i=0;i<x;i++) {
			gr[i] = sc.nextDouble();
			if(max<gr[i]) {
				max = gr[i];
			}
		}

		for(int i =0; i<x; i++) {
			gr[i] = (gr[i]/max)*100;
			n=n+gr[i];
		}
		num = n/x;
		System.out.println(num);
		}
}
