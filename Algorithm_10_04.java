package Algorithm_10;

import java.util.*;

class Brick implements Comparable<Brick>{
	public int s, h, w;
	Brick(int s, int h, int w){
		this.s = s;
		this.h = h;
		this.w = w;
	}
	@Override
	public int compareTo(Brick o) {
		// TODO Auto-generated method stub
		return o.s - this.s;
	}
}

public class Algorithm_10_04 {

	static int n;
	static int[] dp;
	static ArrayList<Brick> arr = new ArrayList<>();
	
	public static int solution() {
		Collections.sort(arr);
		int answer = 0;
		dp[0] = arr.get(0).h;
		answer = dp[0];
		for(int i = 1; i < n; i++) {
			int max_h = 0;
			for(int j = i-1; j >= 0; j--) {
				if(arr.get(j).w > arr.get(i).w && dp[j] > max_h) {
					max_h = dp[j];
				}
			}
			dp[i] = max_h + arr.get(i).h;
			answer = Math.max(answer, dp[i]);
		}
		return answer;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		dp = new int[n];
		for(int i = 0; i < n; i++) {
			int s = sc.nextInt();
			int h = sc.nextInt();
			int w = sc.nextInt();
			arr.add(new Brick(s,h,w));
		}
		
		System.out.println(solution());
	}

}
