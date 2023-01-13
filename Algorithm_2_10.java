package Algorithm_2;

import java.util.*;

public class Algorithm_2_10 {
	
	
	public static int solution(int n, int[][] nums) {
		int[] dx = {-1, 0, 1, 0};
		int[] dy = {0, 1, 0, -1};
		int answer = 0;
		for(int i=0; i<n; i++) {
			for(int j=0 ; j<n; j++) {
				boolean flag = true;
				for(int k=0; k<4; k++) {
					int nx = i+dx[k];
					int ny = j+dy[k];
					if(nx>=0 && nx < n && ny>= 0 && ny<n &&nums[nx][ny] >= nums[i][j]) {
						flag = false;
						break;
					}
				}
				if(flag) answer++;
			}
		}
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
