package Algorithm_1;

import java.util.*;

public class Algorithm_1_12 {
	
	public static String solution(int n, String str) {
		String answer="";
		for(int i=0; i<n; i++) {
			String tmp = str.substring(0,7).replace('#', '1').replace('*','0');
			int num = Integer.parseInt(tmp,2);
			answer+=(char)num;
			str = str.substring(7);
		}
		
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String str = sc.next();
		System.out.println(solution(n, str));
	}

}
