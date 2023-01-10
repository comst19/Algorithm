package Algorithm_2;

import java.util.*;

public class Algorithm_2_01 {
	
	public static ArrayList<Integer> solution(int n, int[] nums){
		ArrayList<Integer> answer = new ArrayList<>();
		answer.add(nums[0]);
		for(int i = 1; i <n; i++) {
			if(nums[i] > nums[i-1])
				answer.add(nums[i]);
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
		for(int x : solution(n, nums)) {
			System.out.print(x + " ");
		}
	}

}
