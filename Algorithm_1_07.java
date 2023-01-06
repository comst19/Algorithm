package Algorithm_1;

import java.util.*;

public class Algorithm_1_07 {

	public static String solution(String str) {
		String answer = "NO";
		String tmp = new StringBuilder(str).reverse().toString();
		if(str.equalsIgnoreCase(tmp)) answer = "YES";
//      1. 첫 번째 방법
//			String answer = "YES";
//		str = str.toUpperCase();
//		int len = str.length();
//		for(int i=0; i<len/2; i++) {
//			if(str.charAt(i) != str.charAt(len-i-1)) {
//				answer = "NO";
//			}
//		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(solution(str));
	}

}
