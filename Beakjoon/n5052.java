package algorithm.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class n5052 {
    static BufferedReader br = new BufferedReader(
        new InputStreamReader(System. in)
    );

    public static void main(String[] args) throws NumberFormatException, IOException {
        int t = Integer.parseInt(br.readLine());
        
        for(int i=0;i<t;i++){
        int n = Integer.parseInt(br.readLine());
        String[] arr = new String[n];
            for(int j=0;j < n;j++){
                arr[j] = br.readLine();
            }

            Arrays.sort(arr);

            if(search(arr,n)){
                System.out.println("NO");
            }
            else{
                System.out.println("YES");
            }
        }

        }

    static boolean search(String[] arr, int n){
        for(int i=1;i<n;i++){
            Boolean k = arr[i].startsWith(arr[i-1]);
            if(k == true){
                return true;
            }
        }
        return false;
    }
}

