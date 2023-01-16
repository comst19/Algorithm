package Algorithm_3;

import java.util.*;

public class Algorithm_3_03 {

	public static int solution(int n, int m, int[] arr) {
		int answer = Integer.MIN_VALUE;
		int sum = 0;
		for(int i=0; i<m; i++) sum+=arr[i];
		answer = sum;
		for(int i=m; i<n ; i++) {
			sum = sum + arr[i] - arr[i-m];
			answer = Math.max(answer, sum);
		}
		return answer;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0; i< n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(solution(n,m,arr));
	}

}
