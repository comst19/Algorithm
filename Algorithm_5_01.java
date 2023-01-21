package Algorithm_5;

import java.util.*;

public class Algorithm_5_01 {

	public static String solution(String str) {
		String answer = "YES";
		Stack<Character> stack = new Stack<>();
		for(char c : str.toCharArray()) {
			if(c=='(') stack.push(c);
			else{
				if(stack.isEmpty()) return "NO";
				stack.pop();
			}
		}
		if(!stack.isEmpty()) return "NO";
		return answer;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(solution(str));
	}

}
