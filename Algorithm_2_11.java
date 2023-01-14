package Algorithm_2;

import java.util.Scanner;

public class Algorithm_2_11 {
	
	public static int solution(int n, int[][] stu) {
		int answer=0;
		int max = Integer.MIN_VALUE;
		for(int i=1; i<=n; i++) {
			int cnt=0;
			for(int j=1; j<=n; j++) {
				for(int k=1; k<=5; k++) {
					if(stu[i][k] == stu[j][k]) {
						cnt++;
						break;
					}
				}
			}
			if(cnt>max) {
				max=cnt;
				answer=i;
			}
		}
		
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] stu = new int[n+1][6];
		for(int i=1; i<=n;i++) {
			for(int j=1; j<=5; j++) {
				stu[i][j] = sc.nextInt();
			}
		}
		System.out.println(solution(n, stu));
	}

}
