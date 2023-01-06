package Algorithm_1;

import java.util.*;

public class Algorithm_1_06 {

	public static String solution(String str) {
		String answer = "";
		for(int i=0; i<str.length(); i++) {
			if(str.indexOf(str.charAt(i)) == i)
				answer = answer + (str.charAt(i));
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(solution(str));
	}

}
