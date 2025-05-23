package algorithm.algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.StringTokenizer;

public class n2776 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static HashSet<Integer> hash = new HashSet<>();

    private static void search() throws IOException{
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        for(int i=0; i<n;i++){
            hash.add(Integer.parseInt(st1.nextToken()));
        }
        int m = Integer.parseInt(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for(int i=0; i<m;i++){
            if(hash.contains(Integer.parseInt(st2.nextToken())))
                bw.write("1\n");
            else
                bw.write("0\n");
        }
    }
    public static void main(String[] args) throws IOException{
        int T = Integer.parseInt(br.readLine());
        for(int i=0;i<T;i++){
            hash.clear();
            search();
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
