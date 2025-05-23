package algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class n4344 {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cl = sc.nextInt();
		
		
		
		for(int i=0;i<cl;i++) {
			int x = 0;//학생들 수를 받는 for문
			int N = sc.nextInt();	//반에있는 학생들 수 N받기
			int[] grade = new int[N];	//각 성적
			double[] g = new double[N]; //
			Arrays.fill(grade,0);
			Arrays.fill(g,0);
			
			for(int j=0;j<N;j++) {	//학생들 수에 따른 성적을 받고 그에 총 합을 구함
				grade[j] = sc.nextInt();
				x= x + grade[j];
			}
			double student = x/N;
			double count=0;
			for(int j=0;j<N;j++) {	//학생들 성적을 받아 평균값을 구함 
				
				if(grade[j]>student) {
					count++;
				}
			}
			double z = (count/N)*100;
			System.out.println(String.format("%.3f%%", z));
		}
	}
}
