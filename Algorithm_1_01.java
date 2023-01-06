package Algorithm_1;

import java.util.*;

public class Algorithm_1_01 {

	public static int solution(String str, char c) {
		int answer=0;
		str = str.toUpperCase();
		c = Character.toUpperCase(c);
		for(int i = 0; i<str.length(); i++) {
			if(str.charAt(i) == c)
				answer++;
		}
		return answer;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char c = sc.next().charAt(0);
		System.out.println(solution(str,c));
	}

}
