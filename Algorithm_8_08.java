package Algorithm_8;

import java.util.*;

public class Algorithm_8_08 {
	
	static int[] b, p , ch;
	static int n, f;
	static boolean flag = false;
	static int[][] memo;

	public static int combi(int n, int r) {
		if(memo[n][r] > 0) return memo[n][r];
		if(n==r || r==0) return 1;
		else return memo[n][r] = combi(n-1, r-1) + combi(n-1, r);
	}
	
	public static void DFS(int L, int sum) {
		if(flag) return;
		if(sum > f) return;
		if(L == n) {
			if(sum == f) {
				for(int x : p) System.out.print(x + " ");
				flag = true;
			}
			
		}else {
			for(int i=1; i<=n; i++) {
				if(ch[i] == 0) {
					ch[i] = 1;
					p[L] = i;
					DFS(L+1, sum+p[L]*b[L]);
					ch[i] = 0;
				}
			}
		}
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		f = sc.nextInt();
		b = new int[n];
		p = new int[n];
		ch = new int[n+1];
		memo = new int[n+1][n+1];
		for(int i = 0; i<n; i++) {
			b[i] = combi(n-1,i);
		}
		DFS(0,0);
	}

}
