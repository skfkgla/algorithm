package algorithm.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class n16916 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int count=0;

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
    static int KMP(String text, String pattern){
        int pi[] = getpattern(pattern);
        int j=0;
        for(int i=0;i < text.length();i++){
            while(j>0 && text.charAt(i) != pattern.charAt(j)){
                j = pi[j-1];
            }
            if(text.charAt(i)==pattern.charAt(j)){
                if(j == pattern.length()-1){
                    count =1;
                    break;
                }
                j++;
            }
        }
        return count;
    }
    public static void main(String[] args) throws IOException{
        String text = br.readLine();
        String pattern = br.readLine();
        KMP(text,pattern);
        System.out.println(count);
    }
}
