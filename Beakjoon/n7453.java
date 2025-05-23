package algorithm.algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class n7453 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws Exception {
        int n = Integer.parseInt(br.readLine());

        int[][] arr = new int[n][4];
        long[] AB = new long[n*n];  //A+B
        long[] CD = new long[n*n];  //C+D
        long count=0;
        StringTokenizer st;

        for(int i=0; i < n; i++){                       //n (1)
            st = new StringTokenizer(br.readLine());

            arr[i][0]=Integer.parseInt(st.nextToken());
            arr[i][1]=Integer.parseInt(st.nextToken());
            arr[i][2]=Integer.parseInt(st.nextToken());
            arr[i][3]=Integer.parseInt(st.nextToken());
        }
        int idx =0;
        for(int i=0; i< n; i++){                //n^2   (2)
            for(int j = 0;j<n;j++){
                AB[idx] = arr[i][0]+arr[j][1];
                CD[idx] = arr[i][2]+arr[j][3];
                idx++;
            }
        }
        Arrays.sort(AB);        //2*n^2 log n^2   (3)
		Arrays.sort(CD);        

        int leftIndex = 0;  //처음 인덱스
        int rightIndex = n*n-1; //인덱스 끝

        while(leftIndex <= (n*n-1) && rightIndex>=0){    //AB인덱스가 끝에 도달하고, CD인덱스가 0처음에 도달하면
            long left_val = AB[leftIndex];              //n^2   (4)
            long right_val = CD[rightIndex];

            if(left_val + right_val==0){        //A+B와 C+D의 값이 0이면
                long left_count= 0;

                while(leftIndex < AB.length && AB[leftIndex]==left_val){    //AB의 오른쪽 인덱스값이 같은지 확인하고 count
                    left_count++;                                         
                    leftIndex++;            
                }
                long right_count = 0;

                while(rightIndex >= 0 && CD[rightIndex]== right_val){       //CD의 왼쪽 인덱스값이 같은지 확인하고 count
                    right_count++;                                     
                    rightIndex--;
                }
                count += right_count * left_count;  //중복된 값을 조합하는 경우
            }
            if(left_val + right_val < 0){   //합이 0보다 작으면 AB의 인덱스를 1더해준다. 
                leftIndex++;                //왜냐면 AB는 인덱스 처음(가장 작은 값)에서부터 시작하기 때문에
            }
            if(left_val + right_val >0){    //합이 0보다 크면 CD의 인덱스를 1빼준다.
                rightIndex--;               //왜냐면 AB는 인덱스 끝(가장 큰 값)에서부터 시작하기 때문에
            }
        }
        System.out.println(count);
    }
}