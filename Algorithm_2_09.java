package Algorithm_2;

import java.util.*;

public class Algorithm_2_09 {
	
	public static int solution(int n, int[][] nums) {
		int answer = Integer.MIN_VALUE;
		int sum1, sum2;
		int sum3 = 0, sum4 = 0;
		for(int i=0; i<n; i++) {
			sum1=sum2=0;
			for(int j=0; j<n; j++) {
				sum1+= nums[i][j];
				sum2+= nums[j][i];
				if(i == j) sum3+=nums[i][j];
			}
			sum4+=nums[n-1-i][i];
			answer = Math.max(answer, sum1);
			answer = Math.max(answer, sum2);
		}
		answer = Math.max(answer, sum3);
		answer = Math.max(answer, sum4);
		
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] nums = new int[n][n];
		for(int i=0; i<n;i++) {
			for(int j=0; j<n; j++) {
				nums[i][j] = sc.nextInt();
			}
		}
		System.out.println(solution(n, nums));
	}

}
