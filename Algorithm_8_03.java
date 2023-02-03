package Algorithm_8;

import java.util.*;

public class Algorithm_8_03 {
	static int answer = Integer.MIN_VALUE;
	static int n, m;
	
	public static void DFS(int L, int sum,int time, int[] score, int[] times) {
		if(time > m) return ;
		if(L == n) {
			answer = Math.max(answer, sum);
		}
		else {
			DFS(L+1, sum + score[L], time + times[L], score, times);
			DFS(L+1, sum, time, score, times);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		int[] score = new int[n];
		int[] times = new int[n];
		for(int i=0; i<n; i++) {
			score[i] = sc.nextInt();
			times[i] = sc.nextInt();
		}
		DFS(0,0,0,score,times);
		System.out.println(answer);
	}

}
