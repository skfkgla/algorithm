package algorithm.algorithm;

import java.util.Scanner;

public class n1254_palindrome{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        int count = 0;
        StringBuffer sb = new StringBuffer();
        String str1="";
        String str2=str;
        if(str.length()==1){
            System.out.println(1);
            return;
        }
        if(str.length()==2){
            if(str.charAt(0) == str.charAt(1)){
                System.out.println(2);
                return;
            }
        }
        for(int i=0;i<str.length();i++){
            for(int j=0;j<str2.length();j++){
                if(str2.charAt(j) == str2.charAt(str2.length()-(j+1))){
                    if(j == str2.length()/2){
                        System.out.println(str2.length());
                        return;
                    }
                }else
                    break;
            }
            str1 += str.charAt(i);
            sb = new StringBuffer(str1);
            str2 = str+(sb.reverse().toString());
        }
    }
}