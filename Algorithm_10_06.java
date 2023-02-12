package Algorithm_10;

import java.util.*;

public class Algorithm_10_06 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] dp = new int[m+1];
		for(int i=0; i<n; i++) {
			int ps = sc.nextInt();
			int pt = sc.nextInt();
			for(int j=m; j>=pt; j--) {
				dp[j] = Math.max(dp[j], dp[j-pt] + ps);
			}
		}
		System.out.println(dp[m]);
	}

}
