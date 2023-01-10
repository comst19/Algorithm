package Algorithm_2;

import java.util.Scanner;

public class Algorithm_2_02 {

	public static int solution(int n, int[] nums){
		int answer = 1;
		int max = nums[0];
		
		for(int i=1 ; i<n; i++) {
			if(nums[i]>max) {
				answer++;
				max = nums[i];
			}
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
		System.out.println(solution(n, nums));
	}

}
