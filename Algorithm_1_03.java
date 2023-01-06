package Algorithm_1;

import java.util.*;

public class Algorithm_1_03 {

	public static String solution(String str) {
		String answer = "";
		int m = Integer.MIN_VALUE;
		String[] s=str.split(" ");
		for(String s1 : s) {
			if(s1.length() > m) {
				m = s1.length();
				answer = s1;
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(solution(str));
	}

}
