package Algorithm_10;

import java.util.*;

public class Algorithm_10_05 {

	static int n,m;
	static int[] arr, dp;
	
	public static int solution() {
		Arrays.fill(dp, Integer.MAX_VALUE);
		dp[0] = 0;
		for(int i = 0; i < n; i++) {
			for(int j = arr[i]; j<=m; j++) {
				dp[j] = Math.min(dp[j], dp[j-arr[i]]+1);
			}
		}
		return dp[m];
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		arr = new int[n+1];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		m = sc.nextInt();
		dp = new int[m+1];
		System.out.println(solution());
	}

}
