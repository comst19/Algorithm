package Algorithm_5;

import java.util.*;

public class Algorithm_5_05 {

	
	public static int solution(String str) {
		int answer = 0;
		Stack<Character> stack = new Stack<>();
		for(int i = 0; i<str.length(); i++) {
			if(str.charAt(i) == '(') stack.push('(');
			else {
				stack.pop();
				if(str.charAt(i-1) =='(') answer+=stack.size();
				else answer++;
			}
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
