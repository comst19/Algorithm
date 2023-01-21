package Algorithm_5;

import java.util.*;

public class Algorithm_5_02 {

	public static String solution(String str) {
		String answer = "";
		Stack<Character> stack = new Stack<>();
		
		for(char c : str.toCharArray()) {
			if(c==')') {
				while(stack.pop()!='(');
			}else {
				stack.push(c);
			}
		}
		for(int i = 0; i < stack.size(); i++) answer+=stack.get(i);
		
		return answer;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(solution(str));
	}

}
