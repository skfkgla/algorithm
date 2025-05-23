package algorithm;

import java.util.Scanner;

public class n1110 {
    public static void main(String[] args) {
		int y = 0;
		int z = 0;
		int x = 0;
		int N = 0;
		int i = 0;
		Scanner sc = new Scanner(System.in);
	
		x = sc.nextInt();
		y = x%10;//1의 자리추출
		z = x/10;//10의 자리추출
		while(true) {
			++i;
			N = (y*10)+((y+z)%10);
			y = N%10;//1의 자리추출
			z = N/10;//10의 자리추출
			if(x == N) {
			sc.close();
			break;
			}
		}
		System.out.println(i);
	}
}
