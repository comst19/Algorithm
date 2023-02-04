package Algorithm_8;

import java.util.*;

public class Algorithm_8_05 {

	static int n, m, answer = Integer.MAX_VALUE;
	
	public static void DFS(int cnt, int sum, Integer[] arr) {
		if(sum > m) return;
		if(cnt>=answer) return;
		if(sum == m) {
			answer = Math.min(cnt, answer);
		}else {
			for(int c : arr) {
				DFS(cnt+1, sum+c, arr);
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		Integer[] arr = new Integer[n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr, Collections.reverseOrder()); // 시간 절약
		m = sc.nextInt();
		DFS(0,0,arr);
		System.out.println(answer);
	}

}
