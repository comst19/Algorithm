package Algorithm_8;

import java.util.*;

public class Algorithm_8_07 {

	static int[][] memo;
	
	public static int DFS(int n, int r) {
		if(memo[n][r] > 0) return memo[n][r];
		if(n==r || r==0) return 1;
		else return memo[n][r] = DFS(n-1, r-1) + DFS(n-1, r);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int r = sc.nextInt();
		memo = new int[n+1][n+1];
		System.out.println(DFS(n,r));
	}

}
