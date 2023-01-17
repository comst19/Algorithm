package Algorithm_3;

import java.util.Scanner;

public class Algorithm_3_05_2 {

	// 수학적 방법으로 풀기
	public static int solution(int n) {
		int answer = 0, cnt = 1;
		n--; // 연속은 2개부터 이므로 1을 미리 뻄
		while(n>0) {
			cnt++;
			n = n - cnt;
			if(n % cnt == 0) answer++;
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
