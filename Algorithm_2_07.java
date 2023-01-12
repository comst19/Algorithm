package Algorithm_2;

import java.util.*;

public class Algorithm_2_07 {

	public static int solution(int n, int[] nums) {
		int answer = 0;
		int cnt = 0;
		for(int i=0; i<n; i++) {
			if(nums[i] == 1) {
				cnt+=1;
				answer+=cnt;
			}
			else cnt=0;
		}
		return answer;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] nums = new int[n];
		
		for(int i=0; i<n; i++) {
			nums[i] = sc.nextInt();
		}
		System.out.println(solution(n,nums));
	}

}
