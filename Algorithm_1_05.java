package Algorithm_1;

import java.util.*;

public class Algorithm_1_05 {

	public static String solution(String str) {
		String answer;
		char[] s = str.toCharArray();
		int lt = 0;
		int rt = str.length() - 1;
		while(lt < rt) {
			if(!Character.isAlphabetic(s[lt])) lt++;
			else if (!Character.isAlphabetic(s[rt])) rt--;
			else {
				char tmp = s[lt];
				s[lt] = s[rt];
				s[rt] = tmp;
				lt++;
				rt--;
			}
		}
		answer = String.valueOf(s);
		
		
		return answer;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(solution(str));
	}

}
