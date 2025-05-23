package algorithm.algorithm;

public class n10818 {
    public static void main(String[] args) {
		int N = 0;
		int[] x;
		
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		x = new int[N];
		
		for(int i=0; i<N;i++) {
			x[i] = sc.nextInt();
			}sc.close();
			Arrays.sort(x);
			System.out.println(x[0]+" "+x[N-1]);
		}
}
