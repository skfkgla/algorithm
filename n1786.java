package algorithm.algorithm;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;

public class n1786 {
    static int num;
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int count=0;
    static StringBuffer sb = new StringBuffer();

    static int[] getpattern(String pattern){
        int[] pi = new int[pattern.length()];
        int j=0;

        for(int i=1;i<pattern.length();i++){
            while(j > 0 && pattern.charAt(i) != pattern.charAt(j)){
                j = pi[j-1];
            }
            if(pattern.charAt(i) == pattern.charAt(j)){
                pi[i] = ++j;
            }
        }
        return pi;
    }
    static void KMP(String text, String pattern){
        int pi[] = getpattern(pattern);
        int j=0;
        for(int i=0;i < text.length();i++){
            while(j>0 && text.charAt(i) != pattern.charAt(j)){
                j = pi[j-1];
            }
            if(text.charAt(i)==pattern.charAt(j)){
                if(j == pattern.length()-1){
                    count++;
                    sb.append(i-j+1+" ");
                    j=pi[j];
                }
                else{
                    j++;
                }
            }
        }
    }
    public static void main(String[] args) throws IOException{
        String text = br.readLine();
        String pattern = br.readLine();
        KMP(text,pattern);
        System.out.println(count);
        if(sb != null){
        System.out.print(sb.toString());
        }
    }
}

