package Algorithm_10;

import java.util.*;

public class Algorithm_10_03 {

	static int n;
	static int[] arr, dp;
	
	public static int solution() {
		int answer = 0;
		for(int i=1; i<n; i++) {
			int max = 0;
			for(int j = i-1; j >= 0; j--) {
				if(arr[j] < arr[i] && dp[j] > max) max = dp[j];
			}
			dp[i] = max + 1;
			answer = Math.max(answer, dp[i]);
		}
		return answer;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		arr = new int[n];
		dp = new int[n];
		dp[0] = 1;
		for(int i=0; i<n; i++) arr[i] = sc.nextInt();
		System.out.println(solution());
	}

}
