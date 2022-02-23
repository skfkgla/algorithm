package algorithm.algorithm;

import java.util.Scanner;

public class n3052 {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int count = 0;

		
		int[] x = new int[10];
		int[] num = new int[10];
		
		for(int i = 0;i<10;i++) {
			x[i] = sc.nextInt();
			num[i] = x[i]%42;
		}
		for(int i=0; i<10;i++) {
			int temp = 0;
			for(int j=i+1; j<10; j++) {
				if(num[i] == num[j]) {
					temp++;
				}
			}
			if(temp == 0) {
				count++;
			}
		}
		System.out.println(count);
		}
}
