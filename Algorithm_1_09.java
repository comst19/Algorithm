package Algorithm_1;

import java.util.*;

public class Algorithm_1_09 {

	public static int solution(String str) {
		String answer = "";
		for(char x : str.toCharArray()) {
			if(Character.isDigit(x)) {
				answer = answer + x;
			}
		}
		return Integer.parseInt(answer);
		
//		1. 방법
//		int answer = 0;
//		for(char x : str.toCharArray()) {
//			if(x>= 48 && x <= 57) {   // '0' ~ '9' -> 48 ~ 57
//				answer = answer*10 + (x-48);
//			}
//		}
//		return answer;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(solution(str));
	}

}
