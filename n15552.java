package algorithm.algorithm;

import java.io.*;
import java.util.*;

public class n15552
{
	public static void main (String[] args) throws IOException
	{
        
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int i = Integer.parseInt(bf.readLine());
        
        for(;i >= 1; i--){
            st = new StringTokenizer(bf.readLine());
            
            int x = Integer.parseInt(st.nextToken()); //첫번째 호출
            int y = Integer.parseInt(st.nextToken());
            
            int z = x+y;
            bw.write(z+"\n");
        }
        bw.close();
    }
}