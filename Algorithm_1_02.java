package Algorithm_1;

import java.util.*;

public class Algorithm_1_02 {

	public static String solution(String str) { // A ~ Z == 65~90, a ~ z == 97 ~ 122
		String answer = "";
		for(char c : str.toCharArray()) {
			if(Character.isLowerCase(c))
				answer = answer + Character.toUpperCase(c);
			else
				answer = answer + Character.toLowerCase(c);
				
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
