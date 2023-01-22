package Algorithm_5;

import java.util.*;

public class Algorithm_5_04 {

	public static int solution(String str) {
		int answer=0;
		Stack<Integer> stack = new Stack<>();
		
		for(char c : str.toCharArray()) {
			if(Character.isDigit(c)) stack.push(c - '0');
			else {
				int rt = stack.pop();
				int lt = stack.pop();
				if(c=='+') stack.push(lt+rt);
				if(c=='-') stack.push(lt-rt);
				if(c=='*') stack.push(lt*rt);
				if(c=='/') stack.push(lt/rt);
			}
		}
		answer = stack.get(0);
		return answer;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(solution(str));
	}

}
