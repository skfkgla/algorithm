package algorithm.algorithm;

import java.util.Scanner;

public class n2577 {
    public static void main(String[] args) {
		
		int one = 0,two = 0,three = 0,four = 0,five = 0,six = 0,seven = 0,eight = 0,nine = 0,zero = 0;
		
		Scanner sc = new Scanner(System.in);
		
		int count = 0;
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int num = A*B*C;					//곱한 숫자
		int k = (int)( Math.log10(num)+1 );//숫자의 길이
		
		int[] x = new int[k];		//숫자 길이만큼 배열 생성
		
		while(num>0) {			
		x[count]= num%10;	//배열에 자릿수별로 자르기
		num /= 10;	
		count++;			//
		}
		
		for(int i=0; i<x.length;i++) {
			if(x[i] == 0) {
				zero++;
			}
			else if(x[i]==1) {
				one++;
			}
			else if(x[i]==2) {
				two++;
			}else if(x[i]==3) {
				three++;
			}else if(x[i]==4) {
				four++;
			}else if(x[i]==5) {
				five++;
			}else if(x[i]==6) {
				six++;
			}else if(x[i]==7) {
				seven++;
			}else if(x[i]==8) {
				eight++;
			}else if(x[i]==9) {
				nine++;
			}
			}sc.close();
			System.out.println(zero);
			System.out.println(one);
			System.out.println(two);
			System.out.println(three);
			System.out.println(four);
			System.out.println(five);
			System.out.println(six);
			System.out.println(seven);
			System.out.println(eight);
			System.out.println(nine);	
		}
}
