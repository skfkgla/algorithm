package algorithm.algorithm;

import java.util.Scanner;

public class n8958 {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String array[] = new String[sc.nextInt()];
		
		for(int i=0;i<array.length;i++) {
			array[i] = sc.next();
		}					
		sc.close();
		for(int i = 0;i<array.length;i++) {
			int count=0; 	
			int point=0;
			for(int j=0;j<array[i].length();j++) {
				if(array[i].charAt(j)=='O') {
					count++;
				}
				else if(array[i].charAt(j)=='X') {
					count = 0;
				}
				point += count;
			}
			System.out.println(point);
		}

		}
}
