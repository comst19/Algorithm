package Algorithm_2;

import java.util.*;

public class Algorithm_2_04 {
	
	public static int solution(int n) {
		int answer = 0;
		int[] nums = new int[n+1];
		for(int i=2; i<=n; i++) {
			if(nums[i] == 0) {
				answer++;
				for(int j=i ; j<=n ; j=j+i) nums[j] = 1;
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(solution(n));
	}

}
