package Algorithm_10;

import java.util.*;

public class Algorithm_10_02 {

	static int n;
	static int[] dp;
	
	public static int solution(int n) {
		dp[1] = 1;
		dp[2] = 2;
		for(int i=3; i<=n; i++) dp[i] = dp[i-2] + dp[i-1];
		return dp[n];
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		dp = new int[n+2];
		System.out.println(solution(n+1));
	}

}
