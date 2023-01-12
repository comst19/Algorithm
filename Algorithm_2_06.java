package Algorithm_2;

import java.util.*;

public class Algorithm_2_06 {
	
	public static boolean isPrime(int num) {
		if(num == 1) return false;
		for(int i=2; i<num; i++) {
			if(num%i == 0) return false;
		}
		return true;
	}
	
	public static ArrayList<Integer> solution(int n, int[] nums) {
		ArrayList<Integer> answer = new ArrayList<>();
		for(int i=0; i<n; i++) {
			int tmp = nums[i];
			int res = 0;
			while(tmp > 0) {
				int t = tmp % 10;
				res = res*10 + t;
				tmp = tmp / 10;
			}
			if(isPrime(res)) answer.add(res);
		}

		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] nums = new int[n];
		for(int i = 0; i < n; i++) {
			nums[i] = sc.nextInt();
		}
		for(int x : solution(n,nums)) {
			System.out.print(x+" ");
		}
		
	}

}
