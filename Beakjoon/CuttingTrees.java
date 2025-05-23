package algorithm.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CuttingTrees{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    public static void main(String[] args) throws IOException{
        StringTokenizer st = new StringTokenizer(br.readLine());


        int num1 = Integer.parseInt(st.nextToken());
        int num2 = Integer.parseInt(st.nextToken());
        int max = 1;

        int[] tree = new int[num1];
        st = new StringTokenizer(br.readLine());

        for(int i = 0; num1 > i ; i++){
            tree[i] = Integer.parseInt(st.nextToken());
            if(max < tree[i]){
                max = tree[i];
            }
        }
        int min= 0;
        int mid = 0;
        while(min < max){
            mid = (max+min)/2;
            long count = 0;
        for(int i=0; tree.length > i; i++){
            if((tree[i]-mid)>= 0){
            count += (tree[i]-mid);
            }       
            }
            if(count < num2){
                max = mid;
            }else{
                min=mid+1;
            }

        }
        System.out.println(max-1);
        br.close();
        } 
}
